import java.util.*;
import java.io.*;

public class bubble_sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size, i, j;
        size = sc.nextInt();

        int a[] = new int[size];

        for(i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        // bubble sorting start:
        j=size-1;
        while(j>=3){
        	for (i=0; i<j; i++) {
        		if(a[i]>a[i+1]){ // 2,3
        			a[i]=a[i]+a[i+1]; // 1:5
        			a[i+1]=a[i]-a[i+1]; // 2:(5-3)=2
        			a[i]=a[i]-a[i+1];	// 1:(5-2)=3
        		}
        	}
        	--j;
        }

        for(i=0;i<size;i++){
        	System.out.print(a[i]+" ");
        }
    }
}