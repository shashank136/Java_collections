import java.util.*;

// using deque for stack operations

class Monkslove {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int q=sc.nextInt();
        int i,j;
        Deque<Integer> stack =new ArrayDeque<>();
        int a[] = new int[q];
        for(i=0;i<q;i++){
            a[i]=sc.nextInt();
            if(a[i]==1){
                if(stack.size()==0){
                    System.out.println("No Food");
                }else{
                    System.out.println(stack.pop());
                }
            }else if(a[i]==2){
                int b=sc.nextInt();
                stack.push(new Integer(b));
            }
        }
    }
}
