import java.util.Scanner;

public class ScannerTest2
{
    public static void main(String[] args) 
    {

   String s = "Hello World! \n 3 + 3.0 = 6.0 true ";

   // create a new scanner with the specified String Object
   Scanner scanner = new Scanner(s);

   // print the next line
   System.out.println("" + scanner.nextLine());

   // print the next line again
   System.out.println("" + scanner.nextLine());

   // close the scanner
   scanner.close();
   }    
}

/* The java.util.Scanner.nextLine() method advances this scanner past the current line and returns 
    the input that was skipped. This method returns the rest of the current line,
    excluding any line separator at the end. The position is set to the beginning of the next line.
    Since this method continues to search through the input looking for a line separator,
    it may buffer all of the input searching for the line to skip if no line separators are present.*/