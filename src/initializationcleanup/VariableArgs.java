package initializationcleanup;

public class VariableArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VariableArgs().variable(1, 2, 3, 4);
	}
	private void variable(Object ... args) {
		for (Object object : args) {
			System.out.println(object);
		}
	}

}
