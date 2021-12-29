package junit.sample;

import java.util.Calendar;

public class Payday {
	private final Calendar cal;

	public Payday(Calendar cal) {
		this.cal = cal;
	}

	Payday() {
		this(Calendar.getInstance());
	}

	public int getNextPayday() {
		int todayDate = cal.get(Calendar.DATE);
		int thisMaxMonth = cal.getActualMaximum(Calendar.DATE);
		int thisMonth = cal.get(Calendar.MONTH) + 1;
		System.out.println("MONTH: " + thisMonth);
		System.out.println("thisMaxMonths: " + thisMaxMonth);
		System.out.println();

		int remaining = 0;
		if (todayDate <= 25) {
			remaining = 25 - todayDate;
		} else {
			remaining = thisMaxMonth - todayDate + 1 + 25;
		}
		return remaining;

	}

}
