import java.util.Scanner;

public class ScannerTest1 
{
    public static void main(String []args)
    {
        String s = "Hello World! 3 + 3.0 = 6.0 true ";

   // create a new scanner with the specified String Object
   Scanner scanner = new Scanner(s);

   // print a line of the scanner
   System.out.println("" + scanner.nextLine());

   // change the delimiter of this scanner
   scanner.useDelimiter("Wor");

   // display the new delimiter
   System.out.println("" + scanner.delimiter());

   // close the scanner
   scanner.close();
    }    
}

//NOTE: The java.util.Scanner class is a simple text scanner which can parse 
        // primitive types and strings using regular expressions.

        // Following are the important points about Scanner:

        // (1) A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
        // (2) A scanning operation may block waiting for input.
        // (3) A Scanner is not safe for multithreaded use without external synchronization.

