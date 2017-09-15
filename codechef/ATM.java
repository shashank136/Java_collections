import java.util.*;
import java.io.*;
import java.text.*;

public class ATM
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(); // amount to withdraw
        double y = sc.nextDouble(); // balance
        //PrintWriter pw = new PrintWriter(System.out, true);
        DecimalFormat ft = new DecimalFormat("#.00");
        if(0 < x && x <= 2000 && x % 5 == 0)
        {
            if (0 < y && y <= 2000)
            {
                if ( x < y)
                {
                    y -= x;
                    y -= 0.50;
                    System.out.printf("%.2f",y);
                }
                else
                {
                    System.out.printf("%.2f",y);

                }
            }
            else
            {
                System.out.println(ft.format(y));
            }
        }
    }
}    