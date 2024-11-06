import java.util.Scanner;

class Dec2Hex
{
public static int Arg1;
    public static void main(String args[])    {
        //checks for valid integers as inputs
        try {
            Arg1 = Integer.parseInt(args[0]);
            System.out.println("Integer Detected");
        } catch (NumberFormatException e) {
            System.out.println("The input:" + arg1 + " is not a valid integer");
        }
        
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        
        // check for input
        if (Arg1.length == 0){
            System.out.println("No input Detected");
            System.exit(1);
        }
        
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }
}

