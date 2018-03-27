/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

public class Student {
    //atributos
    private String carnet;
    private String name;
    private String career;
    private int year;
    //costructores

    public Student() {
        this.carnet = "";
        this.name = "";
        this.career = "";
        this.year = 0;
        
    }
    

    public Student(String carnet, String name, String career, int year) {
        this.carnet = carnet;
        this.name = name;
        this.career = career;
        this.year = year;
    }
    //accesores

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" + "carnet=" + carnet + ", name=" + name + ", career=" + career + ", year=" + year + '}';
    }
    
}
