public class triangle{
	public double a;
	public double b;
	public double c;
	public triangle(double a,double b,double c){
	this.a = a;
	this.b = b;
	this.c = c;
	}
	public double getPerimeter(){
		double i = a + b + c;
		return i;
	}
	public double getArea(){
		double p = getPerimeter( ) /2;
		double s = Math.sqrt(p * ( p - a )* ( p - b ) * (p - c));
		return s;
	}
public static void main(String[] args){
	triangle sanjiao = new triangle(3,4,5);
	System.out.println(sanjiao.getPerimeter());
	System.out.println(sanjiao.getArea());
	triangle sanjiaoxing = new triangle(7,8,9);
	System.out.println(sanjiaoxing.getPerimeter());
	System.out.println(sanjiaoxing.getArea());
	}
}
