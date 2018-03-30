/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Student;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jonathan
 */
public class aStudent implements Serializable{
    //arrayList de estudiantes
    private ArrayList<Student> s;
    
    // Inicializamos el ArrayList dentro del constructor aStudent
    public aStudent()
    {
        s = new ArrayList();
    }
    //insertar el arrayList
    public void add(Student st){
        s.add(st);
    }
    
    //Metodo para devolver la posicion del objeto dentro del arrayList
    public Student getStudent(int i)
    {
        return s.get(i);
    }
    
    // Metodod devolver el tamaño del arrayList
    public int getSize()
    {
        return s.size();
    }
    
    //Metodo para buscar la posicion donde se encuentre el objeto dentro del arrayList
    public int search(String code)
    {
        int n = this.getSize();
        for(int p=0; p<n; p++)
        {
            if(code.equalsIgnoreCase(this.getStudent(p).getCarnet()))
            {
                return p;
            }
        }
        return -1;
    }
//    //metodo que especifica la posicion de la persona que se quieren agarrar los datos
//    public int posicionExacta(String code){
//        int n=0;
//        for(int p=0; p<this.getSize(); p++){
//            if(code.equalsIgnoreCase(this.getStudent(p).getCarnet())){
//                n=p;
//                break;
//            }
//        }
//        return n;
//    }
    
}
