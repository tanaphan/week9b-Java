package wee9b;

public class Cat {
	//Class Attribute -State of an object
	String breed;
	String Size;
	String color;
	int age;
	
	
	//Class Methods -Behaviour of an object
	void data() {
		System.out.println("breed : "+ breed);
		System.out.println("Size : "+ Size);
		System.out.println("color : "+ color);
		System.out.println("age : "+ age);
	}
	void eat() {
		System.out.println("*****");
		System.out.println("Cat of Eat fish ");
	} 
	void run() {
		System.out.println("*****");
		System.out.println("Cat of Run kill rat ");
	}
	void sleep() {
		System.out.println("*****");
		System.out.println("Cat of sleeping ");
	}
	void looking() {
		System.out.println("*****");
		System.out.println("Cat like Looking owner ");
	}
	
	public static void main(String[]args) {
		Cat Luca = new Cat();
		Luca.breed="Norwegian";
		Luca.Size="Large";
		Luca.color="Green";
		Luca.age=5;
		Luca.data();
		Luca.eat();
		Luca.run();
		Luca.sleep();
		Luca.looking(); 
	}
}
