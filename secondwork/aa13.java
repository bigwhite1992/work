package aa;
import java.util.Scanner;
public class aa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number between 1~15:");
        int a=input.nextInt();
        for (int i = 0; i < a; i++) {
            for (int g = 1; g <= 2 * a - 1; g++) {
            	if(g<a-i||g>a+i)
            		System.out.print("  ");
            	else if(g>=a&&g<=a+i)
            		System.out.print(String.format("%2d",g-a+1));
            	else if(g>=a-i&&g<a)
            		System.out.print(String.format("%2d",a-g+1));
            }
            System.out.print("\n");
        }
	}

}
