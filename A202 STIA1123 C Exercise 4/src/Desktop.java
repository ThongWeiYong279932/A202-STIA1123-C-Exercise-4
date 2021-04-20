
import java.util.Scanner;

public class Desktop {						//Parent Class
	Scanner scan = new Scanner(System.in);
	private double length, width, height, weight, volume;
	
	Desktop(){			//Constructor without argument named Desktop
		System.out.print("Please enter desktop pc length(in cm): ");
		this.length = scan.nextDouble();
		System.out.print("Please enter desktop pc width(in cm): ");
		this.width = scan.nextDouble();
		System.out.print("Please enter desktop pc height(in cm): ");
		this.height = scan.nextDouble();
		System.out.print("Please enter desktop pc weight(in kg): ");
		this.weight = scan.nextDouble();
		this.volume = this.length * this.width * this.height;
	}
	
	double getLength() {
		return this.length;
	}
	
	double getWidth() {
		return this.width;
	}
	
	double getHeight() {
		return this.height;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	double getVolume() {
		return this.volume;
	}
}
