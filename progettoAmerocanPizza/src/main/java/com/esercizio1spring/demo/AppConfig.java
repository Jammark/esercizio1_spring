package com.esercizio1spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.esercizio1spring.demo.model.Bevanda;
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
	public Ingrediente getMais() {
		return new Ingrediente("mais", 2.50);
	}

	@Bean
	public Ingrediente getSalame() {
		return new Ingrediente("salame piccante", 3.00);
	}

	@Bean
	public Bevanda getCola() {
		return new Bevanda("Pepsi", 3.0);
	}

	@Bean
	public Bevanda getAcqua() {
		return new Bevanda("Acqua Minerale", 1.50);
	}

	@Bean
	public Bevanda getBirra() {
		return new Bevanda("Heineken", 4.0);
	}

	@Bean
	public Pizza getHawaiana() {
		return new Pizza("Hawaiana",
				new Ingrediente[] { getPomodoro(), getMozzarella(), getProsciutto(), getAnanas() }, 1200);
	}

	@Bean
	public Pizza getCottoEFunghi() {
		return new Pizza("Cotto e funghi",
				new Ingrediente[] { getPomodoro(), getMozzarella(), getProsciutto(), getFunghi() }, 900);
	}

	@Bean
	public Pizza getDiavola() {
		return new Pizza("Diavola", new Ingrediente[] { getPomodoro(), getMozzarella(), getSalame() }, 1100);
	}

	@Bean
	public Pizza getMaisECotto() {
		return new Pizza("Mais e cotto",
				new Ingrediente[] { getPomodoro(), getMozzarella(), getProsciutto(), getMais() }, 800);
	}
}
