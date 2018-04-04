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
    
    public Audiovisuales getAVByRegisterNumber(int registerNumber, int type)throws IOException{
        if(type==0){
            for(int i=0; i<this.regsQuantity; i++){
                Laptop myLaptop=new Laptop();
                randomAF.seek(i*this.regsSize);
                setDefaultAtributes(myLaptop);
                if(myLaptop.getRegisterNumber()==registerNumber){
                    myLaptop.setOperativeSys(randomAF.readUTF());
                    return myLaptop;
                }//if de validación de numero de registro
            }//fin for type 0
        }else{
            if(type==1){
                for(int i=0; i<this.regsQuantity; i++){
                    Proyector myProyector=new Proyector();
                    randomAF.seek(i*this.regsSize);
                    setDefaultAtributes(myProyector);
                    if(myProyector.getRegisterNumber()==registerNumber){
                        myProyector.setWireless(randomAF.readBoolean());
                        return myProyector;
                    }//if de validación de numero de registro
                }//fin for type 1
            }else{
                if(type==2){
                    for(int i=0; i<this.regsQuantity;i++){
                        Parlantes myParlantes=new Parlantes();
                        randomAF.seek(i*this.regsSize);
                        setDefaultAtributes(myParlantes);
                        if(myParlantes.getRegisterNumber()==registerNumber){
                            myParlantes.setBluethoot(randomAF.readBoolean());
                            return myParlantes;
                        }//fin if de validación
                    }//fin for type 2
                }else{
                    if(type==3){
                        for(int i=0; i<this.regsQuantity; i++){
                            Cds myCds=new Cds();
                            randomAF.seek(i*this.regsSize);
                            setDefaultAtributes(myCds);
                            if(myCds.getRegisterNumber()==registerNumber){
                                myCds.setContentInfo(randomAF.readUTF());
                                return myCds;
                            }//fin if de validación
                        }//fin for type 3
                    }else{
                        if(type==4){
                            for(int i=0; i<this.regsQuantity; i++){
                                Dvds myDvds=new Dvds();
                                randomAF.seek(i*this.regsSize);
                                setDefaultAtributes(myDvds);
                                if(myDvds.getRegisterNumber()==registerNumber){
                                    myDvds.setContentInfo(randomAF.readUTF());
                                    return myDvds;
                                }//fin if de validación
                            }//fin for type 3
                        }else{
                            return null;
                        }//if de type 4
                    }//if de type 3
                }//if de type 2
            }//if de type 1
        }//fin if type 0
        if(type>4){
            return null;
        }else{
            return null;
        }
    }
    
    public void setDefaultAtributes(Audiovisuales aud)throws IOException{
        aud.setDispositive(randomAF.readUTF());
        aud.setBrand(randomAF.readUTF());
        aud.setRegisterNumber(randomAF.readInt());
        aud.setCondition(randomAF.readBoolean());
        aud.setEntryDate(randomAF.readUTF());
        aud.setAvailability(randomAF.readBoolean());
    }
    
    public void setAvailability(int registerNumber, boolean availability, Audiovisuales aud, int type)throws IOException{
        Audiovisuales aud2=new Audiovisuales();
        System.out.println("Hi");
        if(type==0){
            Laptop lap;
            for(int i=0; i<this.regsQuantity; i++){
                aud2=this.getAudiovisual(i);
                if(aud2.getRegisterNumber()==registerNumber){
                    System.out.println("Dentro "+i);
                    aud.setAvailability(availability);
                    lap=(Laptop)aud;
                    putValueForLaptop(i, lap);
                }
            }
        }//fin if type 0
        if(type==1){
            Proyector pro;
            for(int i=0; i<this.regsQuantity; i++){
                aud2=this.getAudiovisual(i);
                if(aud2.getRegisterNumber()==registerNumber){
                    System.out.println("Dentro "+i);
                    aud.setAvailability(availability);
                    pro=(Proyector)aud;
                    putValueForProyector(i, pro);
                }
            }
        }//fin if type 1
        if(type==2){
            Parlantes par;
            for(int i=0; i<this.regsQuantity; i++){
                aud2=this.getAudiovisual(i);
                if(aud2.getRegisterNumber()==registerNumber){
                    System.out.println("Dentro "+i);
                    aud.setAvailability(availability);
                    par=(Parlantes)aud;
                    putValueForParlantes(i, par);
                }
            }
        }//fin if type 2
        if(type==3){
            Cds cds;
            for(int i=0; i<this.regsQuantity; i++){
                aud2=this.getAudiovisual(i);
                if(aud2.getRegisterNumber()==registerNumber){
                    System.out.println("Dentro "+i);
                    aud.setAvailability(availability);
                    cds=(Cds)aud;
                    putValueForCds(i, cds);
                }
            }
        }//fin if type 3
        if(type==4){
            Dvds dvds;
            for(int i=0; i<this.regsQuantity; i++){
                aud2=this.getAudiovisual(i);
                if(aud2.getRegisterNumber()==registerNumber){
                    System.out.println("Dentro "+i);
                    aud.setAvailability(availability);
                    dvds=(Dvds)aud;
                    putValueForDvd(i, dvds);
                }
            }
        }//fin if type 4
    }
    
    public Audiovisuales getAudiovisual(int position)throws IOException{
        //validar la posici'on
        if(position >= 0 && position <= this.regsQuantity){
            //colocamos el brazo en el lugar adecuado
            randomAF.seek(position * this.regsSize);
            //llevamos a cabo la lectura
            Audiovisuales aud = new Audiovisuales();
            setDefaultAtributes(aud);
            
            return aud;
        }else{
            System.err.println("1003 - position is out of bounds");
            return null;
        }
    }
    
}//fin clase
