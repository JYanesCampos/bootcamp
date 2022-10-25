package com.nttdata.bootcamp.bootcamp_dia2.builders;

public class Silla {
	
	private int patas;
	private boolean ruedas;
	private boolean acolchado;
	private boolean posabrazos;
	
	public Silla (int patas, boolean ruedas, boolean acolchado, boolean posabrazos) {
		
		this.setPatas(patas);
		this.setRuedas(ruedas);
		this.setAcolchado(acolchado);
		this.setPosabrazos(posabrazos);
		
	}
	
	public Silla() {
		
	}
	
	public static Builder builder() {
		return new SillaBuilder();
	}
	
	@Override
	public String toString() {
		return "Silla{" +
				"patas=" + patas + "\n" +
				"ruedas=" + ruedas + "\n" +
				"acolchado=" + acolchado + "\n" +
				"posabrazos=" + posabrazos +
				"}";
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

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public void setRuedas(boolean ruedas) {
		this.ruedas = ruedas;
	}

	public void setAcolchado(boolean acolchado) {
		this.acolchado = acolchado;
	}

	public void setPosabrazos(boolean posabrazos) {
		this.posabrazos = posabrazos;
	}
}