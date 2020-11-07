package homework1;

public class Tetrahedron extends ThreeDimensionalShape {

	public Tetrahedron(double edge) {
		super(edge);
	}

	@Override
	public double getVolumn() {
		System.out.println(getString2() + ": Tetrahedron");
		return Math.sqrt(2.0) * Math.pow(getEdge(), 3) / 12;
	}

	@Override
	public double getArea() {
		return Math.sqrt(3.0) * Math.pow(getEdge(), 2);
	}

}
