package Day6;

interface A{
	 default void show() {
		System.out.println("Interface from A");
	}
}
interface B{
	default void show() {
		System.out.println("Interface from B");
	}
}
class Machinerees implements A,B{

	 // Override the show() method to resolve the conflict because both interfaces have a default show() method
	@Override
	public void show() {
		A.super.show(); // A->show method calling
		B.super.show(); // B->show method calling
		
	}
	
}


public class Default_MultipleInheritance {
	public static void main(String[] args) {
		Machinerees sra = new Machinerees();
	    sra.show();
	}
    
}