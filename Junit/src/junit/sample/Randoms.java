package junit.sample;

import java.util.List;

public class Randoms {
	RandomNumber random = new RandomNumberImpl();

	//①メソッドの定義
	public <T> T choice(List<T> options) {
		if (options.size() == 0) {
			return null;
		}
		int index = random.nextInt() % options.size();
		return options.get(index);
	}

	public <T> T choice2(List<T> options) {
		if (options.size() == 0) {
			return null;
		}
		//②nextIntの引数ありメソッドを使用
		int index = random.nextInt(options.size());
		return options.get(index);
	}

}
