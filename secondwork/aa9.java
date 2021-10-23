package aa;
import java.util.Scanner;
public class aa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a point's x- and y- coodinates:");
        double a=input.nextDouble();
        double b=input.nextDouble();
        if(a>=0&&b>=0&&(a+2*b-200<=0)) 
        	System.out.println("The point is in the triangle");
        else
        	System.out.println("The point is not in the triangle");
	}

}
