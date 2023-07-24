package com.esercizio1spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Esercizio1SrpingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1SrpingApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				Esercizio1SrpingApplication.class);

		log.info(ctx.getBean("getHawaiana").toString());
		log.info(ctx.getBean("getCottoEFunghi").toString());

		ctx.close();
	}

}
