package p1_rectangle;

public class Cube extends Rectangle {
	private double height;

	public Cube(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}
	
	public double getVolume(){
		return getLength() * getWidth() * height;
	}
	
	public double getSurfaceArea() {
		return (2 * (getLength() * getWidth() + getLength() * height + getWidth() * height));
	}

	@Override
	public String toString() {
		return "Length=" + getLength() + ", Width=" + getWidth() + ", height=" + height;
	}
	
}
