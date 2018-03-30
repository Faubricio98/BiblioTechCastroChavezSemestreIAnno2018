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
public class Cds extends Audiovisuales{
    
    private String contentInfo;

    public Cds() {
        super();
        this.contentInfo="";
    }

    public Cds(String contentInfo, String dispositive, String brand, int registerNumber, boolean condition, String entryDate, boolean availability) {
        super(dispositive, brand, registerNumber, condition, entryDate, availability);
        this.contentInfo = contentInfo;
    }

    public String getContentInfo() {
        return contentInfo;
    }

    public void setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
    }

    @Override
    public String toString() {
        return super.toString()+" Cd's{" + "contentInfo=" + contentInfo + '}';
    }
    
    public int sizeInBytes(){
        return super.sizeInBytes()+getContentInfo().length()*2;
    }
}
