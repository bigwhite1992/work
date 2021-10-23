package aa;
import java.util.Scanner;
public class aa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      System.out.print("Enter a point with two coodinates:");
      double a=input.nextDouble();
      double b=input.nextDouble();
      if((a<=5&&a>=0)&&(b<=(5.0/2)&&b>=-(5.0/2))||((a>=-5&&a<=0)&&(b<=(5.0/2)&&b>=-(5.0/2))))
    	  System.out.println("Point ( "+a+" , "+b+" ) is in the rectangle");
      else
    	  System.out.println("Point ( "+a+" , "+b+" ) is not in the rectangle"); 
	}

}
