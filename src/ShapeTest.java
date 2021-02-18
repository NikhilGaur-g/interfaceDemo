
public class ShapeTest {

	public static void main(String[] args) {
		Shape c=new Circle(10);
		Circle ci=new Circle(10);
		c.draw();
		System.out.println("Radius="+ci.getradius());
		System.out.println("area="+c.getarea());
		
		c=new Rectangle(10,10);
		c.draw();
		System.out.println("area="+c.getarea());
				

	}

}
