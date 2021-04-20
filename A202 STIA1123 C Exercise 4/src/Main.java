
public class Main {

	public static void main(String[] args) {
		
		HP a = new HP(); //Construct an object HP
		System.out.println("Desktop Details:");
		System.out.println("Length: "+a.getLength()+"cm");
		System.out.println("Height: "+a.getHeight()+"cm");
		System.out.println("Width: "+a.getWidth()+"cm");
		System.out.println("Volume: "+a.getVolume()+"cm^3");
		System.out.println("Weight: "+a.getWeight()+"kg");
		System.out.println("Brand: "+ a.getBrand());
		System.out.println("CPU: "+ a.getCPU());
		System.out.println("RAM: "+ a.getRAM()+"GB");
		System.out.printf("Price per unit: RM%.2f %n",a.getPrice());
		System.out.println("Number of units: " + a.getNo());
		System.out.printf("Total Price: RM%.2f %n",a.getTotalPrice());
		
		System.out.println();
		
		Dell b = new Dell(); //Construct an object Dell
		System.out.println("Desktop Details:");
		System.out.println("Length: "+b.getLength()+ "cm");
		System.out.println("Height: "+b.getHeight()+ "cm");
		System.out.println("Width: "+b.getWidth() + "cm");
		System.out.println("Volume: "+b.getVolume() + "cm^3");
		System.out.println("Weight: "+b.getWeight() + "kg");
		System.out.println("Brand: "+ b.getBrand());
		System.out.println("CPU: "+ b.getCPU());
		System.out.println("RAM: "+ b.getRAM()+"GB");
		System.out.printf("Price per unit: RM%.2f %n",b.getPrice());
		System.out.println("Number of units: " + b.getNo());
		System.out.printf("Total Price: RM%.2f %n",b.getTotalPrice());
	}

}
