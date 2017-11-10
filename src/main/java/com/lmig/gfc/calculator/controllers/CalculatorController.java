package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {

	public Calculator calculator = new Calculator();

	@RequestMapping("/")
	public ModelAndView defaultPage(Double firstNumber, String operator, Double secondNumber) {
		if (operator != null) {
			if (operator.equals("+")) {
				calculator.addNumber(firstNumber, secondNumber);
			}
			if (operator.equals("-")) {
				calculator.subtractNumber(firstNumber, secondNumber);
			}
			if (operator.equals("*")) {
				calculator.multiplyNumber(firstNumber, secondNumber);
			}
			if (operator.equals("/")) {
				calculator.divideNumber(firstNumber, secondNumber);
			}
			if (operator.equals("^")) {
				calculator.exponentNumber(firstNumber, secondNumber);
			}
		}
		ModelAndView mv;
		mv = new ModelAndView();
		mv.setViewName("calculator");

		mv.addObject("calculator", calculator);
		return mv;
	}

	/*
	 * @RequestMapping("/answer") public ModelAndView calculate (double firstNumber,
	 * String operator, double secondNumber) { // ModelAndView calculatemv = new
	 * ModelAndView(); if (operator.equals("+")) { calculator.addNumber(firstNumber,
	 * secondNumber); } if (operator.equals("-")) { result =
	 * calculator.subtractNumber(firstNumber, secondNumber); } if
	 * (operator.equals("*")) { result = calculator.multiplyNumber(firstNumber,
	 * secondNumber); } if (operator.equals("/")) { result =
	 * calculator.divideNumber(firstNumber, secondNumber); } if
	 * (operator.equals("^")) { result = calculator.exponentNumber(firstNumber,
	 * secondNumber); }
	 * 
	 * ModelAndView mv; mv = new ModelAndView(); mv.setViewName("calculator");
	 * 
	 * mv.addObject("calculator", calculator); return mv; }
	 */
}
