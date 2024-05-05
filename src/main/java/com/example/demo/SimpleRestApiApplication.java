package com.example.demo;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SimpleRestApi.model.Amex;
import com.example.SimpleRestApi.model.Nara;
import com.example.SimpleRestApi.model.Visa;

@SpringBootApplication
public class SimpleRestApiApplication {

	public static void main(String[] args) {
		Visa visa = new Visa(123456789, "Gaston", "Gonzalez", LocalDate.of(2024, 8, 1));
		Nara nara = new Nara(987654321, "Marcos", "Perez", LocalDate.of(2023, 4, 28));
		Amex amex = new Amex(123456999, "Juan", "Alvarito", LocalDate.of(2024, 1, 1));
	
		SpringApplication.run(SimpleRestApiApplication.class, args);
		
		System.out.println(visa.toString());
		System.out.println(nara.toString());
		System.out.println(amex.toString());
		
		System.out.println("Operation for amount 1000: " + visa.isValidOperation(1000));
		System.out.println("Operation for amount -1: " + nara.isValidOperation(-1));
		System.out.println("Operation for amount 100: " + amex.isValidOperation(100));
	
		System.out.println("Card Visa is valid: " + visa.isValidCard());
		System.out.println("Card Nara is valid: " + nara.isValidCard());
		System.out.println("Card Amex is valid: " + amex.isValidCard());
		
		System.out.println("Card Visa is different from Amex: " + visa.isDifferentFrom(amex));
		System.out.println("Card Visa is different from Visa: " + visa.isDifferentFrom(visa));
		System.out.println("Card Visa is different from Nara: " + visa.isDifferentFrom(nara));
		
		System.out.println("Card Amex is different from Amex: " + amex.isDifferentFrom(amex));
		System.out.println("Card Amex is different from Visa: " + amex.isDifferentFrom(visa));
		System.out.println("Card Amex is different from Nara: " + amex.isDifferentFrom(nara));
		
		System.out.println("Card Nara is different from Amex: " + nara.isDifferentFrom(amex));
		System.out.println("Card Nara is different from Visa: " + nara.isDifferentFrom(visa));
		System.out.println("Card Nara is different from Nara: " + nara.isDifferentFrom(nara));
		
		// I use new cards with valid expired dates
		
		Nara nara2 = new Nara(987654321, "Marcos", "Perez", LocalDate.of(2024, 10, 28));
		Amex amex2 = new Amex(123456999, "Juan", "Alvarito", LocalDate.of(2024, 10, 1));
		
		System.out.println(visa.rate(500));
		System.out.println(amex2.rate(500));
		System.out.println(nara2.rate(500));

		
	}

}
