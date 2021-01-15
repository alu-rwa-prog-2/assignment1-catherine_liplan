package bmicalculator;

public class BMICalculator {

	public static void main(String[] args) {
		String name = "Cate";
		double height = 1.6;
		double weight = 59.0;
		
		double bmi = weight /(height*height);
		
		System.out.println(name + ", Your bmi is " + bmi);
		
		double length = 60.0;
		double width = 35.0;
		
		double perimeter = 2 * (length + width);
		double surface = length * width;
		
		System.out.println("The perimeter is " + perimeter + "cm");
		System.out.println("The surface is " + surface + "cm^2");


	}

}
