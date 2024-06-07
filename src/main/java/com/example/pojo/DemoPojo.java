package com.example.pojo;

public class DemoPojo {
    private String iD;
    private String name;

    public DemoPojo(String iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    public DemoPojo() {
        System.out.println("DemoPojo Constructor");
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
