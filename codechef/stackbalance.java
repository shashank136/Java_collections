import java.util.*;
import java.io.*;

public class stackbalance{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc= sc.nextInt();
		int result[] = new int[tc];

		for(int i=0; i<tc; i++){
			String str = sc.next();
			char a[] = str.toCharArray();
			int count=0;
			for(int j=0; j<a.length; j++){
				if(a[j]=='('){count++;}
				if(a[j]==')'){count--;}
			}

			if(count==0){result[i]=0;}
			if(count>0){
				if(count==1){result[i]=1;}
				if(count>1){result[i]=0;}
			}
			if(count<0){
				if(count== -1 ){result[i]=1;}
				if(count< -1){result[i]=0;}
			}
		}

		for (int k=0; k<tc ; k++ ) {
			if(result[k]==1){System.out.println("YES");}
			if(result[k]==0){System.out.println("NO");}
		}
	}
}