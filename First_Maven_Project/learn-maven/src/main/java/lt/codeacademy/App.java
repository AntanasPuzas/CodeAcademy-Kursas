package lt.codeacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    protected final static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        execute();
    }

    public static boolean execute() {
        logger.info("Example action executed");
        return true;
    }
}
