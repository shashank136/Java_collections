import java.util.*;
import java.io.*;

class Mover
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // enter number of test  cases

        for (int i = 0; i < t; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // no. of elements
            int d = Integer.parseInt(st.nextToken()); // mover

            int v[] = new int[n];
            StringTokenizer s = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
            {
                v[j] = Integer.parseInt(s.nextToken());
            }

            int count = 0;
            for (int l = 0; l < n; l++)
            {
                do
                {
                    if(v[l] < v[l + d])
                    {
                        v[l] += 1;
                        v[l + d] -= 1;
                        count++;
                    }
                    if(v[l] > v[l + d])
                    {
                        v[l] -= 1;
                        v[l + d] += 1;
                        count++;
                    }
                }while ((v[l] == (v[l + d] - 1)) || (v[l] - 1 == (v[l + d])) || (v[l]==v[l+d]) );
            }
            for(int k=0; k<n; k++){
            	System.out.print(v[k]+", ");
            }
        }
    }
}