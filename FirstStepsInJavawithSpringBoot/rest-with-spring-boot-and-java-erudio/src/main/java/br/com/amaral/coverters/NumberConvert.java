package br.com.amaral.coverters;

public class NumberConvert {
	 public static Double covertToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		//BR 10,25 US 10.25
		String number = strNumber.replaceAll(",", ".");
		if(Consiste.isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

}
