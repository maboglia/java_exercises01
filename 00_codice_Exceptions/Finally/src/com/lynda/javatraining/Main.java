package com.lynda.javatraining;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("TextFile.txt");
			br = new BufferedReader(fr); 
			String s;
			while((s = br.readLine()) != null) { 
				System.out.println(s); 
			} 
					
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Executing finally!");
			if (fr != null) {
				fr.close();
			}
			if (br != null) {
				br.close();	
			}
		}
		
		System.out.println("Still Alive!!!");

	}

}
