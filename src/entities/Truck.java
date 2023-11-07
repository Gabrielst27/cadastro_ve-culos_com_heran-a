package entities;

public class Truck extends Vehicle {
	
	private Integer axles;
	
	public Truck() {
		super();
	}

	public Truck(String plate, Integer year, Integer axles) {
		super(plate, year);
		this.axles = axles;
	}

	public Integer getAxles() {
		return axles;
	}

	public void setAxles(Integer axles) {
		this.axles = axles;
	}
	
	public String toString() {
		return "Plate: " + plate + ", Year: " + year + ", Axles: " + axles;
	}

}
