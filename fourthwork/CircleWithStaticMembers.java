package sixth;

public class CircleWithStaticMembers {
	double radius;
	static int numberOfObejects=0;
	CircleWithStaticMembers(){
		radius=1;
		numberOfObejects++;
	}
	CircleWithStaticMembers(double newRadius){
		radius=newRadius;
		numberOfObejects++;
	}
	static int getNumberOfObejects() {
		return numberOfObejects;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
}
