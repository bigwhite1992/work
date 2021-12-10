package sixth;

public class Circle {
	double radius;
	Circle(){
		radius=1.0;
	}
	Circle(double newRadius){
		radius=newRadius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	void setRadius(double newRadius) {
		radius=newRadius;
	}
}
