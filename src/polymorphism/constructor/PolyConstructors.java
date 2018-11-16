package polymorphism.constructor;

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}
	public Glyph() {
		// TODO Auto-generated constructor stub
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}
class RoundGlyph extends Glyph {
	private int radius = 1;
	public RoundGlyph(int r) {
		// TODO Auto-generated constructor stub
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}
public class PolyConstructors extends Glyph {
	public static void main(String[] args) {
         new RoundGlyph(5); // 动态绑定以及初始化顺序
	}

}
