package sixth;

public class Circleprivate {
	private double radius=1;
	private static int numberOfObejects=0;
	public Circleprivate(){
		radius=1;
		numberOfObejects++;
	}
	public Circleprivate(double newRadius){
		radius=newRadius;
		numberOfObejects++;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		radius=(newRadius>=0)?newRadius:0;
	}
	public static int getNumberOfObejects() {
		return numberOfObejects;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
