package com.example.java.model;

public class Olive {

    public static final String KALAMATA = "Kalamata";
    public static final String LIGURIAN = "Ligurian";

    private String name = KALAMATA;
    private long color = 0x2E0854;
    private int oil = 3;

    public Olive(){}

    public Olive(String name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int crush() {
        System.out.println("Ouch!");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
