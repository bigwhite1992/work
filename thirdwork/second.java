package third;
import java.util.Scanner;
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double[] num=new double[10];
		double temp = 0.0;
		for(int i=0;i<num.length;i++) {
			num[i]=input.nextDouble();
		}
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					temp=num[j+1];
					num[j+1]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
