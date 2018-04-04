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
public class Parlantes extends Audiovisuales{
    
    private boolean bluethoot;

    public Parlantes() {
        super();
        this.bluethoot=false;
    }

    public Parlantes(boolean bluethoot, String dispositive, String brand, int registerNumber, boolean condition, String entryDate, boolean availability) {
        super(dispositive, brand, registerNumber, condition, entryDate, availability);
        this.bluethoot = bluethoot;
    }

    public boolean isBluethoot() {
        return bluethoot;
    }

    public void setBluethoot(boolean bluethoot) {
        this.bluethoot = bluethoot;
    }

    @Override
    public String toString() {
        return super.toString()+" Parlantes{" + "bluethoot=" + bluethoot + '}';
    }
    
    public int sizeInBytes(){
        return super.sizeInBytes()+1;
    }
}
