import java.util.*;
import java.io.*;

public class AlexTask
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // number of test cases
        int time = 0;
        int result[] = new int[tc];

        for(int i = 0; i < tc; i++)
        {
        	time=0;
            int flag = 0;
            int scn = sc.nextInt(); // number of sensors
            int s[] = new int[scn]; // each sensor timing array

            for(int j = 0; j < scn; j++)
            {
                s[j] = sc.nextInt(); // each sensor timing
            }

            // code to sort an array
            Arrays.sort(s);
            time=s[0];
            System.out.println(time);

            while(flag != 1)
            {
                //time++;
                int check = 0;
                for(int k = 0; k < scn; k++)
                {
                    if(time % s[k] == 0)
                    {
                        check++;
                        System.out.println(time+" "+s[k]+" "+check);
                    }
                }
                if(check > 1)
                {
                    flag = 1;break;
                }
                time++;
            }
            result[i] = time;

        }

        for(int l = 0; l < tc; l++)
        {
            System.out.println(result[l]);
        }

    }
}