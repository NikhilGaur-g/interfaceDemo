
public class Circle implements Shape {
	private double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("drawing circle");

	}

	@Override
	public double getarea() {
		return Math.PI*this.radius*this.radius;
		
	}
	public double getradius() {
		return this.radius;
	}
	

}
