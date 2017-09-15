import java.util.*;
import java.io.*;

public class CHEFPDIG
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int i, j, k;

        for(i = 0; i < tc; i++)
        {
            int n = sc.nextInt();
            List<Integer> ls = new ArrayList<>();

            while(n > 0)
            {
                ls.add(n % 10);
                n = n / 10;
            }
            Integer a[] = new Integer[ls.size()];
            a = ls.toArray(a);

            TreeSet<Character> s = new TreeSet<>();

            for(j = 0; j < a.length; j++)
            {
                int temp1 = 0, temp2 = 0;                
                for(k = j + 1; k < a.length; k++)
                {                    
                    temp1 = (10 * a[j]) + a[k];
                    temp2 = (10 * a[k]) + a[j];
                    if(temp1 > 64 && temp1 < 91)
                    {
                        char x = (char)temp1;
                        s.add(x);                        
                    }
                    if(temp1 != temp2)
                    {                        
                        if(temp2 > 64 && temp2 < 91)
                        {                           
                            char x = (char)temp2;
                            s.add(x);                            
                        }
                    }
                }
            }            

            for(Character ch : s)
            {
                System.out.print(ch);
            }          
        }
    }
}