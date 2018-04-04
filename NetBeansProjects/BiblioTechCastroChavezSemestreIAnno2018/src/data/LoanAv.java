/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.LoanCAv;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author faubricioch
 */
public class LoanAv {
    //atributos
    private RandomAccessFile randomAF;
    private int regsSize;
    private int regsQuantity;
    private String myPath;
    
    public LoanAv(File file) throws IOException{
        //guardo ruta
        myPath=file.getPath();
        
        //tamaño máximo de los registros
        this.regsSize=85;
        
        //valido la existencia del file y si es un file
        if(file.exists() && !file.isFile()){
            throw new IOException(file.getName() + " es un archivo inválido");
        }else{
            //instanciamos el RAF
            randomAF=new RandomAccessFile(file, "rw");
            //cantidad de registros dentro del RAF
            this.regsQuantity=
                    (int)Math.ceil((double)randomAF.length() / (double)regsSize);
        }//valido existencia del file
    }//fin método
    
    public void close() throws IOException{
        randomAF.close();
    }
    
    //indicar la cantidad de registros de nuestro archivo
    public int fileSize(){
        return this.regsQuantity;
    }
    
    public boolean putValue(int position, LoanCAv loanCaV)throws IOException{
        //verificar que la insercion sea válida
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1-1. Position out of bounds");
            return false;
        }else{
            //validamos el tamaño del nuevo registro
            if(loanCaV.sizeInBytes()>this.regsSize){
                System.err.println("2-2. Size out of bounds");
                return false;
            }else{
                randomAF.seek(position*regsSize);
                randomAF.writeUTF(loanCaV.getDispositive());
                randomAF.writeUTF(loanCaV.getBrand());
                randomAF.writeBoolean(loanCaV.isCondition());
                randomAF.writeUTF(loanCaV.getLoanDate());
                randomAF.writeUTF(loanCaV.getBackLoanDate());
                randomAF.writeBoolean(loanCaV.isAvailability());
                randomAF.writeInt(loanCaV.getRegisterNumber());
                return true;
            }//valida el tamaño del registro
        }//inserción válida
    }//fin metodo
    
    public boolean addEndRecord(LoanCAv loan)throws IOException{
        boolean success=putValue(regsQuantity, loan);
        if(success){
            ++regsQuantity;
        }
        return success;
    }
    
    public LoanCAv getLoanByRegNumber(int registerNumber)throws IOException{
        LoanCAv loan=new LoanCAv();
        for(int i=0; i<this.regsQuantity; i++){
            randomAF.seek(i*regsSize);
            
            loan.setDispositive(randomAF.readUTF());
            loan.setBrand(randomAF.readUTF());
            loan.setCondition(randomAF.readBoolean());
            loan.setLoanDate(randomAF.readUTF());
            loan.setBackLoanDate(randomAF.readUTF());
            loan.setAvailability(randomAF.readBoolean());
            loan.setRegisterNumber(randomAF.readInt());
            
            if(loan.getRegisterNumber()!=registerNumber){
                //;
            }else{
                return loan;
            }
        }//fin for
        return loan;
    }
    
    public LoanCAv getLoan(int position)throws IOException{
        //validar la posici'on
        if(position >= 0 && position <= this.regsQuantity){//llevamos a cabo la lectura
            LoanCAv loan=new LoanCAv();
            randomAF.seek(position*regsSize);
            
            loan.setDispositive(randomAF.readUTF());
            loan.setBrand(randomAF.readUTF());
            loan.setCondition(randomAF.readBoolean());
            loan.setLoanDate(randomAF.readUTF());
            loan.setBackLoanDate(randomAF.readUTF());
            loan.setAvailability(randomAF.readBoolean());
            loan.setRegisterNumber(randomAF.readInt());
            
            if(loan.getRegisterNumber()==0){
                return null;
            }else{
                return loan;
            }
        }else{
            System.err.println("1003 - position is out of bounds");
            return null;
        }
    }//fin metodo
    
    public boolean deleteLoan(int regNumber)throws IOException{
        LoanCAv loan;
        for(int i=0; i<this.regsQuantity; i++){
            loan=this.getLoan(i);
            if(loan.getRegisterNumber()==regNumber){
                loan.setRegisterNumber(0);
                return putValue(i, loan);
            }
        }//fin for
        return false;
    }
}
