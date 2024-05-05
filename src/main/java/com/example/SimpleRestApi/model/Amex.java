package com.example.SimpleRestApi.model;

import java.time.LocalDate;
import java.util.Date;

public class Amex extends Card{

	

	public Amex(int number, String holder_name, String holder_lastname, LocalDate expire_date) {
		super(number, holder_name, holder_lastname, expire_date);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate_rate(int amount) {
		return (LocalDate.now().getMonthValue() * 0.1) * amount / 100;
	}


}
