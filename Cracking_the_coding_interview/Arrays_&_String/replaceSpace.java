public class replaceSpace{
	public String changeString(char[] c, int tl){
		int spacecount = 0;
		int fl = 0; // final length of the changed string

		for(int i=0; i<tl; i++){
			if(c[i]==' ')
				spacecount++;
		}

		fl = tl + spacecount*2;

		char[] ar = new char[fl];
		ar[fl-1] = '\0';
		for(int i=tl-1; i>=0; i--){
			if(c[i]!=' '){
				ar[fl-1] = c[i];
				fl--;
			}
			else{
				ar[fl-1] = '0';
				ar[fl-2] = '2';
				ar[fl-3] = '%';
				fl -= 3;
			}
		}

		//StringBuilder sb = new StringBuilder(ar);
		return String.valueOf(ar);
	}
	public static void main(String[] args) {

		replaceSpace rs = new replaceSpace();

		String str = "Mr John is smart   ";

		char c[] = str.toCharArray();
		int trueLength = 16;

		String ss = rs.changeString(c, trueLength);

		String s = str.replaceAll(" ","%20");

		System.out.println(s);
		System.out.println(ss);
	}
}