public class CompressStr{

	public String compressString(String s){
		char c = s.charAt(0);
		int n = 1;
		int l = s.length();
		StringBuilder sb = new StringBuilder();

		for(int i=1; i<l; i++){
			if(s.charAt(i)==c)
				n++;
			else{
				sb.append(c);
				sb.append(n);
				c = s.charAt(i);
				n=1;
			}
			if(i==l-1){
				sb.append(c);
				sb.append(n);
			}
		}

		if(sb.length() < l)
			return sb.toString();
		else
			return s;
	}

	public static void main(String[] args) {

		CompressStr c = new CompressStr();
		String s = "aabcccccaaa";

		System.out.println(c.compressString(s));
	}
}