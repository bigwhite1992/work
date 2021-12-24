package aa;
import java.util.Scanner;
public class aa15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.print("Loan Amonut:");
       double LoanAmount=input.nextDouble();
       System.out.print("Number of years:");
       int years=input.nextInt();
       double interestRate=0,Month=0,total=0,m=0,j=0;
       System.out.println("Interest Rate   Monthly Payment   Total Payment");
       for(double i=0.05;i<=0.081;i+=0.00125) {
    	  interestRate=i;
    	  System.out.print(String.format("%.3f", interestRate*100)+"%");
    	  j=(i/12)*LoanAmount;
    	  m=Math.pow(1+i/12, 12*years);
    	  Month=j/(1-(1/m));
    	  System.out.print(String.format("%22.2f",Month));
    	  System.out.println(String.format("%18.2f",Month*12*years));
       }
	}

}
