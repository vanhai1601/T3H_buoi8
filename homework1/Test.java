package homework1;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		// TwoDimensionalShape
		ArrayList<Shape> arrs = new ArrayList<Shape>();
		arrs.add(new Circle(5));
		arrs.add(new Square(7));
		arrs.add(new Triangle(5, 7));
		// ThreeDimensionalShape
		arrs.add(new Sphere(10));
		arrs.add(new Cube(5.5));
		arrs.add(new Tetrahedron(6));
		for (Shape arr : arrs) {
			if (arr instanceof TwoDimensionalShape) {
				TwoDimensionalShape newArr = (TwoDimensionalShape) arr;
				System.out.println("Area: " + newArr.getArea());
				System.out.println();
			}
			if (arr instanceof ThreeDimensionalShape) {
				ThreeDimensionalShape newArr = (ThreeDimensionalShape) arr;
				System.out.println("Volumn: " + newArr.getVolumn() + ", Area: " + newArr.getArea());
				System.out.println();
			}
		}
	}
}
