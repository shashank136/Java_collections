import java.util.*;

public class ScannerForTokenizer{
	public static void main(String args[]){
		Scanner s = null;
		StringBuilder sb = new StringBuilder(64);
		String line01 = "1.1, 2.2, 3.3";
		float fsum = 0.0f;

		s = new Scanner(line01).useDelimiter(", ");
		try{
			while(s.hasNextFloat()){
				float f = s.nextFloat();
				fsum += f;
				sb.append(f).append(" ");
			}
			System.out.println("Values found: "+sb.toString());
			System.out.println("Fsum: "+fsum);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}