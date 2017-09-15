import java.util.*;
import java.io.*;
 
public class Chngor{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
int tc = sc.nextInt(); // number of test cases
int result[] = new int[tc]; // reults set
 
for(int i=0; i<tc; i++){
 
int n = sc.nextInt();
int nums[] = new int[n];
 
for(int j=0; j<n; j++){ // read each element
nums[j] = sc.nextInt();
}
result[i] = 0;
for(int k=0;k<n;k++){
result[i] = result[i] | nums[k];
}
}
 
for(int l=0; l<tc; l++){
System.out.println(result[l]);
}
}
} 