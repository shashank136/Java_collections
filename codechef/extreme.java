import java.util.*;
import java.io.*;

public class extreme
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // number of testcases
        int j, k, l;
        for(int i=0; i < tc; i++)
        {
            int s = sc.nextInt(); // size of arrays 1D
            int ar[] = new int[s]; // sample array having modified a array

            for (j = 0; j < s; j++)
            {
                ar[j] = sc.nextInt();
            }

            int a[] = new int[s]; // array a
            int b[] = new int[s]; // array b

            for (j = 0; j < s; j++)
            {
                b[j]=(ar[j])>>16; // get b array element
                a[j] = ar[j] - (b[j]<<16); // get a array element
            }

            System.out.println("Case "+(i+1)+":");
            
            for (j=0; j<s; j++) {
            	System.out.print(a[j]+" ");
            }
            System.out.println();
            for (j=0; j<s; j++) {
            	System.out.print(b[j]+" ");
            }
        }
    }
}