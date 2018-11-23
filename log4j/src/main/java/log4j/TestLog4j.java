package log4j;

import org.apache.log4j.Logger;

public class TestLog4j {

	static Logger log = Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) {
		
		log.debug("This is a Debug Log");
		log.info("This is Info Log");
		log.error("Error in a Project");
		

	}

}
