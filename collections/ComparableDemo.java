import java.util.*;
import java.io.*;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;

	public Student(int  rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st){
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}

public class ComparableDemo{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<>();

		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));

		Collection.sort(al);
		for(Student st:al){
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}