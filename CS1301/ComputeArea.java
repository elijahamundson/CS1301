import java.util.Scanner;
public class ComputeArea {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("enter the circle's radius");
	
		double radius = input.nextDouble();
		double area;
		
		area = (int)(radius * radius * 3.14159);
		System.out.println("The area for the circle of radius "+ radius + " is " + area);
	}

}
