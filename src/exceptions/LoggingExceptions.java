package exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions extends Exception {
	private static Logger logger = Logger.getLogger("TestLogger");
	public LoggingExceptions() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	public static void main(String [] args) {
		try {
			throw new LoggingExceptions();
		} catch (LoggingExceptions e) {
//			e.getMessage();
			System.err.println(e);
		}
	}
}
