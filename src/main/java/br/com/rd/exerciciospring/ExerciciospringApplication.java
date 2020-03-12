package br.com.rd.exerciciospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciospringApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/exercicios-spring");
		SpringApplication.run(ExerciciospringApplication.class, args);
	}

}
