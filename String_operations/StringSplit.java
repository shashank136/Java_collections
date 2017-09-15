import java.io.*;

// Method one to parse a string.

public class StringSplit{
	public static void main(String args[]){
		String shirts = "Blue Shirt, Red Shirt, Black Shirt, Maroon Shirt";

		String [] result =  shirts.split(", ");
		for (String shirtstr : result) {
			System.out.println(shirtstr);
		}
	}
}