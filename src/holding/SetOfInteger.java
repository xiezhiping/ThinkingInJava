package holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
	public static void main(String [] args) {
		Random rand = new Random(47);
		Set<Integer> intset = new HashSet<>();
		for (int i = 0; i < 100; i++) {
			intset.add(rand.nextInt(30));
			System.out.println(intset);
		}
	}
}
