package br.com.erudio;

public class NumberConverter {
	
	public Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		// br 10,25
		// us 10.25
		
		String number = strNumber.replaceAll(",", ".");
		
		VerifyNumeric verify = new VerifyNumeric();
		if(verify.isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}
	

}
