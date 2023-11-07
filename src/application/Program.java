package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Bus;
import entities.Truck;
import entities.Vehicle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Truck> trucks = new ArrayList<>();
		List<Bus> busses = new ArrayList<>();
		
		System.out.print("Enter vehicle type (Bus or Truck): ");
		String type = sc.nextLine();
		
		if(type.toUpperCase().equals("BUS")) {
			System.out.print("Enter vehicle plate: ");
			String plate = sc.nextLine();
			System.out.print("Enter vehicle year: ");
			int year = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter vehicle seats: ");
			int seats = sc.nextInt();
			sc.nextLine();
			
			Bus bus = new Bus(plate, year, seats);
			busses.add(bus);
		} else if(type.toUpperCase().equals("TRUCK")) {
			System.out.print("Enter vehicle plate: ");
			String plate = sc.nextLine();
			System.out.print("Enter vehicle year: ");
			int year = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter vehicle axles: ");
			int axles = sc.nextInt();
			sc.nextLine();
			
			Truck truck = new Truck(plate, year, axles);
			trucks.add(truck);
		}
		
		sc.close();

	}

}
