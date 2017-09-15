import java.util.*;
import java.io.*;

public class Matpan{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int tc = sc.nextInt();
		int i,j;
		int []sum=new int[tc];
		for(i=0;i<tc;i++){
			int p[]=new int[26];
			
			for (j=0; j<26; j++) {
				p[j]=sc.nextInt();
			}

			String s= sc.next();
			//System.out.println(s);

			int l= s.length();
			for(j=97;j<123;j++){
				char b=(char)j;
				int x = s.indexOf(b);
				if(x==-1){
					sum[i] += p[j-97];
					//System.out.println(p[j-97]);
				}
			}

		}
		for(i=0;i<tc;i++){
			System.out.println(sum[i]);
		}
	}
}