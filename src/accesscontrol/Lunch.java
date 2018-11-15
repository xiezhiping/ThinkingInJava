package accesscontrol;

public class Lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lunch lunch = new Lunch();
		lunch.testPrivate();
		lunch.testStatic();
		lunch.testSingleton();
	}
	void testPrivate() {
		//! Soup1 soup = new Soup1();
	}
	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
	}
	void testSingleton() {
		Soup2.access().f();
	}

}
