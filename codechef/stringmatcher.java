import java.util.*;
import java.io.*;

class stringmatcher
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();// main search string
        int s = str.length(); // size of str
        int n = sc.nextInt(); // number of digits
        int i, j, count = 0;
        String a[] = new String[n];

        String b="";

        for (i = 0; i < n; i++)
        {
            b = b + Integer.toString(sc.nextInt()); // reads the digits for searching
        }
        
        // code to generate substring
        for (j = n; j <= s; j++)
        {
            for(i = 0; i <= s - 1 - (j - 1); i++)
            {
                String k = str.substring(i, i + j);
                int l = k.indexOf(b);
                if(l != -1)
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}