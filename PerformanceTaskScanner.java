import java.util.Scanner;
public class PerformanceTaskScanner{
	public static void main(String[] args) {
		Scanner myLove = new Scanner(System.in);
		
		System.out.println("Hello Ma'am");
		System.out.print("Enter name :");
		String name = myLove.nextLine();
		
		System.out.print("Enter the square meter of the building :");
		long squareMeter = myLove.nextLong();
		long totalSquaremeter = squareMeter + 50;
		
		System.out.print("Enter the hectar of the building :");
		float hectar = myLove.nextFloat();
		
		System.out.println("The value of square meter is:" + totalSquaremeter);
		System.out.println("The hectar of the building:" + totalSquaremeter);
		
		//ANSWER : name : Ellaine Garcia, square meter : 600 , hectar : 0.06
		
										
	}
}