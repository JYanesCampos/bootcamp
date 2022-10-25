package com.nttdata.bootcamp.bootcamp_dia2.builders;

public class SillaBuilder implements Builder {
	private Silla silla;
	
	public SillaBuilder() {
		this.reset();
	}
	
	@Override
	public Builder reset() {
		this.silla = new Silla();
		return this;
	}
	
	@Override
	public Builder setPatas(int patas) {
        this.silla.setPatas(patas);
        return this;
    }

	@Override
	public Builder setRuedas(boolean ruedas) {
		this.silla.setRuedas(ruedas);
		return this;
	}

	@Override
	public Builder setAcolchado(boolean acolchado) {
		this.silla.setAcolchado(acolchado);
		return this;
	}

	@Override
	public Builder setPosabrazos(boolean posabrazos) {
		this.silla.setPosabrazos(posabrazos);
		return this;
	}
	
	
	public Silla build() {
		Silla silla = this.silla;
		this.reset();
		return silla;
	}
	
}