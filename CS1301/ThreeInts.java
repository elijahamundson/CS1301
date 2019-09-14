import java.util.Scanner;
public class ThreeInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Average;
		Scanner input = new Scanner(System.in);
		System.out.println("enter three integers");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		Average = (number1 + number2 + number3)/3;
		
		System.out.println("the average of your 3 numbers is " + Average);
		
		
	}

}
