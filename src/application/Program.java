package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Bus;
import entities.Truck;

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
		}
		
		sc.close();

	}

}
