import java.util.*;
import java.io.*;

public class permutation
{
    public static int pprint(int a[], int n)
    {
        int i,temp=1;
        for(i = 0; i < n; i++)
        {
        	if(a[i]!=i+1){
        		if(i==0){temp=a[i];}
        		else{
        			temp = (temp*10)+a[i];
        		}
        	}else{
        		temp=0;
        		break;
        	}
            //System.out.print(a[i]);
        }
        //System.out.println();
        if(temp!=0)
        	return temp;//System.out.println(temp);

        return 100000;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i, j;
        int a[] = new int [num];
        for(i = 0; i < num; i++)
        {
            a[i] = i + 1;
        }
        int temp,check=100000;
        for (j = 1; j <= num; j++)
        {
            for (i = 0; i < num - 1; i++)
            {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                int l = pprint(a, num);
                if(check > l){
                	check = l;
                }
            }
        }
        System.out.println(check);

    }
}