package Day6;


interface methodA{
	static void show() {
		System.out.println("Message from A interface");
	}
	static int add(int a, int b) {
		return a+b;
	}
}
interface methodB{
	static void show() {
		System.out.println("message from B");
	}
	static int add(int a, int b) {
		return a*b;
	}
}

class inheritanceConcept implements methodA, methodB{
	static void show() {
		System.out.println("message from class");
	}
	static int add(int a, int b) {
		return a-b;
	}
}

public class Static_MultipleInterface {
	   public static void main(String[] args) {
	       // Correct: calling static methods using class name, not object
	       inheritanceConcept.show(); // → message from class
	       System.out.println(inheritanceConcept.add(12, 30)); // → subtraction → -18

	       // Static methods from interface A
	       methodA.show(); // → Message from A interface
	       int y = methodA.add(12, 43); // → 55
	       System.out.println("Output of y: " + y);

	       // Static methods from interface B
	       methodB.show(); // → message from B
	       int x = methodA.add(12, 23); // again from methodA
	       System.out.println("Output of x: " + x);
	   }
	}