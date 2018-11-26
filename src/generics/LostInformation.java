package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.Print;

public class LostInformation {
	public static void main(String [] args) {
		List<Forb> list = new ArrayList<>();
		Map<Forb, Fnorkle> map = new HashMap<>();
		Quark<Fnorkle> quark = new Quark();
		Particle<Long, Double> p = new Particle();
		Print.println(Arrays.toString(list.getClass().getTypeParameters()));
		Print.println(Arrays.toString(map.getClass().getTypeParameters()));
		Print.println(Arrays.toString(quark.getClass().getTypeParameters()));
		Print.println(Arrays.toString(p.getClass().getTypeParameters()));
	}
}
class Forb{}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION, MOMENTUM> {
	
}