// Authors: Catherine Muthoni and Liplan Lekipising

// Import scanner class for getting input
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner GetInput = new Scanner(System.in);  // Create scanner obj for getting user input

        // Part one of the question: Calculate BMI
        System.out.println("Enter your name: ");
        String name = GetInput.nextLine();  // prompt for the name of the user

        System.out.println("Enter your height in meters: ");
        double height = GetInput.nextFloat();  // prompt for the height of the user

        System.out.println("Enter your weight in kg: ");
        double weight = GetInput.nextFloat();  // prompt for the weight of the user

        double bmi = weight / (height * height);  // calculate the BMI of the person

        System.out.println(name + " your BMI is: " + bmi);   // print the BMI with the name
        
        System.out.println("****************************************************");

        // Part two of the question: Calculate perimeter and Surface area
		
        // Declaring the length and width of the rectangle
        double length = 60.0;
		double width = 35.0;
		
		// Declaring the perimeter variable
		double perimeter = 2 * (length + width);
		//Declaring the Surface area variable
		double surface = length * width;
		
		// Printing out the perimeter and surface area
		System.out.println("The perimeter is " + perimeter + "cm");
		System.out.println("The surface area is " + surface + "cm^2");


	}

}