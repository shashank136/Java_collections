import java.util.Scanner;

//NOTE: The java.util.Scanner class is a simple text scanner which can parse
// primitive types and strings using regular expressions.

// Following are the important points about Scanner:

// (1) A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
// (2) A scanning operation may block waiting for input.
// (3) A Scanner is not safe for multithreaded use without external synchronization.

public class ScannerTest
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in); // here we are reading from keyboard.

        System.out.println("enter your rollnumber");
        int rollNo = sc.nextInt();

        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("enter your fee");
        double fee = sc.nextDouble();

        System.out.println("rollno: " + rollNo + " name: " + name + " fee: " + fee);

    }

}
