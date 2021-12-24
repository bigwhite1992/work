package aa;
import java.util.Scanner;
public class aa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the first 9 digits of an ISBN as integer: ");
       String sc=input.nextLine();
       int[] array=new int[9];
       int sum=0;
       for(int i=0;i<9;i++) {
    	  array[i] = sc.charAt(i)-'0';
       }
       for(int i=0;i<9;i++) {
    	   sum=sum+(i+1)*array[i];
       }
       int number=sum%11;
       if(number==10)
    	   System.out.print("The ISBN-10 number is "+sc+"X");
       else
    	   System.out.print("The ISBN-10 number is "+sc+number);
	}
}
