/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

public class Student implements Serializable{
    //atributos
       
    
    private String carnet;
    private String name;
    private String career;
    private int Agro;
    private int Edu;
    private int Inf;
    private int year;
    
    //costructores

    public Student() {
        this.carnet = "";
        this.name = "";
        this.career = "";
    }

    public Student(String carnet, String name, String career, int Agro, int Edu, int Inf, int year) {
        this.carnet = carnet;
        this.name = name;
        this.career = career;
        this.Agro = Agro;
        this.Edu = Edu;
        this.Inf = Inf;
        this.year = year;
    }

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

    public int getAgro() {
        return Agro;
    }

    public void setAgro(int Agro) {
        this.Agro = Agro;
    }

    public int getEdu() {
        return Edu;
    }

    public void setEdu(int Edu) {
        this.Edu = Edu;
    }

    public int getInf() {
        return Inf;
    }

    public void setInf(int Inf) {
        this.Inf = Inf;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" + "carnet=" + carnet + ", name=" + name + ", career=" + career + ", Agro=" + Agro + ", Edu=" + Edu + ", Inf=" + Inf + ", year=" + year + '}';
    }
    
}