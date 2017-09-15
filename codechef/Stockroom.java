/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stockroom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int j=0,i=0,tc=0;
	int time=0,temp=0;;
	int slot[] = new int[26];
	int value=0;
	
	Scanner sc = new Scanner(System.in);
	tc = sc.nextInt();
	
	int ts[] = new int[tc]; // value
	int t[] = new int[tc]; // ascii output
	
	for(int k=0; k<tc; k++){
	   
	time = sc.nextInt();
	for(i=0; i<26; i++){
	    slot[i] = sc.nextInt();
	}
	
	for(i=0;i<26;i++){
	    for(j=i+1;j<26;j++){
	        if(slot[i]>slot[j]){
	            temp = slot[j];
	            slot[j]=slot[i];
	            slot[i]=temp;
	        }
	    }
	}
	
	value= time/slot[0];
	ts[k] = value;
	t[k] = slot[0];
	}
	
	for(int l=0;l<tc;l++){
	    
	System.out.println(ts[l]);
	for(j=0; j<ts[l]; j++){
	    System.out.print((char)(t[l]+99));
	}
	System.out.println();
	}
	
	}
}
