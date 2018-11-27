package annotations;

import utils.Print;

public class AtUnitExample {
	public String methodOne() {
		return "This is methodOne";
	}
	public int methodTwo() {
		Print.println("This is methodTwo");
		return 2;
	}
}
