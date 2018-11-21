package strings;

import java.util.Random;

public class UsingStringBuilder {
	public static Random rand = new Random(47);
	public String toString() {
		StringBuilder result = new StringBuilder("【");
		for (int i =0; i < 25; i++) {
			result.append(rand.nextInt(100)); // 这里如果想走捷径，用append(a + ":" + c)的形式，编译器就会调入陷阱，重新生成一个StringBuilder来处理
			result.append(", ");
		}
		result.delete(result.length() - 2, result.length());
		result.append("】");
		return result.toString();
	}
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
		System.out.println("\\");
	}
}
