package homework1;

public abstract class ThreeDimensionalShape extends Shape {

	public ThreeDimensionalShape(double edge) {
		super(edge);
	}

	public abstract double getVolumn();
	public abstract double getArea();
}
