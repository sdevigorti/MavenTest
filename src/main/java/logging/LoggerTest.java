package logging;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggerTest {
	static String configFileName = "C:\\Users\\sreed\\eclipse-workspace\\Maventest\\log4j.properties";
		
	//public static final Logger logge;
	 public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());
	
	 @BeforeTest
	 public static void getLogger() {
	PropertyConfigurator.configure(configFileName);	
	}
	 @Test
	public void testLogger() {
		//getLogger();
		 logger.info("log test1");
		 logger.info("log test2");
		 logger.info("log test3");
		 logger.info("log test4");
	}
	
}
