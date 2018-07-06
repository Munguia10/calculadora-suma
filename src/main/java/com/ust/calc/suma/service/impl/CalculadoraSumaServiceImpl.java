package com.ust.calc.suma.service.impl;

import org.springframework.stereotype.Service;

import com.ust.calc.suma.bean.SumIn;
import com.ust.calc.suma.bean.SumOut;
import com.ust.calc.suma.service.CalculadoraSumaService;

@Service
public class CalculadoraSumaServiceImpl implements CalculadoraSumaService {

	@Override
	public SumOut doSum(SumIn sumIn) {
		Double result = sumIn.getNum1() + sumIn.getNum2();
		return new SumOut(result);
	}

}
