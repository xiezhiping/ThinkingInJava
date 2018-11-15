package controllingexecution;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i < 10; i++) {
			System.out.println("这是第一个for循环,i的值为：" + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("这是第二个for循环,j 的值为：" + j);
				break; // 跳出当前循环
			}
			System.out.println("这是break之后的输出语句");
		}
	}

}
