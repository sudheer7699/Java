package Day2;
import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
        int[] arr = {13, 90, 36, 24, 37};

        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }


}
