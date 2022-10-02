package com.lynda.javatraining;

import com.lynda.olivepress.olives.OliveJar;

public class LocalClasses {

	public static void main(String[] args) throws Exception {

		OliveJar jar = new OliveJar();
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.reportOlives();
	}
	
}
