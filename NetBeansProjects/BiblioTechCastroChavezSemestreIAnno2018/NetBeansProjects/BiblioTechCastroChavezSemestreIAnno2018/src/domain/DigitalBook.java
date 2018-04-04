/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


public class DigitalBook extends Books{
    private String format;
    private float storage;
    //constructores

    public DigitalBook() {
        super();
        this.format="";
        this.storage=0;
    }
    public DigitalBook(String format, float storage, String type, String title, String author, int isbn, int year) {
        super(type, title, author, isbn, year);
        this.format=format;
        this.storage=0;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public float getStorage() {
        return storage;
    }

    public void setStorage(float storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "DigitalBook{" + "format=" + format + ", storage=" + storage + '}';
    }
}
