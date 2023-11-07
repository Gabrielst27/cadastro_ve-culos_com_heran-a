package entities;

public class Bus extends Vehicle {
	
	private Integer seats;
	
	public Bus() {
		super();
	}

	public Bus(String plate, Integer year, Integer seats) {
		super(plate, year);
		this.seats = seats;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	
	

}
