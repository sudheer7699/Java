package Day2;

public class SumArray {
	public static void main(String[] args) {
		int[] numbers = {13, 17, 23, 34};
		
		int sum = 0;
		
		for (int num : numbers) {
			sum += num;
		}
		
		System.out.println("Sum : " + sum);

	}
}