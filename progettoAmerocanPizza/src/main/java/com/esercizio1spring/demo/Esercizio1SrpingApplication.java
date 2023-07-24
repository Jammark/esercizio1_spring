package com.esercizio1spring.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.esercizio1spring.demo.model.Bevanda;
import com.esercizio1spring.demo.model.Consumation;
import com.esercizio1spring.demo.model.Ingrediente;
import com.esercizio1spring.demo.model.Pizza;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Esercizio1SrpingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1SrpingApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				Esercizio1SrpingApplication.class);

		List<Pizza> pizze = Arrays
				.asList(new Pizza[] { (Pizza) ctx.getBean("getHawaiana"), (Pizza) ctx.getBean("getCottoEFunghi"),
						(Pizza) ctx.getBean("getDiavola"), (Pizza) ctx.getBean("getMaisECotto") });
		log.info(addSpaces("Pizze", 100) + addSpaces("Calorie", 20) + addSpaces("Prezzo", 20));
		pizze.forEach(p -> log.info(getPizza(p)));
		List<Ingrediente> ingredienti = Arrays.asList(new Ingrediente[] { (Ingrediente) ctx.getBean("getAnanas"),
				(Ingrediente) ctx.getBean("getProsciutto"), (Ingrediente) ctx.getBean("getFunghi"),
				(Ingrediente) ctx.getBean("getMais"), (Ingrediente) ctx.getBean("getSalame") });
		log.info(addSpaces("Ingredienti", 120) + addSpaces("Prezzo", 20));
		ingredienti.forEach(i -> log.info(getIngrediente(i)));
		log.info(addSpaces("Bevande", 120) + addSpaces("Prezzo", 20));
		Arrays.asList(new Bevanda[] { (Bevanda) ctx.getBean("getAcqua"), (Bevanda) ctx.getBean("getCola"),
				(Bevanda) ctx.getBean("getBirra"), }).stream().forEach(b -> log.info(getBev(b)));
		ctx.close();
	}

	private static String getPizza(Pizza p) {
		String s = p.getName() + "("
				+ Arrays.asList(p.getCampi()).stream().map(Consumation::getName).collect(Collectors.joining(",")) + ")";
		s = addSpaces(s, 100);
		String c = "" + p.getCalorie();
		c = addSpaces(c, 20);
		String pr = "" + p.getPrice();
		pr = addSpaces(pr, 20);
		return s + c + pr;
	}

	private static String getIngrediente(Ingrediente i) {
		String s = i.getName();
		s = addSpaces(s, 120);
		String p = "" + i.getPrice();
		p = addSpaces(p, 20);
		return s + p;
	}

	private static String getBev(Bevanda i) {
		String s = i.getName();
		s = addSpaces(s, 120);
		String p = "" + i.getPrice();
		p = addSpaces(p, 20);
		return s + p;
	}

	private static String addSpaces(String s, int l) {
		int sl = s.length();
		if (s.length() < l) {
			for (int i = 0; i < l - sl; i++) {
				s += " ";
			}
		}
		return s;
	}

}
