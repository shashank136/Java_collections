import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        int tc; // read number of test cases

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tc = Integer.parseInt(br.readLine());
        if(tc >= 1 && tc <= 100)
        {

            String k[] = new String[tc]; // read the output for each intput into k array.

            for (int i = 0, l = 0; i < tc ; i++, l++ )
            {
                int ele = Integer.parseInt(br.readLine()); // read number of inputs for each test case

                if(ele >= 7 && ele <= 100)
                {
                    int t[] = new int[ele];

                    int flag = 0;

                    StringTokenizer st = new StringTokenizer(br.readLine()); // read the inputs separated by spaces
                    for (int j = 0; j < ele; ++j)
                    {
                        t[j] = Integer.parseInt(st.nextToken());
                    }
                    int n = ele;
                    int m = 1;
                    int h = 0;

                    for (int y = 0; y <= (n / 2) - 1; y++) // checking each element with its counter part
                    {
                        if((t[y] == t[n - y - 1]) && ((t[y] <= m) || (t[y] >= h)) && (t[y] >= 1 && t[y] <= 10) )
                        {
                            //System.out.println("inside for checking" + " " + y);
                            h = t[y];
                            if(t[y] == m)
                            {
                                m++;
                            }

                        }
                        else
                        {
                            //System.out.println("changing for wrong input");
                            k[l] = "no";
                            flag = 1;
                            break;
                        }
                    }


                    if((n % 2) != 0 && flag == 0)
                    {
                        //System.out.println("checking for odd number input");
                        int b = (n / 2) ;
                        //System.out.println("mid ele: " + " " + t[(n / 2)]);
                        //System.out.println("m: " + " " + m);
                        if (t[(n / 2)] == m)
                        {
                            //System.out.println("Here");
                            k[l] = "yes";
                        }
                        else
                        {
                            k[l] = "no";
                        }
                    }
                    else if((n % 2 == 0) && flag == 0)
                    {
                        k[l] = "yes";
                    }

                }
            }

            for (String val : k )
            {
                System.out.println(val);
            }


        }
    }
}