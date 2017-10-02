package p1;

public class Cube extends Rectangle {
	private double height;
	
	public Cube(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}
	
	public double getVolume() {
		return getLength() * getWidth() * height;
	}
	
	public double getSurfaceArea() {
		return 2 * (getLength() * getWidth() + getLength() * height + getWidth() * height);
	}

}
