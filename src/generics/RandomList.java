package generics;

import java.util.ArrayList;
import java.util.Random;

import utils.Print;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<>();
	private Random rand = new Random(47);
	public void add(T item) {
		storage.add(item);
	}
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	public int size() {
		return storage.size();
	}
	public static void main(String[] args) {
		RandomList<String> ss = new RandomList<>();
		for (String string : "hello world hello java !".split(" ")) {
			ss.add(string);
		}
		for (int i = 0; i < ss.size(); i ++) {
			Print.println(ss.select() + " ");
		}
	}
}
