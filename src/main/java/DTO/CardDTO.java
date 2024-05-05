package DTO;

import java.time.LocalDate;
import java.util.Date;

public class CardDTO {
	private int number;
    private String holder_name;
    private String holder_lastname;
    private LocalDate expire_date;
  
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

}
