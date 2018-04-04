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
public class Audiovisuales {
    private String dispositive;
    private String brand;
    private int registerNumber;
    private boolean condition;
    private String entryDate;
    private boolean availability;

    public Audiovisuales() {
        this.dispositive="";
        this.brand="";
        this.registerNumber=0;
        this.condition=false;
        this.entryDate="";
        this.availability=false;
    }

    public Audiovisuales(String dispositive, String brand, int registerNumber, boolean condition, String entryDate, boolean availability) {
        this.dispositive = dispositive;
        this.brand = brand;
        this.registerNumber = registerNumber;
        this.condition = condition;
        this.entryDate=entryDate;
        this.availability=availability;
    }

    public String getDispositive() {
        return dispositive;
    }

    public void setDispositive(String dispositive) {
        this.dispositive = dispositive;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Audiovisuales{" + "dispositive=" + dispositive + ", brand=" + brand + ", registerNumber=" + registerNumber + ", condition=" + condition + ", entryDate=" + entryDate + ", availability=" + availability + '}';
    }
    
    public int sizeInBytes(){
        return getDispositive().length()*2 +
                getBrand().length()*2 +
                4+1+ getEntryDate().length()*2 + 1;
    }
    public boolean startsBY(String begin) {
        if(begin.isEmpty() || begin.length()>dispositive.length())
            return false;
        for(int i=0; i<begin.length(); ++i)
            if( begin.charAt(i) != dispositive.charAt(i) )
                return false;
        return true;
    }
    
}
