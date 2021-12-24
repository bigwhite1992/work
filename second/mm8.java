package mm;

import java.util.Scanner;

public class mm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input=new Scanner(System.in);
         System.out.print("Enter a number for radius:");
         double radius=input.nextDouble();
         double area=radius*radius*3.14159;
         System.out.println("The area for the circles of radius "+radius+" is "+area);
	}

}
