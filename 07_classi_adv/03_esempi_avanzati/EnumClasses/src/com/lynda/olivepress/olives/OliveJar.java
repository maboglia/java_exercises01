package com.lynda.olivepress.olives;

import java.util.ArrayList;

public class OliveJar {

	public ArrayList<Olive> olives;
	
	{
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive(OliveName.GOLDEN, 0xDA9100));
	}
	
	public OliveJar() {
		System.out.println("Constructor...");
	}
	
	public OliveJar(int nOlives, OliveName oliveName, long color) {
		for (int i = 1; i <= nOlives; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}

	public void addOlive(OliveName oliveName, long color) {
		olives.add(new Olive(oliveName, color));
	}
	
	public void reportOlives() {
		
		new Object() {
			public void open() {
				System.out.println("Twist, twist, twist...");
				System.out.println("Pop!");
			}
		} .open();
		
		for (Olive o : olives) {
			System.out.println("It's a " + o.oliveName + " olive!!");
		}
	}
	
}
