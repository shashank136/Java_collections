import java.util.*;

// When you want to add user-defined objects in Priority Queue, you must implement Comaparable interface.

class Book implements Comparable<Book>
{
    int id;
    String  name, author, publisher;
    int quantity;

    public Book(int id, String name,  String author, String publisher, int quantity)
    {
        this.id = id;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int compareTo(Book b)
    {
        if(id > b.id)
        {
            return 1;
        }
        else if(id < b.id)
        {
            return -1;
        }
        else
        {
            return 0;
        }

    }
}

public class PriorityQueueExample
{
    public static void main(String args[])
    {
        Queue<Book> queue = new PriorityQueue<>();

        // Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8); // 2nd
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6); // 3rd
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4); // 1st

        // Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);

        System.out.println("Traversing the queue elements:");
        System.out.println();
        //Traversing queue elements
        for (Book b : queue)
        {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        queue.remove();

        System.out.println();
        System.out.println("After removing one book record:");
        System.out.println();
        for(Book b : queue)
        {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}