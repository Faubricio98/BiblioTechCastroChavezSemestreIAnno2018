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
public class Books {
    //atributos
    private String type;
    private String title;
    private String author;
    private int isbn;
    private int year;
    
    
    //constructores
    public Books(){
        this.type = "";
        this.title = "";
        this.author = "";
        this.isbn = 0;
        this.year = 0;
    }

    public Books(String type, String title, String author, int isbn, int year) {
        this.type = type;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year=year;
    }
    
    //accesores

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Books{" + "type=" + type + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", year=" + year + '}';
    }
    
    
    
    
    
}
