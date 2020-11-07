package homework1;

public class Circle extends TwoDimensionalShape {
	public Circle(double edge) {
		super(edge);
	}

	@Override
	public double getArea() {
		System.out.println(getString1() + ": Cirle");
		return 4 * Math.PI * getEdge() * getEdge();
	}
}
