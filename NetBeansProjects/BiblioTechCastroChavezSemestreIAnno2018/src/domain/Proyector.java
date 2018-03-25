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
public class Proyector extends Audiovisuales{
    
    private boolean wireless;

    public Proyector() {
        super();
        this.wireless=false;
    }

    public Proyector(boolean wireless, String dispositive, String brand, int registerNumber, boolean condition, String entryDate, boolean availability) {
        super(dispositive, brand, registerNumber, condition, entryDate, availability);
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString()+" Proyector{" + "wireless=" + wireless + '}';
    }
    
    
}
