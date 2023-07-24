package com.esercizio1spring.demo.model;

public abstract class Consumation {

	private String name;

	public Consumation(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract double getPrice();

}
