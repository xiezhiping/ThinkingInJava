package initializationcleanup;

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OverrideTest().info((int)Long.MAX_VALUE);
		new OverrideTest().info(123);
	}
	private void info(short num) {
		System.out.println("这是一个short类型形参的方法，num = " + num);
	}
	private void info(int num) {
		System.out.println("这是一个int类型形参的方法，num = " + num);
	}

}
