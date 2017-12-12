package br.com.casnav;

import java.io.Serializable;

public class Calculadora implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int somar(int x, int a) {
		return x + a;
	}
	
	public int subtracao(int x, int a) {
		return x - a;
	}
	
	public int multiplicacao(int x, int a) {
		
		return x * a;
	}

	public double divisao(int x, int a) {
		
		return x /a;
	}
	
	

}
