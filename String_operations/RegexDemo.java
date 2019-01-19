import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo{
	public static void main(String[] args) {
		String str = "java version \"11.0.1\" 2018-09-25";
		System.out.println(str);

		Pattern pattern = Pattern.compile("(\\d*)\\.(\\d)\\.(\\d*)");
		Matcher matcher = pattern.matcher(str);

		if(matcher.find()){
			System.out.println(matcher.group());
		}
	}
}