package initializationcleanup;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OverrideTest().info((int)Long.MAX_VALUE);
		new OverrideTest().info(123);
	}
	private void info(short num) {
		System.out.println("����һ��short�����βεķ�����num = " + num);
	}
	private void info(int num) {
		System.out.println("����һ��int�����βεķ�����num = " + num);
	}

}
