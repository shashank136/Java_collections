import java.util.*;
import java.io.*;

public class merge_sort
{

    public static void merge(int a[], int start, int end, int mid)
    {

        int n1 = mid - start + 1;
        int n2 = end - mid;
        int i, j;

        // create new arrays to store sub-arrays
        int b[] = new int[n1];
        int c[] = new int[n2];

        for(i = 0; i < n1; i++)	// reading elements of first half into array b.
        {
            b[i] = a[start + i];
        }

        for(i = 0; i < n2;	i++)	// reading elements of second half into array c.
        {
            c[i] = a[mid + 1 + i];
        }

        i = 0;
        j = 0;

        int k = start;

        while(true)
        {
            if(i < n1 && j < n2)
            {
                if(b[i] < c[j])
                {
                    a[k] = b[i];
                    k++;
                    i++;
                }
                else
                {
                    a[k] = c[j];
                    k++;
                    j++;
                }
            }
            else
            {
                if(i < n1)
                {
                    a[k] = b[i];
                    k++;
                    i++;

                }
                else if(j < n2)
                {
                    a[k] = c[j];
                    k++;
                    j++;
                }
                else
                {
                    break;
                }
            }
        }
    }

    public static void mergeSort(int a[], int start, int end)
    {
        if(start < end)
        {
            int mid = (start + end) / 2;

            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, end, mid);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size, start = 0, end = 0;
        int i, flag = 1;
        size = sc.nextInt(); // read the size of array
        int a[] = new int[size];

        for (i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        start = 0;
        end =  size - 1;

        if(start < end)
        {
            mergeSort(a, start, end);
        }
        else
        {
            System.out.println(a[start]);
            flag = 0;
        }

        if(flag == 1)
        {
            for(i = 0; i < size; i++)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}