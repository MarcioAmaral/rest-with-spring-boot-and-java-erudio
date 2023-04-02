package br.com.amaral.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.amaral.coverters.Consiste;
import br.com.amaral.coverters.NumberConvert;
import br.com.amaral.exceptions.UnsupportedMathOperationException;
import br.com.amaral.math.SimpleMath;

@RestController
public class MathController {
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {	
		
		return SimpleMath.soma(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double subtraction(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {		
		
		return SimpleMath.subtracao(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double multiplication(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		
		return SimpleMath.multiplicacao(numberOne, numberTwo);
	}

	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double division(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {	
		
		if (Integer.parseInt(numberTwo) == 0) {
			throw new UnsupportedMathOperationException("The second number cannot to be zero!");
		}
		
		return SimpleMath.divisao(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/average/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double average(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception {
		
		return SimpleMath.media(numberOne, numberTwo);
	}
	
	
	@RequestMapping(value = "/sqrt/{numberOne}",method=RequestMethod.GET)
	public Double squared(
			@PathVariable(value = "numberOne") String numberOne
		) throws Exception {
		
		return SimpleMath.raiz(numberOne);
	}	
}
