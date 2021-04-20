
import java.util.Scanner;

public class HP extends Desktop {			//HP as subclass and Desktop as Parent class
	Scanner scan = new Scanner(System.in);
	
	private String brand, cpu;
	private int ram, no;
	private double price, totalprice;
	
	HP(){				//Constructor without argument named HP
		this.brand = "HP";
		System.out.print("Please enter the CPU model(intel i5/ intel i7): ");
		this.cpu = scan.nextLine();
		while (this.cpu.equalsIgnoreCase("intel i5") == false && this.cpu.equalsIgnoreCase("intel i7") == false) {
			System.out.println("Wrong input! Please input intel i5 or intel i7 only!");
			System.out.print("Please enter the CPU model(intel i5/ intel i7): ");
			this.cpu = scan.nextLine();
		}
		System.out.print("Please enter the RAM(8/16): ");
		this.ram = scan.nextInt();
		while (this.ram != 8 && this.ram != 16) {
			System.out.println("Wrong input! Please input 8 or 16 only!");
			System.out.print("Please enter the RAM(8/16): ");
			this.ram = scan.nextInt();
		}
			if (cpu.equalsIgnoreCase("intel i5")) {
				if (ram == 8) {
					this.price = 2500;
				}
				else if (ram == 16) {
					this.price = 3000;
				}
			}
			else if (cpu.equalsIgnoreCase("intel i7")) {
				if (ram == 8) {
					this.price = 3000;
				}
				else if (ram == 16) {
					this.price = 3500;
				}
			}
		System.out.print("Please enter the number of units: ");
		this.no = scan.nextInt();
		this.totalprice = this.price * this.no;
		System.out.println();
	}
	
	String getBrand() {
		return this.brand;
	}
	
	String getCPU() {
		return this.cpu;
	}
	
	int getRAM() {
		return this.ram;
	}
	
	double getPrice() {
		return this.price;
	}
	
	int getNo() {
		return this.no;
	}
	
	double getTotalPrice() {
		return this.totalprice;
	}
}
