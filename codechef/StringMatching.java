import java.util.*;
import java.io.*;
import java.util.regex.*;

class StringMatching
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String str = br.readLine(); // main search string
        int s = str.length();

        //System.out.println("size of source string :" + s);

        int n = sc.nextInt(); // number of digits
        int i, j, count = 0;
        String a[] = new String[n];


        for (i = 0; i < n; i++)
        {
            a[i] = Integer.toString(sc.nextInt()); // reads the digits for searching
        }

        String b = a[0];

        for(i = 1; i < n; i++)
        {
            b = b + a[i]; // generates the pattern to be searced for
        }

        //System.out.println("b :" + b);

        // code to generate substring
        for (j = n; j <= s; j++)
        {
            //System.out.println("j :" + j);
            for(i = 0; i <= s - 1 - (j - 1); i++)
            {
                Pattern p = Pattern.compile(b);
                //System.out.println("search string :" + str.substring(i, i + j)+", i :"+i+", j :"+j);
                Matcher m = p.matcher(str.substring(i, i + j));
                if(m.find())
                {
                    count++;
                    //System.out.println("count :"+count);
                }
            }
        }

        System.out.println(count);
    }
}