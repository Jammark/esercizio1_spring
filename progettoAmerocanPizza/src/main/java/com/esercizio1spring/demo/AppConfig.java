package com.esercizio1spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.esercizio1spring.demo.model.Ingrediente;
import com.esercizio1spring.demo.model.Pizza;

@Configuration
public class AppConfig {

	@Bean
	public Ingrediente getPomodoro() {
		return new Ingrediente("Pomodoro", 0.50);
	}

	@Bean
	public Ingrediente getMozzarella() {
		return new Ingrediente("Mozzarella", 1.00);
	}

	@Bean
	public Ingrediente getAnanas() {
		return new Ingrediente("Ananas", 2.00);
	}

	@Bean
	public Ingrediente getProsciutto() {
		return new Ingrediente("Prosciutto cotto", 1.00);
	}

	@Bean
	public Ingrediente getFunghi() {
		return new Ingrediente("funghi", 2.00);
	}

	@Bean
	public Pizza getHawaiana() {
		return new Pizza("Hawaiana",
				new Ingrediente[] { getPomodoro(), getMozzarella(), getProsciutto(), getAnanas() });
	}

	@Bean
	public Pizza getCottoEFunghi() {
		return new Pizza("Cotto e funghi",
				new Ingrediente[] { getPomodoro(), getMozzarella(), getProsciutto(), getFunghi() });
	}
}
