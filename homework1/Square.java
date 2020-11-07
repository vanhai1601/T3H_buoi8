package homework1;

public class Square extends TwoDimensionalShape {

	public Square(double edge) {
		super(edge);
	}

	@Override
	public double getArea() {
		System.out.println(getString1() + ": Square");
		return getEdge() * getEdge();
	}
}
