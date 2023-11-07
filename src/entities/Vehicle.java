package entities;

public class Vehicle {
	
	protected String plate;
	protected Integer year;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String plate, Integer year) {
		this.plate = plate;
		this.year = year;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	public String toString() {
		return "Plate: " + plate + ", Year: " + year;
	}

}
