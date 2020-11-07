package homework1;

public class Sphere extends ThreeDimensionalShape {

	public Sphere(double edge) {
		super(edge);
	}

	@Override
	public double getVolumn() {
		System.out.println(getString2() + ": Sphere");
		return 4.0 / 3 * Math.PI * (Math.pow(getEdge(), 3));
	}

	@Override
	public double getArea() {
		return 4 * Math.PI * (Math.pow(getEdge(), 2));
	}

}
