package com.nttdata.bootcamp.bootcamp_dia2.builders;

public class Silla {
	
	private int patas;
	private boolean ruedas;
	private boolean acolchado;
	private boolean posabrazos;
	
	public Silla (int patas, boolean ruedas, boolean acolchado, boolean posabrazos) {
		
		this.patas = patas;
		this.ruedas = ruedas;
		this.acolchado = acolchado;
		this.posabrazos = posabrazos;
		
	}

	public int getPatas() {
		return patas;
	}

	public boolean isRuedas() {
		return ruedas;
	}

	public boolean isAcolchado() {
		return acolchado;
	}

	public boolean isPosabrazos() {
		return posabrazos;
	}
}