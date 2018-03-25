/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author faubricioch
 */
public class Laptop extends Audiovisuales{
    
    private String operativeSys;

    public Laptop() {
        super();
        this.operativeSys="";
    }

    public Laptop(String operativeSys, String dispositive, String brand, int registerNumber, boolean condition, String entryDate, boolean availability) {
        super(dispositive, brand, registerNumber, condition, entryDate, availability);
        this.operativeSys = operativeSys;
    }

    public String getOperativeSys() {
        return operativeSys;
    }

    public void setOperativeSys(String operativeSys) {
        this.operativeSys = operativeSys;
    }

    @Override
    public String toString() {
        return super.toString()+" Laptop{" + "operativeSys=" + operativeSys + '}';
    }
    
    
}
