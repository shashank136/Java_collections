import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample{
	public static void main(String agrs[]){
		String t = "It was the best of times";

		Pattern p = Pattern.compile("the");	// Pattern : defines a regular expression
		Matcher m = p.matcher(t);	// Specifies a string to search

		if(m.find()){
			System.out.println("Found the match!");
		}
	}
}