import java.util.*;
import java.io.*;

public class insertion_sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size, i, j=0, temp=0;
        size = sc.nextInt();
        int a[] = new int[size];

        // reading the array elements
        for(i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        // insertion sort code
        // in-place sorting technique
        for(i = 1; i < size; i++)
        {
        	temp = a[i];
            for (j = i; j > 0; j--)
            {
            	if (a[j]<a[j-1]) {
            		a[j]=a[j-1];
            		a[j-1]=temp;
            	}

            }
        }
        
        // displaying the new sorted array
        for(i = 0; i < size; i++)
        {
            System.out.print(a[i]+", ");
        }

    }
}