package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PaydayTest extends Payday {

	private Calendar newCalendar(int yyyy, int mm, int dd) {
		System.out.println("------------------");
		Calendar cal = Calendar.getInstance();
		// 年を設定する_
		cal.set(Calendar.YEAR, yyyy);
		System.out.println("年に " + cal.get(Calendar.YEAR) + " を設定");
		// 月を設定する
		cal.set(Calendar.MONTH, mm - 1);
		System.out.println("月に " + cal.get(Calendar.MONTH) + " を設定");
		// 日を設定する
		cal.set(Calendar.DATE, dd);
		System.out.println("日に " + cal.get(Calendar.DATE) + " 設定");
		// 時間を設定する
		cal.set(Calendar.HOUR, 0);
		// 分を設定する
		cal.set(Calendar.MINUTE, 0);
		// 秒を設定する
		cal.set(Calendar.SECOND, 0);

		// SimpleDateFormatクラスを使用して、パターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.print("セットした日付は ");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println("------------------");

		return cal;
	}

	@Test
	@DisplayName("現在時刻が2020/06/25の場合、0を返す")
	void testGetNextPayday_return0() {
		Payday sut = new Payday(newCalendar(2020, 6, 25));
		int actualDay = sut.getNextPayday();
		assertEquals(0, actualDay);
	}

	@Test
	@DisplayName("現在時刻が2020/06/1の場合、24を返す")
	void testGetNextPayday_return24() {
		Payday sut = new Payday(newCalendar(2020, 6, 1));
		int actualDay = sut.getNextPayday();
		assertEquals(24, actualDay);
	}

	@Test
	@DisplayName("現在時刻が2020/06/26の場合、30を返す")
	void testGetNextPayday_return30() {
		Payday sut = new Payday(newCalendar(2020, 6, 26));
		int actualDay = sut.getNextPayday();
		assertEquals(30, actualDay);
	}

	@Test
	@DisplayName("現在時刻が2021/12/29の場合、28を返す")
	void testGetNextPayday_return28() {
		Payday sut = new Payday(newCalendar(2021, 12, 29));
		int actualDay = sut.getNextPayday();
		assertEquals(28, actualDay);
	}

}
