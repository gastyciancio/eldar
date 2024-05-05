package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SimpleRestApi.model.Amex;
import com.example.SimpleRestApi.model.Nara;
import com.example.SimpleRestApi.model.Visa;

import DTO.CardDTO;

@RestController
public class CardController {
	
	@PostMapping("/rates")
	public List<String> getCardsRate(@RequestBody CardDTO card, @RequestParam int amount ) {
		Visa visa = new Visa(card.getNumber(), card.getHolder_name(), card.getHolder_lastname(), card.getExpire_date());
		Nara nara = new Nara(card.getNumber(), card.getHolder_name(), card.getHolder_lastname(), card.getExpire_date());
		Amex amex = new Amex(card.getNumber(), card.getHolder_name(), card.getHolder_lastname(), card.getExpire_date());
		
		return Arrays.asList(visa.rate(amount), nara.rate(amount), amex.rate(amount));
	}
	
}