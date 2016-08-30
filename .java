package com.absdemo;

abstract class Figure {
	double dim1, dim2, dim3;

	Figure(double d1, double d2, double d3) {
		dim1 = d1;
		dim2 = d2;
		dim3 = d3;
	}

	abstract void findArea();

	abstract void findPerimeter();
}

package com.absdemo;

import java.util.*;

public class Circle extends Figure {
	double pi = Math.PI;

	Circle(double d1, double d2, double d3) {
		super(d1, d2, d3);
	}

	void findArea() {
		double area = pi * dim1 * dim1;
		System.out.println("Area of Circle=" + area);
	}

	void findPerimeter() {
		double perimeter = 2 * pi * dim1;
		System.out.println("Perimeter of Circle=" + perimeter);
	}

}

package com.absdemo;

import java.util.*;

public class Rectangle extends Figure {

	Rectangle(double d1, double d2, double d3) {
		super(d1, d2, d3);
	}

	void findArea() {
		double area = dim1 * dim2;
		System.out.println("Area of Rectangle=" + area);
	}

	void findPerimeter() {
		double perimeter = 2 * (dim1 + dim2);
		System.out.println("Perimeter of Rectangle=" + perimeter);
	}

}

package com.absdemo;

public class Triangle extends Figure {
	Triangle(double d1, double d2, double d3) {
		super(d1, d2, d3);
	}

	void findArea() {
		double area = (dim1 * dim2) / 2;
		System.out.println("Area of Triangle=" + area);
	}

	void findPerimeter() {
		double perimeter = dim1 + dim2 + dim3;
		System.out.println("Perimeter of Triangle=" + perimeter);

	}

}

package com.absdemo;

public class Main {
	public static void main(String[] args) {
		Figure circle = new Circle(4, 0, 0);
		Figure rectangle = new Rectangle(2, 4, 0);
		Figure triangle = new Triangle(2, 2, 4);
		System.out.println("Area and Perimeter of cirle when radious=" + circle.dim1);
		circle.findArea();
		circle.findPerimeter();
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Area and Perimeter of Rectangle when Length=" + rectangle.dim1 + "Width=" + rectangle.dim2);
		rectangle.findArea();
		rectangle.findPerimeter();
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Area and Perimeter of Traiangle when Base=" + triangle.dim1 + "Height=" + triangle.dim2
				+ "Side=" + triangle.dim3);
		triangle.findArea();
		triangle.findPerimeter();
	}
}
