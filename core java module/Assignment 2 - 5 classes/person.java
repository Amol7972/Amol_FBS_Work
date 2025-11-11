class Person
{
	String name;
	int age;

	// Default constructor
	Person()
	{
		name = "Unknown";
		age = 0;
		System.out.println("Person Default constructor called...");
	}

	// Parameterized constructor
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("Person Parameterized constructor called...");
	}

	// Setter methods
	void setName(String name){ this.name = name; }
	void setAge(int age){ this.age = age; }

	// Getter methods
	String getName(){ return this.name; }
	int getAge(){ return this.age; }

	// Display method
	void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
} // Person class ends here



class Student extends Person
{
	int rollNo;
	String course;

	// Default constructor
	Student()
	{
		super();
		rollNo = 0;
		course = "Not Assigned";
		System.out.println("Student Default constructor called...");
	}

	// Parameterized constructor
	Student(String name, int age, int rollNo, String course)
	{
		super(name, age);
		this.rollNo = rollNo;
		this.course = course;
		System.out.println("Student Parameterized constructor called...");
	}

	// Setter methods
	void setRollNo(int rollNo){ this.rollNo = rollNo; }
	void setCourse(String course){ this.course = course; }

	// Getter methods
	int getRollNo(){ return this.rollNo; }
	String getCourse(){ return this.course; }

	// Display method
	void display()
	{
		super.display();
		System.out.println("Roll No: " + rollNo);
		System.out.println("Course: " + course);
	}
} // Student class ends here



class Teacher extends Person
{
	String subject;
	double salary;

	// Default constructor
	Teacher()
	{
		super();
		subject = "Unknown";
		salary = 0.0;
		System.out.println("Teacher Default constructor called...");
	}

	// Parameterized constructor
	Teacher(String name, int age, String subject, double salary)
	{
		super(name, age);
		this.subject = subject;
		this.salary = salary;
		System.out.println("Teacher Parameterized constructor called...");
	}

	// Setter methods
	void setSubject(String subject){ this.subject = subject; }
	void setSalary(double salary){ this.salary = salary; }

	// Getter methods
	String getSubject(){ return this.subject; }
	double getSalary(){ return this.salary; }

	// Display method
	void display()
	{
		super.display();
		System.out.println("Subject: " + subject);
		System.out.println("Salary: " + salary);
	}
} // Teacher class ends here



class Principal extends Person
{
	int experience;
	String qualification;

	// Default constructor
	Principal()
	{
		super();
		experience = 0;
		qualification = "Not Mentioned";
		System.out.println("Principal Default constructor called...");
	}

	// Parameterized constructor
	Principal(String name, int age, int experience, String qualification)
	{
		super(name, age);
		this.experience = experience;
		this.qualification = qualification;
		System.out.println("Principal Parameterized constructor called...");
	}

	// Setter methods
	void setExperience(int experience){ this.experience = experience; }
	void setQualification(String qualification){ this.qualification = qualification; }

	// Getter methods
	int getExperience(){ return this.experience; }
	String getQualification(){ return this.qualification; }

	// Display method
	void display()
	{
		super.display();
		System.out.println("Experience (in years): " + experience);
		System.out.println("Qualification: " + qualification);
	}
} // Principal class ends here



class TestPerson
{
	public static void main(String[] args)
	{
		System.out.println("=== Student Object ===");
		Student s1 = new Student("Amol", 21, 101, "Computer Science");
		s1.display();
		System.out.println();

		System.out.println("=== Teacher Object ===");
		Teacher t1 = new Teacher("Ramesh", 35, "Java Programming", 45000);
		t1.display();
		System.out.println();

		System.out.println("=== Principal Object ===");
		Principal p1 = new Principal("Meena", 50, 25, "PhD in Education");
		p1.display();
	}
} // TestPerson class ends here