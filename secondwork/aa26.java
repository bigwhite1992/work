package aa;
import java.util.Scanner;
public class aa26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	     int number=input.nextInt();
	     int d=0;
	     int t=0,bin=0;
	     while(number!=0) {
	    	 d=number%8;
	    	 number=number/8;
	    	 bin+=d*(Math.pow(10, t));
	    	 t++;
	     }
	     System.out.println(bin);
	}

}
