package third;
import java.util.Scanner;
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter matrix1:");
		double[][] x1=new double[3][3];
		double[][] x2=new double[3][3];
		double[][] multiple=new double[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			x1[i][j]=input.nextDouble();
		}
		}
		System.out.print("Enter matrix2:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			x2[i][j]=input.nextDouble();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			multiple[i][j]=x1[i][0]*x2[0][j]+x1[i][1]*x2[1][j]+x1[i][2]*x2[2][j];
			}
		}
		System.out.println(x1[0][0]+" "+x1[0][1]+" "+x1[0][2]+"       "+x2[0][0]+" "+x2[0][1]+" "+x2[0][2]+"       "+String.format("%.1f",multiple[0][0])+" "+String.format("%.1f",multiple[0][1])+" "+String.format("%.1f",multiple[0][2]));
		System.out.println(x1[1][0]+" "+x1[1][1]+" "+x1[1][2]+"   *   "+x2[1][0]+" "+x2[1][1]+" "+x2[1][2]+"   =   "+String.format("%.1f",multiple[1][0])+" "+String.format("%.1f",multiple[1][1])+" "+String.format("%.1f",multiple[1][2]));
		System.out.println(x1[2][0]+" "+x1[2][1]+" "+x1[2][2]+"       "+x2[2][0]+" "+x2[2][1]+" "+x2[2][2]+"       "+String.format("%.1f",multiple[2][0])+" "+String.format("%.1f",multiple[2][1])+" "+String.format("%.1f",multiple[2][2]));
		}



}
