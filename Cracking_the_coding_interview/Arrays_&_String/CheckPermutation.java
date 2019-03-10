// Time complexity of the below function is O(n).

public class CheckPermutation{
	public boolean isPermutation(String s1, String s2){
		int ar[] = new int[128];

		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1!=l2)
			return false;

		for(int i=0; i<l1; i++){
			int x = s1.charAt(i);
			ar[x]++;
		}

		for(int i=0; i<l1; i++){
			int x = s1.charAt(i);
			if(ar[x]>0)
				ar[x]--;
			else
				ar[x]++;
		}

		for(int i=0; i<l1; i++){
			if(ar[i]>0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		CheckPermutation ch = new CheckPermutation();
		String s1 = "banana";
		String s2 = "naanba";
		String s3 = "naan";

		System.out.println(ch.isPermutation(s1,s2)?"Yes":"No");
		System.out.println(ch.isPermutation(s1,s3)?"Yes":"No");
	}
}