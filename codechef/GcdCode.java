import java.util.*;

class TestClass {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }
        
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // numbers of digits
        int m = sc.nextInt(); // number of edges
        int a[] = new int[n];
        int i,j,temp=0;
        
        for(i=0;i<n;i++){ // read the numbers into array
            a[i]=sc.nextInt();
        }
        for(i=0;i<m;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int X=a[x-1];int Y=a[y-1];
            if(temp==0){
                if(X>Y){temp= gcd(X,Y);} // gcd for initial path
                if(X<Y){temp= gcd(X,Y);}
            }else{
                temp=gcd(X,temp); // gcd after first edge is processed
                temp=gcd(Y,temp);
            }
        }
        System.out.println(temp);        
    }
}
