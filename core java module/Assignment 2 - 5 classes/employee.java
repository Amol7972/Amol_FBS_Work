class Employee
{
	int id;
	String name;
	double salary;

	Employee()
	{
		id = 111;
		name = "Rahul";
		salary = 22000;
		System.out.println("Default constructor called ...");
	}

	Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Parameterized constructor called ...");
	}

	// Using Setter

	void setId(int I){this.id = I;}
	void setName(String N){this.name = N;}
	void setSalary(double S){this.salary = S;}

	// Using Getter

	int getId(){return this.id;}
	String getName(){return this.name;}
	double getSalary(){return this.salary;}

	// Using Display()

	void display()
	{
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

} // Employee class ends here


class Admin extends Employee
{
	
	double allowence;

	// Default constructor

	Admin()
	{
		super();
		allowence = 1100;
		System.out.println("Admin Default constructor called ...");
	}

	// Parameterized constructor

	Admin(int id, String name, double salary, double allowence)
	{
		super(id, name, salary);
		this.allowence = allowence;
		System.out.println("Admin Parameterized constructor called ...");
	}

	// Setter Methods

	void setAllowence(double A){this.allowence = A;}

	// Getter Methods

	double getAllowence(){return this.allowence;}

	// Display() Method

	void display()
	{
		super.display();
		System.out.println("Allowence: " + allowence);
	}

} // Admin class ends here


class Hr extends Employee
{
	double commission;

	// Default constructor

	Hr()
	{
		super();
		commission = 2000;
		System.out.println("HR Default constructor called ...");
	}

	// Parameterized constructor

	Hr(int id, String name, double salary, double cmmission)
	{
		super(id, name, salary);
		this.commission = commission;
		System.out.println("HR Parameterized constructor called...");
	}
	
	// Setter Methods
	
	void setCommission(double C){this.commission = C;}

	// Getter Methods

	double getCommission(){return this.commission;}

	void display()
	{
		super.display();
		System.out.println("Commission: " + commission);
	}

} // Hr class ends here


class SalesManager extends Employee
{
	double incentive;
	int target;

	// Default constructor

	SalesManager()
	{
		super();
		incentive = 2000;
		target = 50;
		System.out.println("SalesManager Default constructor called...");
	}

	// Parameterized constructor

	SalesManager(int id, String name, double salary, double incentive, int target)
	{
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
		System.out.println("SalesManager Parameterized constructor called ...");
	}

	// Setter Methods

	void setIncentive(double I){this.incentive = I;}
	void setTarget(int T){this.target = T;}
	
	// Getter Methods	

	double getIncentive(){return this.incentive;}
	int getTarget(){return this.target;}

	void display()
	{
		super.display();
		System.out.println("Incentive: " + incentive);
		System.out.println("Target: " + target);
	}

} // SalesManager class ends here





class TestEmployee
{
public static void main(String[] args)

{

	// Creating Employee object

	Employee e1 = new Employee(101, "Amol", 60000);
	e1.display();
	System.out.println("\n");	

	// Creating Admin object

	Admin a1 = new Admin();
	a1.display();
	System.out.println("\n");

	// Creating Hr object

	Hr h1 = new Hr(201, "Sneha", 30000, 2500);
	h1.display();
	System.out.println("\n");

	// Creating SalesManager object

	SalesManager s1 = new SalesManager(301, "Ravi", 35000, 3000, 70);
	s1.display();
	



}
} // TestEmployee class ends here

