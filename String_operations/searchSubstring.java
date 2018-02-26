import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(); // main string "cwelcome"
        String s2 = sc.next(); // substring "com"
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        //int k = s1.length()-s2.length(); // 8-3=5
        int i=0;
        boolean flag = false;
        for(int j=0; j<s1.length(); j++){
            if(a[j]==b[i]){
                flag=true;
                i++;
            }
            else{
                flag=false;
                i=0;
            }
            if(i==s2.length() && a[j]==b[i-1]){
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("found");
        else
            System.out.println("not found");
    }
}
