public class CheckPalindrom{
	public static void main(String[] args) {
		
		String str = "Tact Coa";
		str = str.toLowerCase(); // convert the string to lower case
		boolean flag = false;
		
		int l = str.length();
		int ar[] = new int[128];

		for(int i=0; i<l; i++){
			char c = str.charAt(i);
			if(c !=' '){
				int x = c;
				ar[x]++;
			}
		}

		for(int i=0; i<128; i++){
			if(ar[i]%2!=0 && !flag)
				flag = true;
			else if(ar[i]%2!=0 && flag){
				flag = false;
				break;
			}				
		}

		if(flag)
			System.out.println("It's a Palindrome");
		else
			System.out.println("not a Palindrome");
	}
}