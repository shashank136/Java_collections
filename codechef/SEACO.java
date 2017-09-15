import java.util.*;
import java.io.*;

public class SEACO
{

    public static void inc(int a[], int x, int y)
    {
        int k;
        for(k = x; k < y; k++)
        {
            a[k] += 1;
        }
    }

    public static void rep(int a[], int t[], int r[], int l[], int x, int y)
    {
        int k;
        for (k = x; k < y; k++)
        {
            if(t[k] == 1)
            {
                inc(a, r[k] - 1, l[k]);
            }
            else
            {
            	rep(a, t, r, l, r[k]-1, l[k]);
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int i, j, k;

        for(i = 0; i < tc; i++)
        {
            int s = sc.nextInt(); // size of array
            int n = sc.nextInt(); // number of instructions
            int a[] = new int[s]; // initializing array
            int t[] =  new int[n]; // type of instruction
            int r[] = new int[n]; // lower limit
            int l[] = new int[n]; // upper limmit
            for(j = 0; j < n; j++)
            {
                t[j] = sc.nextInt();
                r[j] = sc.nextInt();
                l[j] = sc.nextInt();
                if(t[j] == 1)
                {
                    inc(a, r[j] - 1, l[j]);

                }
                else
                {
                	rep(a, t, r, l, r[j]-1, l[j]);
                }
            }

            for(j=0; j<s; j++){
            	System.out.print(a[j]%1000000007+" ");
            }
        }
    }
}