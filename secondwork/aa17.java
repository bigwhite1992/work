package aa;
import java.util.Scanner;
public class aa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double n=input.nextDouble();
		double total=0;
      for (double i=1;i<=n;i++) {
    	  total+=(Math.pow(-1,i+1))/(2*i-1);
      }
	System.out.println(4*total);
	}

}
