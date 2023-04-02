package br.com.amaral.math;

import br.com.amaral.coverters.Consiste;
import br.com.amaral.coverters.NumberConvert;

public class SimpleMath {
	
	public static Double soma(String numberOne, String numberTwo) {
		if(Consiste.verificaNumeric(numberOne, numberTwo)) {
			return NumberConvert.covertToDouble(numberOne) + NumberConvert.covertToDouble(numberTwo);
		}
		return 0D;
	}	
	
	public static Double subtracao(String numberOne, String numberTwo) {
		if(Consiste.verificaNumeric(numberOne, numberTwo)) {
			return NumberConvert.covertToDouble(numberOne) - NumberConvert.covertToDouble(numberTwo);
		}
		return 0D;
	}
	
	public static Double multiplicacao(String numberOne, String numberTwo) {
		if(Consiste.verificaNumeric(numberOne, numberTwo)) {
			return NumberConvert.covertToDouble(numberOne) * NumberConvert.covertToDouble(numberTwo);
		}
		return 0D;
	}
	
	public static Double divisao(String numberOne, String numberTwo) {
		if(Consiste.verificaNumeric(numberOne, numberTwo)) {
			return NumberConvert.covertToDouble(numberOne) / NumberConvert.covertToDouble(numberTwo);
		}
		return 0D;
	}
	
	public static Double media(String numberOne, String numberTwo) {
		if(Consiste.verificaNumeric(numberOne, numberTwo)) {
			return (NumberConvert.covertToDouble(numberOne) + NumberConvert.covertToDouble(numberTwo))/2;
		}
		return 0D;
	}
	
	public static Double raiz(String numberOne) {
		if(Consiste.verificaNumeric(numberOne)) {
			return Math.sqrt(NumberConvert.covertToDouble(numberOne));
		}
		return 0D;
	}
}
