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
public class Dvds extends Audiovisuales{
    private String contentInfo;

    public Dvds() {
        super();
        this.contentInfo="";
    }

    public Dvds(String contentInfo, String dispositive, String brand, int registerNumber, boolean condition, String entryDate, boolean availability) {
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
        return super.toString()+" Dvd's{" + "contentInfo=" + contentInfo + '}';
    }
}
