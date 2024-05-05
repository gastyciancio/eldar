package com.example.SimpleRestApi.model;

import java.time.LocalDate;
import java.util.Date;

public class Nara extends Card{

	public Nara(int number, String holder_name, String holder_lastname, LocalDate expire_date) {
		super(number, holder_name, holder_lastname, expire_date);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate_rate(int amount) {
		 return (LocalDate.now().getDayOfMonth() * 0.5) * amount / 100;
	}

}
