package Day6;


interface Addition {
 int add(int a, int b);
}

interface Subtraction {
 int subtract(int a, int b);
}

//Final class - can't be inherited
class CalculatorUtils {
 // final method - can't be overridden
 public final void displayWelcomeMessage() {
     System.out.println("Welcome to the Multi-Inheritance Calculator App");
 }
}


class Calculator extends CalculatorUtils implements Addition, Subtraction {

 private final String appVersion = "1.0";

 @Override
 public int add(int a, int b) {
     return a + b;
 }

 @Override
 public int subtract(int a, int b) {
     return a - b;
 }

 public void displayVersion() {
     System.out.println("App Version: " + appVersion);
 }

}


public class Multiple_Inheritance {
  public static void main(String[] args) {
     Calculator calc = new Calculator();
     
     // final method from final class
     calc.displayWelcomeMessage();

     // final variable usage
     calc.displayVersion();

     // Performing operations
     int sum = calc.add(20, 15);
     int diff = calc.subtract(20, 15);

     System.out.println("Addition Result: " + sum);
     System.out.println("Subtraction Result: " + diff);
 }
}
