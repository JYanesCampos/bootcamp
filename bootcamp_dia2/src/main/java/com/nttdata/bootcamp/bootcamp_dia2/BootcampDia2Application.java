package com.nttdata.bootcamp.bootcamp_dia2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.bootcamp_dia2.builders.Director;
import com.nttdata.bootcamp.bootcamp_dia2.builders.Silla;
import com.nttdata.bootcamp.bootcamp_dia2.builders.SillaBuilder;


@SpringBootApplication
public class BootcampDia2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BootcampDia2Application.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("asdd ad asddad asdd asd");
		
		Director director = new Director();
		SillaBuilder sillaBuilder = new SillaBuilder();
		
		director.crearSillaComedor(sillaBuilder);
		Silla sillaComedor = sillaBuilder.build();
		
		director.crearSillaGaming(sillaBuilder);
		Silla sillaGaming = sillaBuilder.build();
		
		System.out.println("Silla de comedor:" + sillaComedor.toString());
		System.out.println("Silla gaming:" + sillaGaming.toString());
	}
	

}
