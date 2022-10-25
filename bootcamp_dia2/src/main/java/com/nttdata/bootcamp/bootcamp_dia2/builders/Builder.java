package com.nttdata.bootcamp.bootcamp_dia2.builders;

public interface Builder {

	public Builder setPatas(int patas);
	public Builder setRuedas(boolean ruedas);
	public Builder setAcolchado(boolean acolchado);
	public Builder setPosabrazos(boolean posabrazos);
	public Builder reset();
	public Silla build();
	
}