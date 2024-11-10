import java.util.logging.Level;

import java.util.logging.Logger;

class Dec2Hex
{
private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

public static int Arg1;
    public static void main(String args[])    {
        //checks for valid integers as inputs
        try {
            Arg1 = Integer.parseInt(args[0]);
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
        int num;
        num = Arg1;
        StringBuilder hexadecimal = new StringBuilder();
        
        // check for input
        if (args.length == 0){
            logger.severe("No input Detected");
            System.exit(1);
        }
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

