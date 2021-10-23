package aa;
import java.util.Scanner;
public class aa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
       System.out.println("Enter year:");
       int year=input.nextInt();
       System.out.println("Enter month:");
       int m=input.nextInt();
       System.out.println("Enter the day of the month:");
       int q=input.nextInt();
       int j=year/100;
       int k=year%100;
       if(m==1||m==2)
    	   m=m+1;
       int h=(q+(m+1)*26/10+k+k/4+j/4+5*j)%7;
       if(h==0)
    	   System.out.println("Day of the week is Saturday");
       else if(h==1)
    	   System.out.println("Day of the week is Sunday");
       else if(h==2)
    	   System.out.println("Day of the week is Monday");
       else if(h==3)
    	   System.out.println("Day of the week is Wednesday");
       else if(h==4)
    	   System.out.println("Day of the week is Thursday");
       else if(h==5)
    	   System.out.println("Day of the week is Friday");
	}

}
