/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Audiovisuales;
import domain.Cds;
import domain.Dvds;
import domain.Laptop;
import domain.Parlantes;
import domain.Proyector;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author faubricioch
 */
public class AvFile{
    //atributos
    private RandomAccessFile randomAF;
    private int regsSize;
    private int regsQuantity;
    private String myPath;
    
    
    public AvFile(File file)throws IOException{
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
    
    //MUY IMPORTANTE cerrar nuestros archivos
    public void close() throws IOException{
        randomAF.close();
    }
    
    //indicar la cantidad de registros de nuestro archivo
    public int fileSize(){
        return this.regsQuantity;
    }
    
    //ingresar datos en lugar específico para laptop
    public boolean putValueForLaptop(int position, Laptop aud) throws IOException{
        //verificar que la insercion sea válida
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1. Position out of bounds");
            return false;
        }else{
            //validamos el tamaño del nuevo registro
            if(aud.sizeInBytes()>this.regsSize){
                System.err.println("2. Size out of bounds");
                return false;
            }else{
                randomAF.seek(position*regsSize);
                defaultAtributes(aud);
                randomAF.writeUTF(aud.getOperativeSys());
                //retornamos función verdadera
                return true;
            }//valida el tamaño del registro
        }//inserción válida
    }//fin método
    
    //ingresar datos en lugar específico para proyector
    public boolean putValueForProyector(int position, Proyector aud) throws IOException{
        //verificar que la insercion sea válida
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1. Position out of bounds");
            return false;
        }else{
            //validamos el tamaño del nuevo registro
            if(aud.sizeInBytes()>this.regsSize){
                System.err.println("2. Size out of bounds");
                return false;
            }else{
                randomAF.seek(position*regsSize);
                defaultAtributes(aud);
                randomAF.writeBoolean(aud.isWireless());
                //retornamos función verdadera
                return true;
            }//valida el tamaño del registro
        }//inserción válida
    }//fin método
    
    //ingresar datos en lugar específico para parlantes
    public boolean putValueForParlantes(int position, Parlantes aud) throws IOException{
        //verificar que la insercion sea válida
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1. Position out of bounds");
            return false;
        }else{
            //validamos el tamaño del nuevo registro
            if(aud.sizeInBytes()>this.regsSize){
                System.err.println("2. Size out of bounds");
                return false;
            }else{
                randomAF.seek(position*regsSize);
                defaultAtributes(aud);
                randomAF.writeBoolean(aud.isBluethoot());
                //retornamos función verdadera
                return true;
            }//valida el tamaño del registro
        }//inserción válida
    }//fin método
    
    //ingresar datos en lugar específico para Cds
    public boolean putValueForCds(int position, Cds aud) throws IOException{
        //verificar que la insercion sea válida
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1. Position out of bounds");
            return false;
        }else{
            //validamos el tamaño del nuevo registro
            if(aud.sizeInBytes()>this.regsSize){
                System.err.println("2. Size out of bounds");
                return false;
            }else{
                randomAF.seek(position*regsSize);
                defaultAtributes(aud);
                randomAF.writeUTF(aud.getContentInfo());
                //retornamos función verdadera
                return true;
            }//valida el tamaño del registro
        }//inserción válida
    }//fin método
    
    //ingresar datos en lugar específico para Cds
    public boolean putValueForDvd(int position, Dvds aud) throws IOException{
        //verificar que la insercion sea válida
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1. Position out of bounds");
            return false;
        }else{
            //validamos el tamaño del nuevo registro
            if(aud.sizeInBytes()>this.regsSize){
                System.err.println("2. Size out of bounds");
                return false;
            }else{
                randomAF.seek(position*regsSize);
                defaultAtributes(aud);
                randomAF.writeUTF(aud.getContentInfo());
                //retornamos función verdadera
                return true;
            }//valida el tamaño del registro
        }//inserción válida
    }//fin método
    
    //escritura de atributos por defecto
    public void defaultAtributes(Audiovisuales aud) throws IOException{
        randomAF.writeUTF(aud.getDispositive());
        randomAF.writeUTF(aud.getBrand());
        randomAF.writeInt(aud.getRegisterNumber());
        randomAF.writeBoolean(aud.isCondition());
        randomAF.writeUTF(aud.getEntryDate());
        randomAF.writeBoolean(aud.isAvailability());
    }//fin defaultAtributes
    
    //se agrega un nuevo registro al final del file para cada dispositivo
    public boolean addEndRecordLaptop(Laptop lap)throws IOException{
        boolean success=putValueForLaptop(this.regsQuantity, lap);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }

    public boolean addEndRecordProyector(Proyector pro) throws IOException{
        boolean success=putValueForProyector(this.regsQuantity, pro);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }

    public boolean addEndRecordParlantes(Parlantes par) throws IOException{
        boolean success=putValueForParlantes(this.regsQuantity, par);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }

    public boolean addEndRecordCds(Cds cds) throws IOException{
        boolean success=putValueForCds(this.regsQuantity, cds);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }

    public boolean addEndRecordDvd(Dvds dvds) throws IOException{
        boolean success=putValueForDvd(this.regsQuantity, dvds);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }
    
    
}//fin clase
