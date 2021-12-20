package junit.sample;

import java.util.Date;

public class DateExample {
	public Date date = new Date();
	public String message;

	public void setMessage(){
		this.date = newDate();
		this.message = "現在時刻:" + date;
	}

	public Date newDate() {
		return new Date();
	}

}
