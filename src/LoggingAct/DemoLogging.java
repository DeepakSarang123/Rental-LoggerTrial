package LoggingAct;

import org.apache.log4j.Logger;
import java.io.IOException;
import java.sql.SQLException;


public class DemoLogging {

	 static Logger log = Logger.getLogger(DemoLogging.class.getName());
	 
	 public static void main(String[] args)throws IOException,SQLException {

		 log.debug("Hello this is a debug message");
	     log.info("Hello this is an info message");
		
		
				
	 }
 
}
