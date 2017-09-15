// example for Anonymous class in java

abstract class Person{
	abstract void eat();
}

public class AnonymousExampleClass{
	public static void main(String args[]){
		Person p = new Person(){
			void eat(){
				System.out.println("This is inside an Anonymous class");
			}
		};

		p.eat();
	}
}