package com.example.SimpleRestApi.model;

import java.time.LocalDate;
import java.util.Date;

public class Visa extends Card {

	public Visa(int number, String holder_name, String holder_lastname, LocalDate expire_date) {
		super(number, holder_name, holder_lastname, expire_date);
	}

	@Override
	public double calculate_rate(int amount) {
		LocalDate today = LocalDate.now();
		double currentYearLastTwoDigits = today.getYear() % 100;
		int currentMonth = today.getMonthValue();
		 
		return (currentYearLastTwoDigits / currentMonth) * amount / 100;
	}


}
