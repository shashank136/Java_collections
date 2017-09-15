import java.util.*;
import java.io.*;

public class FILLMTR
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // number of test cases
        int i, j, k;

        for(i = 0; i < tc; i++)
        {
            int s = sc.nextInt(); // size of array
            int b[][] = new int[s][s];
            int a[] = new int[s];
            Arrays.fill(a, -1);
            int flag = 0;
            int q = sc.nextInt(); // no. of queries
            for (j = 0; j < q; j++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                b[x - 1][y - 1] = sc.nextInt();
                if(b[x - 1][y - 1] == 0)
                {
                    if(a[x - 1] == -1 && a[y - 1] == -1)
                    {
                        a[x - 1] = 1;
                        a[y - 1] = 1;
                    }
                    else if(a[x - 1] == -1 && a[y - 1] != -1)
                    {
                        a[x - 1] = a[y - 1];
                    }
                    else if(a[x - 1] != -1 && a[y - 1] == -1)
                    {
                        a[y - 1] = a[x - 1];
                    }
                    else if(b[x - 1][y - 1] != Math.abs(a[x - 1] - a[y - 1]))
                    {
                        System.out.println("no");
                        flag = 1;
                        break;
                    }
                }
                if(b[x - 1][y - 1] == 1)
                {
                    if(a[x - 1] == -1 && a[y - 1] == -1)
                    {
                        a[x - 1] = 1;
                        a[y - 1] = 2;
                    }
                    else if(a[x - 1] == -1 && a[y - 1] != -1)
                    {
                        a[x - 1] = a[y - 1] + 1;
                    }
                    else if(a[x - 1] != -1 && a[y - 1] == -1)
                    {
                        a[y - 1] = a[x - 1] + 1;
                    }
                    else if(b[x - 1][y - 1] != Math.abs(a[x - 1] - a[y - 1]))
                    {
                        System.out.println("no");
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag != 1)
            {
                System.out.println("yes");
            }
        }
    }
}