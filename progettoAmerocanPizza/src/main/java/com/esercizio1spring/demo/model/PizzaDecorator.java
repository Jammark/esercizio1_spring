package com.esercizio1spring.demo.model;

import lombok.Getter;

@Getter
public abstract class PizzaDecorator extends Consumation {

	private Consumation[] campi;

	public PizzaDecorator(String name, Consumation[] campi) {
		super(name);
		this.campi = campi;
	}

}
