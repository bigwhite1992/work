package sixth;

public class AlternativeCircle {

	public static void main(String[] args) {
		Circle circle1=new Circle();
		System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		Circle circle2=new Circle(25);
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		Circle circle3=new Circle(125);
		System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
		circle2.radius=100.0;
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle1.getArea());
	}
		double radius;
		AlternativeCircle(){
			radius=1.0;
		}
		AlternativeCircle(double newRadius){
			radius=newRadius;
		}
		public double getArea() {
			return Math.PI*radius*radius;
		}
		void setRadius(double newRadius) {
			radius=newRadius;
		}
}