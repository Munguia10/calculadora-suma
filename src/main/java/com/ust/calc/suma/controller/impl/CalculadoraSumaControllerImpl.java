package com.ust.calc.suma.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.suma.bean.SumIn;
import com.ust.calc.suma.bean.SumOut;
import com.ust.calc.suma.controller.CalculadoraSumaController;
import com.ust.calc.suma.service.CalculadoraSumaService;

@RestController
public class CalculadoraSumaControllerImpl implements CalculadoraSumaController {

	private final CalculadoraSumaService calculadoraSumaService;
	
	@Autowired
	public CalculadoraSumaControllerImpl(CalculadoraSumaService calculadoraSumaService) {
		this.calculadoraSumaService = calculadoraSumaService;
	}
	
	@Override
	@GetMapping("/suma/{num1}/{num2}")
	public SumOut doSum(@PathVariable Double num1, @PathVariable Double num2) {
		return calculadoraSumaService.doSum(new SumIn(num1, num2));
	}

}
