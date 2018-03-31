/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author jcast
 */
public class MaterialBook extends Books{
    //atributos
    private String cover;
    private int sheets;
    
    //constructores
    public MaterialBook() {
        super();
        this.cover = "";
        this.sheets = 0;
    }

    public MaterialBook(String cover, int sheets, String type, String title, String author, int isbn, int year, boolean aviable) {
        super(type, title, author, isbn, year, aviable);
        this.cover=cover;
        this.sheets=sheets;
    }

    //accesores

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    @Override
    public String toString() {
        return "MaterialBook{" + "cover=" + cover + ", sheets=" + sheets + '}';
    }
    public int sizeInBytes(){
        return super.sizeInBytes()+getCover().length()*2+4+1;
    }
}
