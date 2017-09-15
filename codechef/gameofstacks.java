import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class gameofstacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt(); // no. of games
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt(); // size of stack a
            int m = in.nextInt(); // size of stack b
            int x = in.nextInt(); // ckeck value
            int[] a = new int[n]; // stack a
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m]; // stack b
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            int count=0;
            int sum=0,i=0,j=0;
            while(sum<x-1){
                int p=0,q=0;
                if(i<n){
                    p=a[i];                    
                }
                if(j<m){
                    q=b[j];
                }
                if(p<q){
                    i++;
                    sum += p;
                    System.out.println("removed from A stack :"+p+", sum :"+sum);
                    count++;
                }else if(q<p){
                    j++;
                    sum += q;
                    System.out.println("removed from B stack :"+q+", sum :"+sum);
                    count++;
                }else if(q==p){
                    if(a[i+1]>b[j+1]){
                        j++;sum += q;count++;
                        System.out.println("removed from A stack :"+p+", sum :"+sum);
                        count++;
                    }
                    else if(a[i+1]<=b[j+1]){
                        i++;sum += p;count++;
                        System.out.println("removed from B stack :"+q+", sum :"+sum);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
