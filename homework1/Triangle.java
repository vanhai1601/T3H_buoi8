package homework1;

public class Triangle extends TwoDimensionalShape {
	private double height;

	public Triangle(double edge, double height) {
		super(edge);
		this.height = height;
	}

	@Override
	public double getArea() {
		System.out.println(getString1() + ": Triangle");
		return 0.5 * getEdge() * getHeight();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
