import java.util.*;
import java.io.*;

public class Richierich
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String str = sc.next();
        char a[] = str.toCharArray();
        int b[] = new int[str.length()];
        int i, j;

        for(i = 0; i < a.length; i++)
        {
            b[i] = Character.getNumericValue(a[i]);
        }

        int mismatches = 0;
        for(i = 0; i < b.length / 2; i++)
        {
            if(b[i] !=  b[b.length - 1 - i])
            {
                mismatches++;
            }
        }

        if(t >= (mismatches * 2) )
        {
            for(i = 0; i < b.length / 2; i++)
            {
                if(b[i] !=  b[b.length - 1 - i])
                {
                    b[i] = 9;
                    b[b.length - 1 - i] = 9;
                }
            }
            for(i = 0; i < b.length; i++)
            {
                System.out.print(b[i]);
            }
        }
        else if(t < mismatches * 2)
        {
            if(t > mismatches)
            {
                j = t - mismatches;
                if(j >= 1)
                {
                    //int k = t;
                    while(t != 1)
                    {
                        int k = 0;
                        for (i = 0; i < b.length / 2 && t >= 2; i++)
                        {
                            if(b[i] !=  b[b.length - 1 - i])
                            {
                                b[i] = 9;
                                b[b.length - 1 - i] = 9;
                            }
                            t = t - 2;
                            k = i + 1;
                        }
                        i = k;
                        if(b[i] !=  b[b.length - 1 - i])
                        {
                            if(b[i] > b[b.length - 1 - i])
                            {
                                b[b.length - 1 - i] = b[i];
                            }
                            else if(b[i] < b[b.length - 1 - i])
                            {
                                b[i] = b[b.length - 1 - i];
                            }
                        }                        
                    }
                    for(i = 0; i < b.length; i++)
                    {
                        System.out.print(b[i]);
                    }
                }
                else
                {
                    for(i = 0; i < b.length/2; i++)
                    {
                        if(b[i] !=  b[b.length - 1 - i])
                        {
                            if(b[i] > b[b.length - 1 - i])
                            {
                                b[b.length - 1 - i] = b[i];
                            }
                            else if(b[i] < b[b.length - 1 - i])
                            {
                                b[i] = b[b.length - 1 - i];
                            }
                        }
                    }
                    for(i = 0; i < b.length; i++)
                    {
                        System.out.print(b[i]);
                    }
                }
            }
            else if(t==mismatches){
            	for(i = 0; i < b.length/2; i++)
                    {
                        if(b[i] !=  b[b.length - 1 - i])
                        {
                            if(b[i] > b[b.length - 1 - i])
                            {
                                b[b.length - 1 - i] = b[i];
                            }
                            else if(b[i] < b[b.length - 1 - i])
                            {
                                b[i] = b[b.length - 1 - i];
                            }
                        }
                    }
            }
            else if(t < mismatches)
            {
                System.out.println(-1);
            }

        }
    }
}