package aa;
import java.util.Scanner;
public class aa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      System.out.print("Enter a number:");
      int a=input.nextInt();
      System.out.print("Enter a number:");
      int b=input.nextInt();
      System.out.print("Enter a number:");
      int c=input.nextInt();
      int sum=a+b+c;
      if(a+b>c&&b+c>a&&a+c>b) {
    	  System.out.print(sum);
      }
      else {
    	  System.out.print("Error");
      }
	}

}
