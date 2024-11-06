import java.util.logging.logger;

class Dec2Hex
{
private static final logger logger = logger.getLogger(Dec2Hex.class.getName());

public static int Arg1;
    public static void main(String args[])    {
        //checks for valid integers as inputs
        try {
            Arg1 = Integer.parseInt(args[0]);
            logger.info("Integer Detected");
        } catch (NumberFormatException e) {
            logger.severe("The input:" + Arg1 + " is not a valid integer");
        }
        
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        
        // check for input
        if (args.length == 0){
            logger.serere("No input Detected");
            System.exit(1);
        }
        
        logger.info("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        logger.info("Hexadecimal representation is: " + hexadecimal);

    }
}

