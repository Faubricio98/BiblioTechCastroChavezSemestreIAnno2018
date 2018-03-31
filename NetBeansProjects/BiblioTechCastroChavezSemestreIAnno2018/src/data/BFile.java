
package data;

import domain.Books;
import domain.MaterialBook;
import domain.DigitalBook;
import GUI.InterfaceBO;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class BFile {
    //atributos
    private RandomAccessFile randomAF;
    private int regsSize;
    private int regsQuantity;
    private String myPath;
    
    
    public BFile(File file)throws IOException{
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
    //ingresar datos en lugar específico para libros fisico
    public boolean putValueForMaterialBook(int position, MaterialBook mat) throws IOException{
        //verificar que la insercion sea válida
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1. Position out of bounds");
            return false;
        }else{
            //validamos el tamaño del nuevo registro
            if(mat.sizeInBytes()>this.regsSize){
                System.err.println("2. Size out of bounds");
                return false;
            }else{
                randomAF.seek(position*regsSize);
                atributesDefault(mat);
                randomAF.writeUTF(mat.getCover());
                randomAF.writeInt(mat.getSheets());
                //retornamos función verdadera
                return true;
            }//valida el tamaño del registro
        }//inserción válida
    }//fin método
    //ingresar datos en lugar específico para laptop
    public boolean putValueForDigitalBook(int position, DigitalBook dig) throws IOException{
        //verificar que la insercion sea válida
        if(position < 0 && position > this.regsQuantity){
            System.err.println("1. Position out of bounds");
            return false;
        }else{
            //validamos el tamaño del nuevo registro
            if(dig.sizeInBytes()>this.regsSize){
                System.err.println("2. Size out of bounds");
                return false;
            }else{
                randomAF.seek(position*regsSize);
                atributesDefault(dig);
                randomAF.writeUTF(dig.getFormat());
                randomAF.writeFloat(dig.getStorage());
                //retornamos función verdadera
                return true;
            }//valida el tamaño del registro
        }//inserción válida
    }//fin método
    //escritura de atributos por defecto
    public void atributesDefault(Books bo) throws IOException{
        randomAF.writeUTF(bo.getType());
        randomAF.writeUTF(bo.getTitle());
        randomAF.writeUTF(bo.getAuthor());
        randomAF.writeInt(bo.getYear());
        randomAF.writeInt(bo.getIsbn());
    }//fin atributesDefault
    
    //se agrega un nuevo registro al final del file para cada dispositivo
    public boolean addEndRecordMaterialBook(MaterialBook mat)throws IOException{
        boolean success=putValueForMaterialBook(this.regsQuantity, mat);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }
    //se agrega un nuevo registro al final del file para cada dispositivo
    public boolean addEndRecordDigitalBook(DigitalBook dig)throws IOException{
        boolean success=putValueForDigitalBook(this.regsQuantity, dig);
        if(success){
            ++this.regsQuantity;
        }
        return success;
    }
}//end class
