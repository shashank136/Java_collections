import java.io.*;

public class StringMethodsExample{
	public static void main(String args[]){
		PrintWriter pw = new PrintWriter(System.out, true);
		String t1 = "It was the best of times";
		String t2 = "It was the worst of times";

		if(t1.equals(t2)){
			pw.println("String matched....");
		}
		if(t1.contains("It was")){
			pw.println("It was found");
		}
		String temp = t2.replace("w", "zw");
		pw.println(temp);
		pw.println(t2.substring(5, 12));
	}
}