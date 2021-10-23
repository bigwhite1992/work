package aa;
import java.util.Scanner;
public class aa18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double n=input.nextDouble();
		double total=0;
		for (double j=1;j<=n;j++) {
			total+=1/compute(j);
		}
		System.out.println(total+1);
	}


   public static double compute(double number) {
	double result=1;
	for(double i=number;i>0;i--) {
		result*=i;
	}
	return result;
}
}
