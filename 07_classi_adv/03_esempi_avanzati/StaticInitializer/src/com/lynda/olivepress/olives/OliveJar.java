package com.lynda.olivepress.olives;

import java.util.ArrayList;

public class OliveJar {

	public static ArrayList<Olive> olives;
	
	static {
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive("Kalamata", 0x000000));
		olives.add(new Olive("Picholine", 0x00FF00));
		olives.add(new Olive("Kalamata", 0x000000));
	}

}
