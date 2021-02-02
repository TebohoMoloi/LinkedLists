package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
 	LinkedList<String> names = new LinkedList<>();
        names.add("Teboho");
        names.add("Moloi");
        names.add("Sylvester");
        String whatever = "Shit man, i ain't found nothing";
        for (String name : names) {
            if (name.equals("Teboho")) {
                whatever = "We found it bro!";
                break;
            }
        }
        System.out.println(whatever);
    }
}
