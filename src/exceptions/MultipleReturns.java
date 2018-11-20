package exceptions;

public class MultipleReturns {
	public static void f(int i) {
		System.out.println("≥ı ºªØ....");
		try {
			if (i == 1) return;
			if (2 == i) return;
			if (3 == i) return;
			return;
		} finally {
			System.out.println("Performing cleanup...");
		}
	}
	public static void main(String [] args) {
		for (int i = 0; i < 4; i ++) {
			f(i);
		}
	}
}
