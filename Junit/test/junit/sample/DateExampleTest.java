package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class DateExampleTest extends DateExample {

	@Test
	void test() {
		final Date current = new Date();
		DateExample sut = new DateExample() {
			@Override
			public Date newDate() {
				return current;
			}
		};
		sut.setMessage();
		assertEquals(sut.date, current);
	}

}
