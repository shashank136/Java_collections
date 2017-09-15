import java.io.*;
import java.util.regex.*;

public class CharacterClassExample
{
    public static void main(String args[])
    {
        String t = "It was the best of times";

        Pattern p1 = Pattern.compile("w.s");	// match any character except end of line character.
        Matcher m1 = p1.matcher(t);
        if(m1.find())
        {
            System.out.println("Found: " + m1.group());
        }

        Pattern p2 = Pattern.compile("w[abc]s");	// match a, b, c.
        Matcher m2 = p2.matcher(t);
        if(m2.find())
        {
            System.out.println("Found: " + m2.group());
        }

        Pattern p3 = Pattern.compile("t[^eou]mes");	// match any character except e, o, u.
        Matcher m3 = p3.matcher(t);
        if(m3.find())
        {
            System.out.println("Found: " + m3.group());
        }

        String s = "Jo told me 20 ways to San Joes in 15 minutes";

        Pattern p4 = Pattern.compile("\\d\\d");	// \d - digits.
        Matcher m4 = p4.matcher(s);
        if(m4.find())
        {
            System.out.println("Found: " + m4.group());
        }

        Pattern p5 = Pattern.compile("\\sin\\s");	// in surrounded by two spacing characters.
        Matcher m5 = p5.matcher(s);
        if(m5.find())
        {
            System.out.println("Found: " + m5.group());
        }

        Pattern p6 = Pattern.compile("\\Sin\\S");	// in surrounded by two non spacing characters.
        Matcher m6 = p6.matcher(s);
        if(m6.find())
        {
            System.out.println("Found: " + m6.group());
        }

        String email = "george.washington@example.com";

        Pattern p = Pattern.compile("(\\S+?)\\.(\\S+?)@(\\S+)");
        Matcher m = p.matcher(email);
        if(m.find())
        {
            System.out.println();
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
            System.out.println();
            System.out.println(m.group(0));
        }
    }
}