package Collections;

import java.util.ArrayList;

public class JavaCollections {
	class department
	{
		private String name;
		private double sales;
		private double expenses;
		
		public department(String name, double sales, double expenses) {
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
			
		}
		public double getprofit() {
			return sales-expenses; 
		}

		public String getName() {
			return name;
		}
		
	}
	public static void main(String[] args)
	{
		ArrayList<department> depart = new ArrayList<>();
		
		
	}

}
