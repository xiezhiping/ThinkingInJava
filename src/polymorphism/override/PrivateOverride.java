package polymorphism.override;

public class PrivateOverride {
	private void f() {
		System.out.println("print private f()");
	}
	public static void main(String args[]) {
		PrivateOverride po = new Derived();
		po.f();
	}
}
class Derived extends PrivateOverride {
	public void f() {
		System.out.println("print public f()");
	}
}
