import java.util.*;
import java.io.*;

// hacker Rank question.
class Kdevices{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i,j;
		int n = sc.nextInt(); // number of devices
		int k = sc.nextInt(); //min. number of devices
		int x[] = new int[n];
		int y[] = new int[n];
		int dist[] = new int[n];
		for (i=0; i<n; i++) { // read x coordinates 
			x[i]= sc.nextInt();
		}
		for (i=0; i<n; i++) { // read y coordinates
			y[i]= sc.nextInt();
		}

		//int dist=0;
		for (i=0; i<n; i++) {
			int temp = (int)Math.ceil(Math.sqrt(Math.pow(x[i],2) + Math.pow(y[i],2)));
			//if(dist< temp){
				dist[i] =temp;
			//}
		}
		Arrays.sort(dist);
		int count=0;
		
		//int t = (int)dist[k-1];

		System.out.println(dist[k-1]);
	}
}