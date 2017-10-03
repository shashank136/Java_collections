import java.util.*;
import java.io.*;

public class counting_sort{

	public static void countingsort(int a[],int size, int k){

		int c[] = new int[k]; // store the number of occurance of an element in array.
		int b[] = new int[size]; // output array.
		int i,j;

		// initializing array c.
		for (i=0; i<k; i++)
			c[i]=0;

		// storing the frequency of each element in array a into c.
		for(i=1; i<size; i++)
			c[a[i]] = c[a[i]]+1;

		// storing the rank for each element.
		for(i=1; i<k; i++)
			c[i] = c[i] + c[i-1];

		// updating the array b with sorted list of elements.
		for(j=size-1; j>0; j--){
			b[c[a[j]]] = a[j];
			c[a[j]] = c[a[j]]-1;
		}

		// print the output array
		for(i=1; i<size; i++){
			System.out.print(b[i]+" ");
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,i,k;
		size = sc.nextInt(); // if you need 8 then, put size=9
		k  = sc.nextInt(); // if you need 5 then, put k=6.

		int a[] = new int[size]; // will consider only 1 to size for elements ignoring the a[0].
		for (i=1; i<size; i++) { // assuming a[1..(size-1)]
			a[i]=sc.nextInt();
		}

		countingsort(a,size,k);
	}
}