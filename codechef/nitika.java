import java.util.*;
 
public class Main
{
    public static void main(String args[])
    {
        try
        {
            int num;
            Scanner s = new Scanner(System.in);
            num = s.nextInt(); // Number of test cases
 
            if(num > 0 && num <= 100)
            {
                List<String> FName = new LinkedList<>();
 
                Scanner sc = new Scanner(System.in);
                for(int i = 0; i < num; i++)
                {
                    FName.add(sc.nextLine());
                }
 
                Iterator<String> itr = FName.iterator();
 
                while(itr.hasNext())
                {
                    String temp = itr.next();
                    String pn[] = temp.split(" ");
                    //System.out.println(Arrays.toString(pn));
                    int len = pn.length;
                    if(len == 1)
                    {
                        if(pn[0].length() >= 2 && pn[0].length() <= 10)
                        {
                            String fltr = (pn[0].substring(0, 1)).toUpperCase();
                            String rest = (pn[0].substring(1, (pn[0].length()))).toLowerCase();
                            System.out.println(fltr + rest);
                        }
                    }
                    else if (len == 2)
                    {
                        boolean flag = false;
                        for(int i = 0; i < 2; i++)
                        {
                            if(pn[0].length() >= 2 && pn[0].length() <= 10)
                            {
                                if(pn[1].length() >= 2 && pn[0].length() <= 10)
                                {
                                    flag = true;
                                }
                            }
                        }
                        if(flag == true)
                        {
                            String fltr = (pn[0].substring(0, 1)).toUpperCase();
                            String sltr = (pn[1].substring(0, 1)).toUpperCase();
                            String rest = (pn[1].substring(1, (pn[1].length()))).toLowerCase();
                            System.out.println(fltr + ". " + sltr + rest);
                        }
                    }
                    else
                    {
                        boolean flag = false;
                        for(int i = 0; i < 2; i++)
                        {
                            if(pn[0].length() >= 2 && pn[0].length() <= 10)
                            {
                                if(pn[1].length() >= 2 && pn[0].length() <= 10)
                                {
                                    if (pn[2].length() >= 2 && pn[0].length() <= 10)
                                    {
                                        flag = true;
                                    }
                                }
                            }
                        }
                        if(flag == true)
                        {
                            String fltr = (pn[0].substring(0, 1)).toUpperCase();
                            String sltr = (pn[1].substring(0, 1)).toUpperCase();
                            String tltr = (pn[2].substring(0, 1)).toUpperCase();
                            String rest = (pn[2].substring(1, (pn[2].length()))).toLowerCase();
                            System.out.println(fltr + ". " + sltr + ". " + tltr + rest);
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
} 
