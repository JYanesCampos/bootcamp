package com.nttdata.bootcamp.bootcamp_dia2.singleton;

public class SingletonPersona extends Persona{
	
	private static String name;
	private static int age;


	public SingletonPersona() {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	private static SingletonPersona instance;

	
	public static SingletonPersona getInstance() {
		if(instance == null) {
			instance = new SingletonPersona();
		}
		return instance;
	}
	
	public void singletinOperation() {
		System.out.println("Singleton");
	}
}