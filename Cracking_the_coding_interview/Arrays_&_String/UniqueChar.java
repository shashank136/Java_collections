// Time complexity of the below code is O(n).

public class UniqueChar{

	public boolean hasUniqueChar(String str){
		int ar[] = new int[128];
		int n = str.length();
		boolean result = true;

		for(int i=0; i<n; i++){
			int x = str.charAt(i);
			ar[x]++;
			if(ar[x]>1){
				result = false;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		UniqueChar uc = new UniqueChar();
		String s1 = "aabccd";
		String s2 = "abcd";

		System.out.println(uc.hasUniqueChar(s1)?"String has all unique characters.":"String has duplicate characters.");
		System.out.println(uc.hasUniqueChar(s2)?"String has all unique characters.":"String has duplicate characters.");
	}
}