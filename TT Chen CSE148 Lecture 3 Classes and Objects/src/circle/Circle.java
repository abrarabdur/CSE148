package circle;

public class Circle {
	private double radius;
	
	
	//overloaded constructors
	public Circle() {
		
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getCircumference() {
		return Math.PI * 2 * radius;
	}
	
	// setter method, mutator
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	// getter method, accessor
	public double getRadius() {
		return radius;
	}
	
	public String toString() {
		return 	"R = " + getRadius() + "\t" + 
				"A = " + getArea() + "\t" + 
				"C = " + getCircumference();
	}

}
