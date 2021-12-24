package seventh;

public class LinearEquation {
	private double a,b,c,d,e,f;
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
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
	public double get_d(double d) {
		return this.d;
	}
	public double get_e(double e) {
		return this.e;
	}
	public double get_f(double f) {
		return this.f;
	}
	public boolean isSolvable() {
		boolean x;
		if(this.a*this.d-this.b*this.c!=0)
			x=true;
		else
			x=false;
		return x;
	}
	public double getX() {
		if(this.a*this.d-this.b*this.c!=0)
		return (this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
		else
			return 0;
	}
	public double getY() {
		if(this.a*this.d-this.b*this.c!=0)
		return (this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
		else
			return 0;
	}
}
