package polymorphism;


public class Wind extends Instrument {
	// ���¶��常��ķ���
	@Override
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
}
