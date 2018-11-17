package innerclasses;

public class Parcell {
	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	class Destination {
		private String label;
		public Destination(String whereTo) {
			label = whereTo;
			// TODO Auto-generated constructor stub
		}
		String readLabel() {
			return label;
		}
	}
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	public static void main(String []args) {
		Parcell p = new Parcell();
		p.ship("ThinkingInJava");
	}
}
