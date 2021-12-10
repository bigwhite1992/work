package seventh;
import java.util.Scanner;
public class nineten {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		QuadraticEquation num=new QuadraticEquation(a,b,c);
		if(num.getDiscriminant()>=0) {
			if(num.getDiscriminant()>0) {
				System.out.println("x1="+num.getRoot1());
				System.out.println("x2="+num.getRoot2());
			}
			else
				System.out.println("x1=x2="+num.getRoot1());
		}
		else
			System.out.println("The equation has no roots");
	}

}
