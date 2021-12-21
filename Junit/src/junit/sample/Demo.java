package junit.sample;

import java.util.Calendar;

public class Demo {

	public static void main(String[] args) {
		//Calendarクラスのオブジェクトを生成する
		Calendar cl = Calendar.getInstance();

		System.out.println("YEAR：" + cl.get(Calendar.YEAR));
		int month = cl.get(Calendar.MONTH) + 1;
		System.out.println("MONTH：" + month);
		System.out.println("DATE：" + cl.get(Calendar.DATE));
		System.out.println("getTime: " + cl.getTime());
		System.out.println("toString: " + cl.getTime().toString());

		//		System.out.println("Calendar.YEAR: " + Calendar.YEAR);
		//		System.out.println("Calendar.MONTH: " + Calendar.MONTH);
		//		System.out.println("Calendar.DATE: " + Calendar.DATE);

		// 年に2022年を設定する_
		cl.set(Calendar.YEAR, 2022);
		System.out.println("年に2022年を設定：" + cl.getTime());

		// 月に10月を設定する *月の指定は0から始まるため、10月は'9"を指定する
		cl.set(Calendar.MONTH, 9);
		System.out.println("月に10月を設定：" + cl.getTime());

		// 日に5日を設定する
		cl.set(Calendar.DATE, 5);
		System.out.println("日に5日を設定：" + cl.getTime());

		//日付の妥当性確認
		//setLenientメソッドでfalseを設定
		cl.setLenient(false);

		//ない日付set
		cl.set(2021, 12, 32);

		try {
			System.out.println(cl.getTime());

		} catch (IllegalArgumentException e) {
			System.out.println("いやいやないなよ！その日付！");
		}

	}

}
