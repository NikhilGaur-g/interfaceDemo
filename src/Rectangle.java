
public class Rectangle implements Shape {
	private double width,height;
	

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("drawing rectangle");

	}

	@Override
	public double getarea() {
		// TODO Auto-generated method stub
		return this.width*this.height;
	}

}
