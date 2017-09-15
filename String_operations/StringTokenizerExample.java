import java.util.*;

public class StringTokenizerExample{
	public static void main(String args[]){
		String shirts = "Blue Shirt, Red Shirt, Black Shirt, Maroon Shirt";

		StringTokenizer st = new StringTokenizer(shirts, ", "); //both commas and spaces are used as delimiters.
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}