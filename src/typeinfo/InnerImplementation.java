package typeinfo;

import utils.Print;

interface A {
	void f();
}
class InnerA {
	private static class C implements A {
		public void f() {
			Print.println("public C.f()");
		}
		public void g() {
			Print.println("public C.g()");
		}
		void u() {
			Print.println("package C.u()");
		}
		protected void v() {
			Print.println("protected C.v()");
		}
		private void w() {
			Print.println("private C.w()");
		}
	}
	public static A makeA() {
		return new C();
	}
}
public class InnerImplementation {
	public static void main(String[] args) throws Exception {
		A a = InnerA.makeA();
		a.f();
		Print.println(a.getClass().getName());
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
	}
}
