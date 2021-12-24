package sixth;

public class TestPassObject {

	public static void main(String[] args) {
		Circleprivate c=new Circleprivate(1);
		int n=5;
		printAreas(c,n);
		System.out.println("\n"+"Radius is "+c.getRadius());
		System.out.println("n is "+n);

	}
	public static void printAreas(Circleprivate c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
		System.out.println(c.getRadius()+"\t\t"+c.getArea());
		c.setRadius(c.getRadius()+1);
		times--;
		}
	}

}
