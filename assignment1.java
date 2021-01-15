// Authors: Liplan Lekipising and Catherine Muthoni

// Import scanner for getting input
import java.util.Scanner;


// create class
public class assignment1{
    public static void main(String[] args){
        Scanner GetInput = new Scanner(System.in);  // Create scanner obj for getting user input

        // part one of the question: Calculate BMI
        System.out.println("Enter your name: ");
        String name = GetInput.nextLine();  // prompt for the name of the user

        System.out.println("Enter your height in meters: ");
        Float height = GetInput.nextFloat();  // prompt for the height of the user

        System.out.println("Enter your weight in kg: ");
        Float weight = GetInput.nextFloat();  // prompt for the weight of the user

        Float bmi = weight / (height * height);  // calculate the BMI of the person

        System.out.println(name + " your BMI is: " + bmi);   // print the BMI with the name

        // part two of the question: Calculate perimeter and Surface area
        System.out.println("Enter the length in cm: ");
        Float length = GetInput.nextFloat();  // prompt for the lenght of the object

        System.out.println("Enter the width in cm: ");
        Float width = GetInput.nextFloat();  // prompt for the width of the object

        Float perimeter = 2 * (length + width);  //calculate the perimeter
        Float area = length * width;  // calculate the surface area

        System.out.println("Perimeter is " + perimeter + "cm and surface area is: " + area + "cm2");  // print surface area and perimeter

    }
}
        