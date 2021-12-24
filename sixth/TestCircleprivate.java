package sixth;

public class TestCircleprivate {

	public static void main(String[] args) {
		Circleprivate c=new Circleprivate(5.0);
		System.out.println("The area of the circle of radius"+c.getRadius()+" is "+c.getArea());
		c.setRadius(c.getRadius()*1.1);
		System.out.println("The area of the circle of radius"+c.getRadius()+" is "+c.getArea());
		System.out.println("THe number of objects created is"+Circleprivate.getNumberOfObejects());

	}

}
