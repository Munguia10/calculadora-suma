package controllers;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Calculadora_SumaTest {
	
	private Sum Calculadora_Suma;

	@Before
	public void setUp() throws Exception {
		
		Calculadora_Suma = new Calculadora_Suma();
	}

	@Test
	public void test_ok() {
		
		final Integer sum = Calculadora_Suma.doSum(3, 2);
		
		assertThat(sum).isEqualTo(5);
		
	}
	
	@Test
	public void test_ko() {
		
		final Integer sum = Calculadora_Suma.doSum(3, 2);
		
		assertThat(sum).isEqualTo(0);
		
	}

}
