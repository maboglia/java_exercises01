package com.lynda.javatraining;

import com.lynda.javatraining.olives.Olive;
import com.lynda.javatraining.olives.OliveName;

public class Main {

	public static void main(String[] args) {
		Olive o = new Olive(OliveName.PICHOLINE, 
				0x00FF00);
		
		Class<?> c = o.getClass();
		
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		
	}

}
