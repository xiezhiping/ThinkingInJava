package utils;

public class Print {
	public static void println(Object s) { // 为了每次print省事，自己封装一个 工具方法
		System.out.println(s);
	}
	public static void print(Object s) {
		System.out.print(s);
	}
}
