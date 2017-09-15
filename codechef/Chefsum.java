import java.util.*;
import java.io.*;

public class Chefsum
{

    static int perfixsum(int x, int b[])
    {
        int sum = 0;
        for(int l = 0; l < x; l++)
        {
        	//System.out.println("inside prefixsum"+l);
            sum += b[l];
        }
        //System.out.println("----------"+sum+"-----------");
        return sum;
    }

    static int suffixsum(int x, int b[])
    {
        int rsum = 0;
        for(int l = b.length - 1; l > b.length - 1 - x; l--)
        {
        	//System.out.println("inside suffixsum"+l);
            rsum += b[l];
        }
        //System.out.println("----------"+rsum+"-----------");
        return rsum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int i, j;
        for(i = 0; i < tc; i++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            int temp = 0;
            for(j = 0; j < n; j++)
            {
                a[j] = sc.nextInt();
            }
            int check = 0;
            for(j = 0; j < n; j++)
            {
                if(check == 0)
                {
                    check++;
                    temp = perfixsum(j+1, a) + suffixsum(n-j, a);
                    //System.out.println(temp+" for :"+check);
                }
                else
                {
                	int y = perfixsum(j+1, a) + suffixsum(n-j, a);
                	
                    if(temp > y)
                    {
                        temp = y;
                        check = j+1;
                        //System.out.println(y+" for :"+check);
                    }
                }
            }
            System.out.println(check);
        }
    }
}