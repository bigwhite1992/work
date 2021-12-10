package sixth;

public class TotalArea {

	public static void main(String[] args) {
		Circleprivate[] circleArray;
		circleArray=createCircleArray();
		printCircleArray(circleArray);

	}
	public static Circleprivate[] createCircleArray() {
		Circleprivate[] circleArray=new Circleprivate[5];
		for (int i=0;i<circleArray.length;i++) {
			circleArray[i]=new Circleprivate(Math.random()*100);
		}
		return circleArray;
		}
	public static void printCircleArray(Circleprivate[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for (int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("______________________________________________");
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
	}
	public static double sum(Circleprivate[] circleArray) {
		double sum=0;
		for (int i=0;i<circleArray.length;i++)
			sum+=circleArray[i].getArea();
		return sum;
	}

}
