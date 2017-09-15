import java.util.*;
import java.io.*;

class Main
{

    public static void main(String[] args)
    {

        int cal_lcm(int a, int b)
        {
            int rem = 0;

            if(a > b)
            {
                rem = a % b;
            }
            else
            {
                rem = b % a;
            }

            if(rem != 0)
            {
                a = b;
                b = rem;
                rem = a % b;
            }

            return ((a * b) / b);

        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int result[] = new int[tc];

        for(int i = 0; i < tc; i++)
        {

            int scn = sc.nextInt();
            int s[] = new int[scn];
            for(int j = 0; j < scn; j++)
            {
                s[j] = sc.nextInt();
            }
            int temp = 0;
            for(int k = 0; k < scn; k++)
            {
                for(int l = k + 1; l < scn; l++)
                {
                    int x = cal_lcm(s[k], s[l]);
                    if(temp > x)
                    {
                        temp = x;
                    }
                }
            }
            result[i] = temp;
        }

        for(int f = 0; f < tc; f++)
        {
            System.out.println(result[f]);
        }
    }
}