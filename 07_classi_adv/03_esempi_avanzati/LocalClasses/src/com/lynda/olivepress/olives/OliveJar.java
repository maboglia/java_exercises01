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

	public void addOlive(String oliveName, long color) {
		olives.add(new Olive(oliveName, color));
	}
	
	public void reportOlives() {
		class JarLid {
			public void open() {
				System.out.println("Twist, twist, twist...");
				System.out.println("Pop!");
			}
		}
		new JarLid().open();
		
		for (Olive o : olives) {
			System.out.println("It's a " + o.oliveName + " olive!!");
		}
	}
	
	
	class Olive {
		
		public static final long BLACK = 0x000000;
		
		public String oliveName;
		public long color = BLACK;
		
		public Olive() {
		}

		public Olive(String oliveName) {
			this.oliveName = oliveName;
		}
		
		public Olive(String oliveName, long color) {
			this(oliveName);
			this.color = color;
		}
		
		public String toString() {
			return "name: " + this.oliveName + ": " + "color: " +  this.color;
		}

	}

	
}
