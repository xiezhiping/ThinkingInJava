package accesscontrol;

public class Soup2 {
	private Soup2() {}
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access() {
		return ps1;
	}
	public void f() {
		
	}
}
