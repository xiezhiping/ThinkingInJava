package generics;

import java.util.ArrayList;

import utils.Print;

public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		Print.println(c1 == c2);
	}
}
