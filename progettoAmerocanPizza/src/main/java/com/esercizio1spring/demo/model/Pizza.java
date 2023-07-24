package com.esercizio1spring.demo.model;

import java.util.Arrays;
import java.util.stream.Collectors;

import lombok.Getter;

@Getter
public class Pizza extends PizzaDecorator {

	private int calorie;

	public Pizza(String name, Consumation[] campi, int calorie) {
		super(name,
				campi);
		this.calorie = calorie;

	}

	@Override
	public double getPrice() {

		double sum = 0d;
		for (int i = 0; i < getCampi().length; i++) {
			sum += getCampi()[i].getPrice();
		}
		return 5.0 + sum;
	}

	@Override
	public String toString() {
		return "Pizza [getName()=" + getName() + " -Pizza con "
				+ Arrays.asList(this.getCampi()).stream().map(Consumation::getName).collect(Collectors.joining(" , "))
				+ "]";
	}

}
