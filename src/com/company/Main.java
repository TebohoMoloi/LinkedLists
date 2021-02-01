package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    LinkedList<String> names = new LinkedList<>();
	    names.add("Teboho");
	    names.add("Moloi");
	    names.add("Sylvester");
		for (String name : names) {
			if (name.equals("Teboho"))
				System.out.println("We found it bro!");
			else
				System.out.println("Shit man, i ain't found nothing");
			break;
		}
    }
}
