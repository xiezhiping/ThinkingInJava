package generics;
import java.util.ArrayList;
import java.util.List;

import utils.Print;

public class GenericsAndCovariance {
	public static void main (String[] args) {
		List<? super Fruit> list = new ArrayList<>();
//		List<? extends Fruit> list = new ArrayList<>();
		Apple a = new Apple();
		list.add(a);
		list.add(new Fruit());
//		list.add(new Object());
		list.add(null);
		Print.println(list.get(0));
	}
}
