package Day9;

public class Wrapper_float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=24.2f;
		String str=String.valueOf(f);// float to string
		System.out.println(str+ " float to string ");
		
		String str2 ="43.9f";
		float f2= Float.parseFloat(str2); // string to float
		System.out.println(f2+ " string to float");

	}

}