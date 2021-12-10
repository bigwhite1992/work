package tenth;
import java.util.ArrayList;
import java.util.Scanner;
public class elevenseventeen {

	public static void main(String[] args) {
		int M,m,n;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a integer m: ");
		m=input.nextInt();
		M=m;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=2;m>1;i++) {
			if(m%i==0) {
				list.add(i);
				m=m/i;
				i=1;
			}
		}
		n=find(list);
		System.out.println("The smallest number n for m*n to be a perfect square is "+n+"\nm*n is "+M*n);
	}

	private static int find(ArrayList<Integer> list) {
		int mul=1;
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					list.remove(j);
					list.remove(i);
					j--;
				}
				else {
					continue;
				}
			}
		}
		for(int i=0;i<list.size();i++) {
			mul*=list.get(i);
		}
		return mul;
	}

}
