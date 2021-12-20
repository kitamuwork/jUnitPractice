package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RandomsTest extends Randoms {

	@Test
	void testChoice() {
		//①テストデータの作成
		List<String> options = new ArrayList<String>();
		options.add("A");
		options.add("B");
		Randoms sut = new Randoms();
		//②RundomNumberのメソッドのオーバーライド
		sut.random = new RandomNumber() {
			@Override
			public int nextInt() {
				return 0;
			}

			@Override
			public int nextInt(int bound) {
				return 0;
			}
		};
		assertEquals(sut.choice(options), "A");
	}

}
