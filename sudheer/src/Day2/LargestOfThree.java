package Day2;

public class LargestOfThree {
	public static void main(String[] args) {
        int a = 7, b = 25, c = 64;

        if (a >= b && a >= c)
            System.out.println("Largest is: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest is: " + b);
        else
            System.out.println("Largest is: " + c);
    }


}
