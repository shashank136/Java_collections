import java.util.*;
class Book
{
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name;
    }

    public boolean equals(Object o){
        System.out.println("In equals value is :"+this.name);
        Book b = (Book)o;
        if(b.getName().equals(this.name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        System.out.println("In hashcode value is :"+this.name);
        int hash = 3;
        hash = 7*hash + this.name.hashCode();
        return hash;
    }

}

public class HashSetExample
{
    public static void main(String[] args)
    {
        HashSet<Book> set = new HashSet<Book>();
        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8));
        set.add(new Book(101, "New way to Java ", "Yashwant Kanetkar", "BPB", 8));
        //Traversing HashSet

        System.out.println();
        for(Book b : set)
        {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}