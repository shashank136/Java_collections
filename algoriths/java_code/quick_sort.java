import java.util.*;
import java.io.*;

public class quick_sort
{

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quicksort(int a[], int start, int end)
    {
        if(start < end)
        {
            int index = partition(a, start, end);
            quicksort(a, start, index - 1);
            quicksort(a, index + 1, end);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size, i;

        size = sc.nextInt();
        int a[] = new int[size];

        for(i = 0; i < size; i++)
            a[i] = sc.nextInt();

        quicksort(a, 0, size - 1);

        for (i = 0; i < size; i++)
            System.out.print(a[i] + " ");
    }
}