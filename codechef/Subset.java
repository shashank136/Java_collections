import java.util.*;
import java.io.*;

public class Subset{
	
	static void printsubset(int a[]){
		int n = a.length; // if n = 4

		for(int i=1; i < (1<<n); i++){ // 16 // start with 0 for including the empty set
			for(int j=0; j < n; j++){
				if((i & (1<<j)) > 0){
					System.out.print(a[j]+" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,k;
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		printsubset(a);
	}
}