package com.lynda.olivepress.olives;

import java.util.ArrayList;

public class OliveJar {

	public ArrayList<Olive> olives;
	
	{
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive("Golden", 0xDA9100));
	}
	
	public OliveJar() {
		System.out.println("Constructor...");
	}
	
	public OliveJar(int nOlives, String oliveName, long color) {
		for (int i = 1; i <= nOlives; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}

}
