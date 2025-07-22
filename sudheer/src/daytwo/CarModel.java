package daytwo;

class CarModel1 {
	private String Model;
	private int Year;
	
	public void setModel(String model, int year) {
		this.Model = model;
		this.Year = year;
		
	}
	
	public String getModel() {
		return Model;
	}
	
	public int getYear() {
		return Year;
		
	}
}

public class CarModel {
	public static void main(String[] args) {
		CarModel c = new CarModel();
		c.setModel("Audi", 2000);
		System.out.println("Model Name:" + c.getModel());
		System.out.println("Model Year" + c.getYear());
	}
}