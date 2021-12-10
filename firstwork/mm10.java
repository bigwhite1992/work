package mm;

import java.util.Scanner;

public class mm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a number for radius:");
       double radius=input.nextDouble();
       final double PI=3.14159;
       double area=radius*radius*PI;
       System.out.println("The area for the circles of radius "+radius+" is "+area);
	}

}
