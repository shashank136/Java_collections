import java.util.*;
import java.io.*;

public class Elevator
{

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int result[] = new int[tc];
        for(int i = 0; i < tc; i++)
        {
            int N = sc.nextInt();
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            
            if((double)N * Math.sqrt(2)/v1 > (double)2*N/v2)
            {
                result[i] = 1; // 1 for Elevator
            }
            else
            {
                result[i] = 0; // 0 for Stairs
            }
        }

        for(int j = 0; j < tc; j++)
        {
            if(result[j] == 0)
            {
                System.out.println("Stairs");
            }
            else if (result[j] == 1)          	
            {
                System.out.println("Elevator");
            }
        }
    }
}