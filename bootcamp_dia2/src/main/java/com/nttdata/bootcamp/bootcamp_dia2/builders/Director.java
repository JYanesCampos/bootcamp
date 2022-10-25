package com.nttdata.bootcamp.bootcamp_dia2.builders;

public class Director {

	public Director() {
	}

	public void crearSillaComedor(Builder builder) {
		builder.reset()
			.setPatas(4)
			.setRuedas(false)
			.setAcolchado(true)
			.setPosabrazos(false);
	}

	public void crearSillaGaming(Builder builder) {
		builder.reset()
			.setPatas(1)
			.setRuedas(true)
			.setAcolchado(true)
			.setPosabrazos(true);
	}
}