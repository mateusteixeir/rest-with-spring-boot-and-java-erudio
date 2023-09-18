package br.com.erudio.math;


import br.com.erudio.NumberConverter;
import br.com.erudio.VerifyNumeric;

public class SimpleMath {
	
	NumberConverter numconvert = new NumberConverter();
	VerifyNumeric verifyNumeric = new VerifyNumeric();
	
	public Double sum(Double numberOne, Double numberTwo) {
			
		return numberOne + numberTwo;
	}
	
	
	public Double sub(Double numberOne, Double numberTwo) {
		
		return numberOne - numberTwo;
	}
	
	
	public Double mul(Double numberOne, Double numberTwo) {
		
		return numberOne * numberTwo;
	}
	
	
	public Double div(Double numberOne, Double numberTwo) {
		
		return numberOne / numberTwo;
	}
	
	
	public Double med(Double numberOne, Double numberTwo) {
		
		return (numberOne + numberTwo) / 2;
		
	}
	
	
	public Double squareroot(Double number) {
		
		return Math.sqrt(number);
		
	}
	

}
