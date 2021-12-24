package seventh;
public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	public QuadraticEquation(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double get_a(double a) {
		return this.a;
	}
	public double get_b(double b) {
		return this.b;
	}
	public double get_c(double c) {
		return this.c;
	}
	public double getDiscriminant() {
		return this.b*this.b-4*this.a*this.c;
	}
	public double getRoot1() {
		if(this.b*this.b-4*this.a*this.c>=0)
		    return (-this.b+Math.sqrt(this.b*this.b-4*this.a*this.c))/2*this.a;
		else
			return 0;
	}
	public double getRoot2() {
		if(this.b*this.b-4*this.a*this.c>0)
		    return (-this.b-Math.sqrt(this.b*this.b-4*this.a*this.c))/2*this.a;
		else
			return 0;
	}
}
