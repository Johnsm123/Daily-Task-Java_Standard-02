import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        try {
            int a = 10, b = 0;
            int result = a / b;  // this will cause an exception
        } catch (Exception e) {
            logger.error("Exception occurred: ", e);
        }

        logger.warn("This is a warning message.");
        logger.debug("Debugging details here...");
        logger.info("Application finished.");
    }
}
