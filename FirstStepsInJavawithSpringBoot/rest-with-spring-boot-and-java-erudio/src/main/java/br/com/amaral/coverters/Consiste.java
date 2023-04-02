package br.com.amaral.coverters;

import br.com.amaral.exceptions.UnsupportedMathOperationException;

public class Consiste {
	public static boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
			String number = strNumber.replaceAll(",", ".");
			return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
	public static boolean verificaNumeric(String numberOne, String numberTwo) {
		if (!Consiste.isNumeric(numberOne) || !Consiste.isNumeric(numberTwo)) {
	        throw new UnsupportedMathOperationException("Please set a numeric value!");
	    }
		return true;
	}
	
	public static boolean verificaNumeric(String numberOne) {
		if (!Consiste.isNumeric(numberOne)) {
	        throw new UnsupportedMathOperationException("Please set a numeric value!");
	    }
		return true;
	}
}
