package polymorphism;


public class Wind extends Instrument {
	// 重新定义父类的方法
	@Override
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
}
