package aa;
import java.util.Arrays;
import java.util.Scanner;
public class aa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      int x=(int)(Math.random() * 900+100);
      int x1=x/100;
      int x2=x%100/10;
      int x3=x%10;
      System.out.println("The lottery number is "+x);
      System.out.print("Enter a number:");
      int a=input.nextInt();
      int a1=a/100;
      int a2=a%100/10;
      int a3=a%10;
      if(a==x) {
    	  System.out.println("Won a prize of $10000");
      }
      else if((x1==a2&&x2==a3&&x3==a1)||(x1==a3&&x2==a1&&x3==a2)||(x1==a2&&x2==a1&&x3==a3)||(x1==a1&&x2==a3&&x3==a2)||(x1==a3&&x2==a2&&x3==a1)) {
    	  System.out.println("Won a prize of $3000");
      }
      else if(x1==a1||x1==a2||x1==a3||x2==a1||x2==a2||x2==a3||x3==a1||x3==a2||x3==a3) {
    	  System.out.println("Won a prize of $1000");
      }
      else {
    	  System.out.println("Lose");
      }
	}

}
