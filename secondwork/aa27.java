package aa;
import java.util.Scanner;
public class aa27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
		double total=0;
		double[] array=new double[20];
		double average=0;
		double sum1=0,sum2=0;
		for(int i=0;i<10;i++) {
			array[i]=input.nextDouble();
		}
		for(int i=0;i<10;i++)
		total+=array[i];
		average=total/10;
		System.out.println("The mean is "+average);
		for (int i=0;i<10;i++) {
			if(array[i]==array[i+1]) {
				sum1=0.0;
			}
			else {
			sum1+=(array[i]-average)*(array[i]-average);
			}
		}
		sum2=Math.sqrt(sum1/9);
		System.out.println("The standard deviation is "+String.format("%.5f",sum2));
	}

}
