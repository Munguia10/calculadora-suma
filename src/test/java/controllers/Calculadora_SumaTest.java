package controllers;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.ust.calc.suma.controllers.Calculadora_Suma;
import com.ust.calc.suma.controllers.Sum;

public class Calculadora_SumaTest {
	
	private Sum calculadora_Suma;

	@Before
	public void setUp() throws Exception {
		
		calculadora_Suma = new Calculadora_Suma();
	}

	@Test
	public void test_ok() {
		
		final Integer sum = calculadora_Suma.doSum(3, 2);
		
		assertThat(sum).isEqualTo(5);
		
	}
	
	@Test
	public void test_ko() {
		
		final Integer sum = calculadora_Suma.doSum(3, 2);
		
		assertThat(sum).isNotEqualTo(0);
		
	}

}
