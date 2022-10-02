package com.lynda.javatraining.calc;

public class Calculator2 {

	public static void main(String[] args) {
		
		String s1 = InputHelper.getInput("Enter a numeric value: ");
		assert checkInput(s1);
		String s2 = InputHelper.getInput("Enter a numeric value: ");
		assert checkInput(s2);
		String op = InputHelper.getInput("Enter + or - or * or / ");
		
		double result = 0;
		
		switch (op) {
		case "+":
			result = MathHelper.addValues(s1, s2);
			break;
		case "-":
			result = MathHelper.subtractValues(s1, s2);
			break;
		case "*":
			result = MathHelper.multiplyValues(s1, s2);
			break;
		case "/":
			result = MathHelper.divideValues(s1, s2);
			break;

		default:
			System.out.println("You entered an incorrect operator");
			return;
		}
		
		System.out.println("The answer is " + result);
	}
	
	private static boolean checkInput(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
