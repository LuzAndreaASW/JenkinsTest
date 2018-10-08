//package com.asesoftware.CalculadoraMaven;

//import junit.framework.TestCase;

//public class CalculadoraTest extends TestCase {
//
//}

package com.asesoftware.CalculadoraMaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	static Calculadora calc;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("AfterClass()");
	}
	
	@Before
	public void before(){
		System.out.println("before()");
		calc.clear();
	}
	
	@After
	public void after(){
		System.out.println("after()");
		calc.clear();
	}
	
	@Test
	public void testSumar(){
		System.out.println("sumar()");
		int res = calc.sumar(2, 3);
		int esperado = 5;
		assertEquals(esperado, res);
	}
	
	@Test
	public void testRestar(){
		System.out.println("restar()");
		int res = calc.restar(3, 2);
		int esperado = 1;
		assertEquals(esperado, res);
	}
	
	@Test
	public void testDividir(){
		calc.dividir(4, 2);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDividirCero(){
		calc.dividir(4, 0);
	}
	
//	@Test(timeout = 1000)
//	public void operacionOptimaTest(){
//		calc.operacionOptima();
//	}
	
	@Test
	public void testMultiplicar(){
		System.out.println("restar()");
		int res = calc.multiplicar(3, 2);
		int esperado = 6;
		assertEquals(esperado, res);
	}
	
	@Test
	public void testMultiplicarUno(){
		System.out.println("restar()");
		int res = calc.multiplicar(3, 1);
		int esperado = 3;
		assertEquals(esperado, res);
	}
	
	@Test
	public void testMultiplicarCero(){
		System.out.println("restar()");
		int res = calc.multiplicar(0, 2);
		int esperado = 0;
		assertEquals(esperado, res);
	}
	
	@Test
	public void testMultiplicarNegNeg(){
		System.out.println("restar()");
		int res = calc.multiplicar(-3, -2);
		int esperado = 6;
		assertEquals(esperado, res);
	}
	
	@Test
	public void testMultiplicarNeg(){
		System.out.println("restar()");
		int res = calc.multiplicar(3, -2);
		int esperado = -6;
		assertEquals(esperado, res);
	}
	
}
