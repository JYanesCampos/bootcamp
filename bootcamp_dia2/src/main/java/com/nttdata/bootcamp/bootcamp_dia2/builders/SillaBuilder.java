package com.nttdata.bootcamp.bootcamp_dia2.builders;

public class SillaBuilder implements Builder {
	
	private int patas;
	private boolean ruedas;
	private boolean acolchado;
	private boolean posabrazos;
	
	
	@Override
	public void setPatas(int patas) {
        this.patas = patas;
    }

	@Override
	public void setRuedas(boolean ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public void setAcolchado(boolean acolchado) {
		this.acolchado = acolchado;
	}

	@Override
	public void setPosabrazos(boolean posabrazos) {
		this.posabrazos = posabrazos;
	}
	
	
	public Silla getSilla() {
		Silla silla = new Silla (patas, ruedas, acolchado, posabrazos);
		return silla;
	}
}