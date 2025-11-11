class Shape
{
	String shapeName;
	double area;
	double perimeter;

	// Default constructor
	Shape()
	{
		shapeName = "Unknown";
		area = 0.0;
		perimeter = 0.0;
		System.out.println("Shape Default constructor called...");
	}

	// Parameterized constructor
	Shape(String shapeName, double area, double perimeter)
	{
		this.shapeName = shapeName;
		this.area = area;
		this.perimeter = perimeter;
		System.out.println("Shape Parameterized constructor called...");
	}

	// Setter methods
	void setShapeName(String shapeName){ this.shapeName = shapeName; }
	void setArea(double area){ this.area = area; }
	void setPerimeter(double perimeter){ this.perimeter = perimeter; }

	// Getter methods
	String getShapeName(){ return this.shapeName; }
	double getArea(){ return this.area; }
	double getPerimeter(){ return this.perimeter; }

	// Display method
	void display()
	{
		System.out.println("Shape Name: " + shapeName);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
} // Shape class ends here


class Triangle extends Shape
{
	double side1;
	double side2;
	double side3;

	// Default constructor
	Triangle()
	{
		super();
		side1 = 10;
		side2 = 8;
		side3 = 6;
		System.out.println("Triangle Default constructor called...");
	}

	// Parameterized constructor
	Triangle(String shapeName, double side1, double side2, double side3)
	{
		super(shapeName, 0, 0);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		System.out.println("Triangle Parameterized constructor called...");
	}

	// Setter methods
	void setSide1(double s1){ this.side1 = s1; }
	void setSide2(double s2){ this.side2 = s2; }
	void setSide3(double s3){ this.side3 = s3; }

	// Getter methods
	double getSide1(){ return side1; }
	double getSide2(){ return side2; }
	double getSide3(){ return side3; }

	// Display method
	void display()
	{
		// Using Heron's formula for area
		double s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		perimeter = side1 + side2 + side3;

		super.display();
		System.out.println("Side1: " + side1);
		System.out.println("Side2: " + side2);
		System.out.println("Side3: " + side3);
	}
} // Triangle class ends here


class Rectangle extends Shape
{
	double length;
	double breadth;

	// Default constructor
	Rectangle()
	{
		super();
		length = 5;
		breadth = 3;
		System.out.println("Rectangle Default constructor called...");
	}

	// Parameterized constructor
	Rectangle(String shapeName, double length, double breadth)
	{
		super(shapeName, 0, 0);
		this.length = length;
		this.breadth = breadth;
		System.out.println("Rectangle Parameterized constructor called...");
	}

	// Setter methods
	void setLength(double length){ this.length = length; }
	void setBreadth(double breadth){ this.breadth = breadth; }

	// Getter methods
	double getLength(){ return length; }
	double getBreadth(){ return breadth; }

	// Display method
	void display()
	{
		area = length * breadth;
		perimeter = 2 * (length + breadth);

		super.display();
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
	}
} // Rectangle class ends here


class Square extends Shape
{
	double side;

	// Default constructor
	Square()
	{
		super();
		side = 5;
		System.out.println("Square Default constructor called...");
	}

	// Parameterized constructor
	Square(String shapeName, double side)
	{
		super(shapeName, 0, 0);
		this.side = side;
		System.out.println("Square Parameterized constructor called...");
	}

	// Setter method
	void setSide(double side){ this.side = side; }

	// Getter method
	double getSide(){ return side; }

	// Display method
	void display()
	{
		area = side * side;
		perimeter = 4 * side;

		super.display();
		System.out.println("Side: " + side);
	}
} // Square class ends here



class TestShape
{
	public static void main(String[] args)
	{
		System.out.println("=== Triangle Object ===");
		Triangle t1 = new Triangle("Triangle", 10, 8, 6);
		t1.display();
		System.out.println();

		System.out.println("=== Rectangle Object ===");
		Rectangle r1 = new Rectangle("Rectangle", 8, 4);
		r1.display();
		System.out.println();

		System.out.println("=== Square Object ===");
		Square s1 = new Square("Square", 5);
		s1.display();
	}
} // TestShape class ends here