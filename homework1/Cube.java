package homework1;

public class Cube extends ThreeDimensionalShape {

	public Cube(double edge) {
		super(edge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getVolumn() {
		System.out.println(getString2() + ": Cube");
		return Math.pow(getEdge(), 3);
	}

	@Override
	public double getArea() {
		return 6 * Math.pow(getEdge(), 2);
	}

}
