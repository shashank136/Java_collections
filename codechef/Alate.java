import java.util.*;

public class Alate
{
    static int func(int []A, int x, int N, int y)
    {
        int sum = 0 ;
        for(int i = x; i <= N; i += y)
        {
            //System.out.println(i);
            sum = (sum + A[i] * A[i]) ;
            //System.out.println("------ sum :"+sum+" ,A value :"+A[i]+",A^2 value :"+A[i]*A[i]);
        }
        return sum ;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // number of testcases
        int i, j, k;

        for(i = 0; i < tc; i++)
        {
            int N = sc.nextInt(); // size of array
            int Q = sc.nextInt(); // number of queries
            int ar[] = new int[N];
            for(j = 0; j < N; j++)
            {
                ar[j] = sc.nextInt();
            }
            for(j = 0; j < Q; j++)
            {
                int ch = sc.nextInt();
                if(ch == 1)
                {
                    int x = sc.nextInt();
                    //if(x==0){System.out.println(func(ar,x,N-1,x));}
                    //else{
                    System.out.println(func(ar, x - 1, N - 1, x)%1000000007);
                }

                else if(ch == 2)
                {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    ar[x - 1] = y;
                    //System.out.println(ar[x-1]);
                }
            }
        }
    }
}