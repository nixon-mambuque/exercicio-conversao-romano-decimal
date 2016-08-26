package mz.nixon.mambuque.testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import mz.nixon.mambuque.conversor.ConversorDeRomanoParaDecimal;



public class ConversorDeRomanoParaDecimalTest {
	
	@Test
	public void deveRetornar_1(){
		ConversorDeRomanoParaDecimal conversor = new ConversorDeRomanoParaDecimal();
		assertEquals(1, conversor.converte("I"));
	}
	
	@Test
	public void deveRetornar_12(){
		ConversorDeRomanoParaDecimal conversor = new ConversorDeRomanoParaDecimal();
		assertEquals(12, conversor.converte("XII"));
	}
}
