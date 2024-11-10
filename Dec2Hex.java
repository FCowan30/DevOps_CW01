import java.util.logging.Level;
import java.util.logging.Logger;

class Dec2Hex
{
private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());


    public static void main(String[] args)    {

        final int Arg1;

        // check for input
        if (args.length == 0){
            logger.severe("No input Detected");
            System.exit(1);
        }
        Arg1 = Integer.parseInt(args[0]);
        //checks for valid integers as inputs
        try {
            if (logger.isLoggable(Level.INFO)){
                logger.info("Integer Detected");
             }
        } catch (NumberFormatException e) {
           if (logger.isLoggable(Level.SEVERE)) {
                logger.severe(String.format("The input: '%s' is not a valid integer", args[0]));
           }
          System.exit(1);
        }
        
        char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        int num = Arg1;
        StringBuilder hexadecimal = new StringBuilder();
        
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("Converting the Decimal Value %d to Hex...", num));
        }
        while(num != 0)
        {
            rem=num%16;
            hexadecimal.insert(0, ch[rem]);
            num= num/16;
        }
         if (logger.isLoggable(Level.INFO)) {
             logger.info(String.format("Hexadecimal representation is:  %s", hexadecimal.toString()));
          }
    }
}
