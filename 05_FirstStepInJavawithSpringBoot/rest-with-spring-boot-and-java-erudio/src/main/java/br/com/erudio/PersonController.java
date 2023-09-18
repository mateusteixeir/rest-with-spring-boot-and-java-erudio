package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;

@RestController
public class MathController {
	
	NumberConverter numconvert = new NumberConverter();
	VerifyNumeric verifyNumeric = new VerifyNumeric();
	private SimpleMath simplemath = new SimpleMath();

	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
			
		
		if(!verifyNumeric.isNumeric(numberOne) || !verifyNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Prease set a numeric value");
		}
		//return numconvert.convertToDouble(numberOne) + numconvert.convertToDouble(numberTwo);
		return simplemath.sum(numconvert.convertToDouble(numberOne), numconvert.convertToDouble(numberTwo));
	}
	
	
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!verifyNumeric.isNumeric(numberOne) || !verifyNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Prease set a numeric value");
			
		}
		
		
		//return numconvert.convertToDouble(numberOne) - numconvert.convertToDouble(numberTwo);
		return simplemath.sub(numconvert.convertToDouble(numberOne), numconvert.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/mul/{numberOne}/{numberTwo}" , method=RequestMethod.GET)
	public Double mul(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!verifyNumeric.isNumeric(numberOne) || !verifyNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("please set a numeric value");
			
		}
		
		//return numconvert.convertToDouble(numberOne) * numconvert.convertToDouble(numberTwo);
		return simplemath.mul(numconvert.convertToDouble(numberOne), numconvert.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if(!verifyNumeric.isNumeric(numberOne) || !verifyNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("please set a numeric value");
			
		}
		
		//return numconvert.convertToDouble(numberOne) / numconvert.convertToDouble(numberTwo);
		return simplemath.div(numconvert.convertToDouble(numberOne), numconvert.convertToDouble(numberTwo));
	}
	
	
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double med(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
		
		if(!verifyNumeric.isNumeric(numberOne) || !verifyNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("please set a numeric value");
			
		}
		
		//return (numconvert.convertToDouble(numberOne) + numconvert.convertToDouble(numberTwo)) / 2;
		return simplemath.med(numconvert.convertToDouble(numberOne), numconvert.convertToDouble(numberTwo));
		
	}
	
	@RequestMapping(value = "/rai/{number}", method=RequestMethod.GET)
	public Double med(@PathVariable(value = "number") String number) throws Exception {
		
		
		
		if(!verifyNumeric.isNumeric(number)) {
			throw new UnsupportedMathOperationException("please set a numeric value");
			
		}
		
		//return Math.sqrt(numconvert.convertToDouble(number));
		return simplemath.squareroot(numconvert.convertToDouble(number));
		
	}
	
}









