import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give your length");
		double f = sc.nextDouble();
		System.out.println("give your wideth");
		double g = sc.nextDouble();
		area(f,g);
		perimeter(f,g);
		

	}
	public static void area(double a, double b) {
		System.out.print("your area is   ");
		System.out.println(a*b);
	}
	public static void perimeter(double c, double d) {
		double e = c+d;
		System.out.print("Your perimeter is   ");
		System.out.print(2*e);
	}

}
