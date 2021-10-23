 package aa;

public class aa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double a=10000;
       double b=0.05;
       double c=a*(Math.pow(1+b, 10));
       System.out.println(c);
       double d=a*(Math.pow(1+b, 11))+a*(Math.pow(1+b, 12))+a*(Math.pow(1+b, 13))+a*(Math.pow(b+1, 14));
       System.out.println(d);
	}

}
