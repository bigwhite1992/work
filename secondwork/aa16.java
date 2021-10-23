package aa;
import java.util.Scanner;
public class aa16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	       System.out.print("Loan Amonut:");
	       double LoanAmount=input.nextDouble();
	       System.out.print("Number of years:");
	       int years=input.nextInt();
	       System.out.print("Annual interest rate:");
	       double rate=input.nextDouble();
	       double MonthlyPayment=(LoanAmount*rate/1200)/(1-(1/Math.pow(1+rate/1200, years*12)));
	       double TotalPayment=MonthlyPayment*12*years;
	       System.out.println("MonthlyPayment :"+MonthlyPayment);
	       System.out.println("TotalPayment :"+TotalPayment);
	       System.out.println("Payment#   Interest   Principle   Balance");
	       double interest=0.0,principle=0.0,balance=0.0;
	       for(int i=1;i<=years*12;i++) {
	    	   interest=rate/1200*LoanAmount;
	    	   principle=MonthlyPayment-interest;
	    	   LoanAmount=LoanAmount-principle;
	    	   if(i==years*12)
	    		   principle+=LoanAmount;
	    	   System.out.print(i+"\t");
	    	   System.out.print(String.format("%10.2f", interest));
	    	   System.out.print(String.format("%12.2f", principle));
	    	   System.out.println(String.format("%11.2f", LoanAmount));
	       }
	}

}
