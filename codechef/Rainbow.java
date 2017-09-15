import java.util.*;
import java.io.*;

public class Rainbow
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
                    int t[] = new int[100];

                    int flag = 0;

                    StringTokenizer st = new StringTokenizer(br.readLine()); // read the inputs separated by spaces
                    /*for (int j = 0; j < ele; ++j)
                    {
                        t[j] = Integer.parseInt(st.nextToken());

                    }*/
                    int j = 0, f = 0;
                    while(st.hasMoreTokens())
                    {
                        t[j] = Integer.parseInt(st.nextToken());
                        j++;
                        f++;
                    }

                    int n = ele;
                    int m = 1;
                    int h = 0;
                    int size = f;
                    //System.out.println(f);
                    if(size == ele)
                    {
                        int flag2 = 0;
                        for(int r = 1; r < 8; r++)
                        {
                            int a =0;
                            for(int e = 0; e < ele; e++)
                            {
                                if(r == t[e]){a = 1;}
                                if(e == ele-1 && a == 0)
                                {
                                    //System.out.println("control is here" + r);
                                    flag = 1;
                                    k[l] = "no";
                                    flag2 = 1;
                                    break;
                                }
                            }
                        }

                        if(flag2 == 0)
                        {
                            for (int y = 0; y <= (n / 2) - 1; y++)
                            {
                                if ((t[y] >= 1 && t[y] <= 10)) // checking constraints for elements.
                                {
                                    if((t[y] == t[n - y - 1])) // checking each element with its counter part.
                                    {
                                        if((t[y] == m) || ((t[y] >= h) && (t[y] < m)))
                                        {
                                            /*System.out.println();
                                            System.out.println("inside for checking" + " " + y);
                                            System.out.println();
                                            System.out.println("current value: "+t[y]);
                                            System.out.println("current value of m: "+m);*/

                                            h = t[y];
                                            if(t[y] == m)
                                            {
                                                m++;
                                            }

                                        }
                                        else
                                        {
                                            flag = 1;
                                            k[l] = "no";
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
                            }
                        }
                    }
                    else
                    {
                        flag = 1;
                        k[l] = "no";
                    }


                    if((n % 2) != 0 && flag == 0)
                    {
                        //System.out.println("checking for odd number input");
                        int b = (n / 2) ;
                        /*System.out.println("mid ele: " + " " + t[(n / 2)]);
                        System.out.println("m: " + " " + m);
                        System.out.println("h: " + " " + h);*/
                        if ((t[(n / 2)] == m) || (t[(n / 2)] == h))
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
                else
                {
                    return;
                }
            }

            for (String val : k )
            {
                System.out.println(val);
            }


        }
    }
}