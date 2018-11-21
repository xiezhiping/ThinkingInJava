package typeinfo;
import utils.Print;
interface Interface {
	void doSomething();
	void somethingElse(String arg);
}
class RealObject implements Interface {
	public void doSomething() {
		Print.println("doSomething...");
	}
	public void somethingElse(String s) {
		Print.println(s);
	}
}
class SimpleProxy implements Interface {
	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	public void doSomething() {
		Print.println("SimpleProxy doSomething...");
		proxied.doSomething();
		Print.println("end....");
	}
	public void somethingElse(String s) {
		Print.println("SimpleProxy somethingElse" + s);
		proxied.somethingElse(s);
	}
}
public class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("crazy....");
	}
	public static void main(String [] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}
