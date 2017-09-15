import java.util.*;

// Collection: Linked List
// uses doubly linked list internally.

class Book{
	String name,author,publisher;
	int id,quality;

	public Book(int id,String name, String author, String publisher, int quality){
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quality = quality;
	}
}

public class LinkedListDemo_one{
	public static void main(String args[]){

		// Creating list of Books
		List<Book> list = new LinkedList<>();
		// Creating Books

		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

	    // Adding Book to list
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);

	    // Traversing list
	    for(Book b:list){
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quality);
	    }
	}
}