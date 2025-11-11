

class Student {
	int fbid;
	String name;
	int distance;
	static int count = 0;
	
	// Default Constructor
	
	Student()
	{
		fbid = 100;
		name = "Not given";
		distance = 10;
		count++;
		System.out.println("Student Default constructor called...");
	}
	
	// Parameterized constructor
	
	Student(int fbid, String name, int distance) {
		this.fbid = fbid;
		this.name = name;
		this.distance = distance;
		count++;
		System.out.println("Student Parameterized constructor called...");
	}
	
	// Setters and Getters

	void setFbid(int fbid) {
		this.fbid = fbid;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getDistance() {
		return distance;
	}
	void setDistance(int distance) {
		this.distance = distance;
	}
	static int getCount() {
		return count;
	}
	static void setCount(int count) {
		Student.count = count;
	}
	
	// Display() Method
	
	void display()
	{
		System.out.println("Firstbit Id: " + this.fbid);
		System.out.println("Name is: " + this.name);
		System.out.println("Distance Travelled: " + this.distance);
	}
	

} // Student class ends here


class PlacedStudent extends Student // Step 1
{
	// step 2: Remove state and behaviour which is available in super class
	String companyName;
	String designation;
	
	// Default constructor
	
	PlacedStudent()
	{
		super(); // step 4A
		companyName = "xyz";
		designation = "pqr";
		System.out.println("PlacedStudent Default constructor called...");
	}
	
	// Parameterized constructor

	PlacedStudent(int fbid, String name, int distance, String companyName, String designation) {
		super(fbid, name, distance); // step 4B
		this.companyName = companyName;
		this.designation = designation;
		System.out.println("PlacedStudent Parameterized constructor called...");
	}
	
	// Getters and Setters

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}
	
	// Display() Method
	
		void display()
		{
			super.display(); // step 3
			System.out.println("Company Name: " + this.companyName);
			System.out.println("Designation: " + this.designation);
		}
	
} // PlacedStudent class ends here



class DemoInheritance
{
	public static void main(String[] args) {
		// Student s1 = new Student();
		// System.out.println("Student Count: " + Student.getCount());

		// Student s2 = new Student(102, "Aditya", 100);
		// System.out.println("Student Count: " + Student.getCount());

		PlacedStudent ps1 = new PlacedStudent();
		System.out.println("Student Count: " + Student.getCount());
		ps1.display();
		System.out.println(ps1.getName());
		System.out.println("\n\n");

		PlacedStudent ps2 = new PlacedStudent(78, "Rahul", 500, "BCCI", "Coach");
		System.out.println("Student Count: " + Student.getCount());
		ps2.display();
		System.out.println(ps2.getName());

		

		
	}
}


