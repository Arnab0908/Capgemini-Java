package polymorphism_overloading;

public class Area_calculator {
	public static double area(int a) {
		double sq=a*a;
		System.out.println("Area of sq"+sq);
		return sq ;
	}
	public static double area(int l,int b) {
		double rect=l*b;
		System.out.println("Area of rect"+rect);
		return rect;
	}
	public static double area(int b,double h) {
		double tri=0.5*b*h;
		System.out.println("Area of tri"+tri);
		return tri;
	}

}
