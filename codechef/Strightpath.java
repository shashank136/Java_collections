import java.util.*;
import java.io.*;

public class Strightpath
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner();
    	int n= sc.nextInt(); // number of lines
    	int m= sc.nextInt(); // number of characters in each line
    	int vx,hx,i,j,vy,hy;
    	char a[][] = new char[n][m];
    	for (i=0; i<n; i++ ) {
    		for(j=0;j<m;j++){
    			a[i][j]= sc.nextChar(); // reading each character
    			if(a[i][j]=='V'){
    				vx=i;vy=j;
    			}
    			if(a[i][j]=='H'){
    				hy=j;hx=i;
    			}
    		}
    	}
        int turn=0;
    	while(a[i][j]!="H"){
            i=vx;j=vy;
            
        }
    }
}