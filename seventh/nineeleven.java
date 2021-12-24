package seventh;
import java.util.Scanner;
public class nineeleven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		LinearEquation line=new LinearEquation(a,b,c,d,e,f);
		if(line.isSolvable()==true)
			System.out.println(line.getX()+" "+line.getY());
		else
			System.out.println("The equation has no solution");
	}

}
