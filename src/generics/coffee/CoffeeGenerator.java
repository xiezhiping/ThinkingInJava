package generics.coffee;

import java.util.Iterator;
import java.util.Random;

import utils.Print;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
	private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class};
	private static Random random = new Random(47);
	public CoffeeGenerator() {}
	private int size = 0;
	public CoffeeGenerator(int sz) {
		size = sz;
	}
	public Coffee next() {
		try {
			return (Coffee) types[random.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;
		public boolean hasNext() {
			return count > 0;
		}
		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}
	}
	@Override
	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator();
	}
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for (int i =0 ; i < 4 ; i++) {
			Print.println(gen.next());
		}
		for (Coffee c : new CoffeeGenerator(5)) {
			Print.println(c);
		}
	}
}
