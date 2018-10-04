package com.asesoftware.pruebasunitarias;

public class Calculadora {
	
	public int memoria;
	
	public Calculadora(){
		memoria = 0;
	}
	
	public int sumar(int a, int b){
		memoria = a + b;
		return memoria;
	}
	
	public int restar(int a, int b){
		memoria = a - b;
		return memoria;
	}
	
	public int add(int vlr){
		memoria += vlr;
		return memoria;
	}
	
	public int sub(int vlr){
		memoria -= vlr;
		return memoria;
	}
	
	public int memoria(){
		return memoria;
	}
	
	public void clear(){
		memoria = 0;
	}
	
	public int dividir(int a, int b){
		if (b == 0){
			throw new ArithmeticException("No es posible dividir entre cero.");
		}
		memoria = a / b;
		return memoria;
	}
	
//	public void operacionOptima(){
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public int multiplicar(int a, int b){
		memoria = a * b;
		return memoria;
	}
}
