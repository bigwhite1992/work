package aa;
import java.util.Scanner;
public class aa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a point with two coodinates:");
       double a=input.nextDouble();
       double b=input.nextDouble();
       if(a*a+b*b<=100)
    	   System.out.print("Point ( "+a+" , "+b+" ) is in the circle");
       else
    	   System.out.print("Point ( "+a+" , "+b+" ) is not in the circle");
	}

}
