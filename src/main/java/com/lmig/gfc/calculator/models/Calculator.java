package com.lmig.gfc.calculator.models;

public class Calculator {

	private Double result;
	private Double firstNumber;
	private String operator;
	private Double secondNumber;

	// need method to add
	public void addNumber(Double firstNumber, Double secondNumber) {
		result = firstNumber + secondNumber;
	}

	// need method to subtract
	public void subtractNumber(Double firstNumber, Double secondNumber) {
		result = firstNumber - secondNumber;
	}

	// need method to multiply
	public void multiplyNumber(Double firstNumber, Double secondNumber) {
		result = firstNumber * secondNumber;
	}

	// need method to divide
	public void divideNumber(Double firstNumber, Double secondNumber) {
		result =firstNumber / secondNumber;
	}

	// need method to exponent
	public void exponentNumber (Double firstNumber, Double secondNumber) {
		result = Math.pow(firstNumber, secondNumber);
		
	}
	
	public String getResult() {
		return String.valueOf(result);
	}
}

