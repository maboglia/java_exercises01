package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

//        Press p2 = new Press() {
//            @Override
//            public int getOil(List<Olive> olives) {
//                return 0;
//            }
//
//            @Override
//            public void setOil(int oil) {
//
//            }
//        }

    }

}
