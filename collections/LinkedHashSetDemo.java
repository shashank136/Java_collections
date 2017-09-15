import java.util.*;

// it maintains the insertion order.
// accepts only unique objects like any other set.

class LinkedHashSetDemo
{
    public static void main(String args[])
    {

        LinkedHashSet<String> al = new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        LinkedHashSet<String> al2 = new LinkedHashSet<String>(al);
        al2.add("Shashank");
        al2.add("Kumar");
        al2.add("Manu");
        al2.add("Ravi");
        //al2.add(al);

        System.out.println();
        Iterator<String> itr = al2.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}