import java.util.*;

class Queuetest {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        Deque<Integer> que= new ArrayDeque<>();
        
        for(i=0;i<n;i++){
            char a= sc.next().charAt(0); // reads a character using Scanner
            if(a=='E'){
                int b=sc.nextInt();
                que.add(new Integer(b));
                System.out.println(que.size());
            }else if(a=='D'){
                if(que.size()==0){
                    System.out.println(-1+" "+que.size());
                }else{
                    int c = que.remove();
                    System.out.println(c+" "+que.size());
                }
            }
        }
    }
}
