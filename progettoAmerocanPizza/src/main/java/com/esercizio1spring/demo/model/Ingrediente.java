package com.esercizio1spring.demo.model;

public class Ingrediente extends Consumation {

	private double price;

	public Ingrediente(String name, double price) {
		super(name);
		this.price = price;

	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
