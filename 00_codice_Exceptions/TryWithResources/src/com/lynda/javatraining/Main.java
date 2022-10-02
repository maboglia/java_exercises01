package com.lynda.javatraining;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		try (
				FileReader fr = new FileReader("ATextFile.tx");
				BufferedReader br = new BufferedReader(fr);		
				)
				{
			String s;
			while((s = br.readLine()) != null) { 
				System.out.println(s); 
			} 
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Still Alive!!!");

	}

}
