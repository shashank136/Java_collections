import java.util.*;

public class checkStr{

	public boolean checkString(String s1, String s2){
		boolean result = false;
		int ar[] = new int[128];
		Arrays.fill(ar, -1);
		int count = 0;
		int l1 = s1.length();
		int l2 = s2.length();

		if(Math.abs(l1-l2)>1)
			return false;

		for(int i=0; i<l1; i++){
			int x = s1.charAt(i);
			ar[x] = i;
		}

		for(int i=0; i<l2; i++){
			int x=s2.charAt(i);
			if(ar[x]==-1)
				count++;
			else{
				if(ar[x]==i){
					continue;
				}
				else if(Math.abs(ar[x]-i)==1)
					count++;
				else
					return false;
			}
		}

		if(l1-l2 == 1)
			count++;

		if(count<=1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		checkStr c = new checkStr();

		String s1 = "pales";
		String s2 = "pale";
		String s3 = "bale";
		String s4 = "bal";

		System.out.println(c.checkString(s1,s2)?"yes":"no");
		System.out.println(c.checkString(s2,s3)?"yes":"no");
		System.out.println(c.checkString(s2,s4)?"yes":"no");
	}
}
