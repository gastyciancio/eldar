package com.example.SimpleRestApi.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public abstract class Card {
	
    private int number;
    private String holder_name;
    private String holder_lastname;
    private LocalDate expire_date;

    public Card(int number, String holder_name, String holder_lastname, LocalDate expire_date) {
		super();
		this.number = number;
		this.holder_name = holder_name;
		this.holder_lastname = holder_lastname;
		this.expire_date = expire_date;
	}
 
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public String getHolder_lastname() {
		return holder_lastname;
	}

	public void setHolder_lastname(String holder_lastname) {
		this.holder_lastname = holder_lastname;
	}

	public LocalDate getExpire_date() {
		return expire_date;
	}
	public void setExpire_date(LocalDate expire_date) {
		this.expire_date = expire_date;
	}
	
	public boolean isValidOperation(int cost) {
		return cost >= 0 && cost < 1000;
	}
	
	public boolean isValidCard() {
		return this.getExpire_date().isAfter(LocalDate.now());
	}
	
	public abstract double calculate_rate(int amount);

	public boolean isDifferentFrom(Card card) {
		return this.getNumber() != card.getNumber() || this.getHolder_name() != card.getHolder_name() || this.getHolder_lastname() != card.getHolder_lastname() || this.getExpire_date() != card.getExpire_date() || this.getClass().getSimpleName() != card.getClass().getSimpleName() ;
	}

	@Override
    public String toString() {
        return this.type() + " with number: " + this.getNumber() +", holder name: " + this.getHolder_name() +", holder last name: " + this.getHolder_lastname() + " and expire date: " + this.getExpire_date() ;
    }
	
	public String rate(int amount) {
		try {
			if (this.isValidCard() && this.isValidOperation(amount)) {
				return this.toString() + ", amount: " + this.calculate_rate(amount);
			}else {
				throw new Exception(this.type() +". Please checkout if you sent an amount lower than 1000 and the expìred date of the card is after today");
			}
		}
		catch (Exception e) {
			return e.getMessage();
		}
	}
	
	private String type() {
		return "Card: " + this.getClass().getSimpleName();
	}
	

    
}