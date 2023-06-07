package data;

import org.apache.log4j.Logger;

public class LoggingExampleTest {

	public static void main(String[] args) {


		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("Hello");
		print.debug("We are writing into a log file");
		print.debug("string the test case xyz test");

	}

}
