import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Nondsubset
{
    static int total=0;

    static int cal(int a[]){ // method

        int n=a.length;
        int sum = 0;
        //int total = 0;
        int count = 0;
        for(i = 1; i < (1 << n); i++)
        {
            sum = 0;
            count = 0;
            List<Integer> num = new ArrayList<>();
            for(j = 0; j < n; j++)
            {
                if((i & (1 << j)) > 0)
                {
                    count++;
                    sum += a[j];
                    num.add(new Integer(a[j]));
                    //System.out.print(a[j]+" ");
                }
            }
            //System.out.println("    |"+" count :"+count);

            if(count > 1)
            {
                if(count == 2)
                {   
                    if(sum % 3 != 0)
                    {
                        if(total < count && count < n)
                        {
                            total = count;
                        }
                    }
                }
                else if(count>2){
                    Iteratir<Integer> itr= num.iterator();
                    int b[]=new int[count];
                    while(itr.hasnext()){
                        b[i] = itr.next().intValue();
                    }
                    cal(b);
                }
            }
            //System.out.println("    |"+" count :"+count+", total :"+total);
        }
        return n;
    }

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of integers
        int k = sc.nextInt(); // key
        int a[] = new int[n];
        int i, j;
        for(i = 0; i < n; i++) // reading the numbers for the array
        {
            a[i] = sc.nextInt();
        }

        // code to generate all possible subset of the array of integers
        /*int sum = 0;
        int total = 0;
        int count = 0;
        for(i = 1; i < (1 << n); i++)
        {
            sum = 0;
            count = 0;
            for(j = 0; j < n; j++)
            {
                if((i & (1 << j)) > 0)
                {
                    count++;
                    sum += a[j];
                    //System.out.print(a[j]+" ");
                }
            }
            //System.out.println("    |"+" count :"+count);

            if(count > 1)
            {
                if(count == 2)
                {
                    if(sum % 3 != 0)
                    {
                        if(total < count && count < n)
                        {
                            total = count;
                        }
                    }
                }
                else if(count>2){

                }
            }
            //System.out.println("    |"+" count :"+count+", total :"+total);
        }*/

        total = cal(a);

        System.out.println(total);
    }
}