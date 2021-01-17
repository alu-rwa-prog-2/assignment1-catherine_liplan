// Authors: Catherine Muthoni and Liplan Lekipising

// Imports
import java.util.InputMismatchException;
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner GetInput = new Scanner(System.in);  // Create scanner obj for getting user input

        // Part one of the question: Calculate BMI
        System.out.println();
        System.out.print("Enter your name: ");
        String name = GetInput.nextLine();  // prompt for the name of the user
        System.out.println();

        double height;
        double weight;

        Boolean repeat = true;

        // while loop for getting correct user input
        while (repeat){
            // use try catch to handle wrong type of user input
            try {
                System.out.print("Enter your height in meters: ");
                height = GetInput.nextDouble();  // prompt for the height of the user
                
                System.out.println();
                System.out.print("Enter your weight in kg: ");
                weight = GetInput.nextDouble();  // prompt for the weight of the user
    
                double bmi = weight / (height * height);  // calculate the BMI of the person
                
                System.out.println();
                System.out.println(name + " your BMI is: " + bmi);   // print the BMI with the name

                repeat = false;
    
            } catch (InputMismatchException e) {
                System.out.println("Please enter integers only. Try again.");
                GetInput.next();
                repeat = true;
                System.out.println();
            }
        }
        
        GetInput.close();

        System.out.println();
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
        System.out.println();
		System.out.println("The perimeter is " + perimeter + "cm");
		System.out.println("The surface area is " + surface + "cm^2");


	}

}
