class CivilDepartment
{
	int deptId;
	String deptName;
	String location;
	String headOfDepartment;
	int noOfEmployees;
	double budget;

	// Default constructor
	CivilDepartment()
	{
		deptId = 1001;
		deptName = "Civil Department";
		location = "Mumbai";
		headOfDepartment = "Mr. Sharma";
		noOfEmployees = 250;
		budget = 12.5;
		System.out.println("CivilDepartment Default constructor called...");
	}

	// Parameterized constructor
	CivilDepartment(int deptId, String deptName, String location, String headOfDepartment, int noOfEmployees, double budget)
	{
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
		this.headOfDepartment = headOfDepartment;
		this.noOfEmployees = noOfEmployees;
		this.budget = budget;
		System.out.println("CivilDepartment Parameterized constructor called...");
	}

	// Setter Methods
	void setDeptId(int deptId){this.deptId = deptId;}
	void setDeptName(String deptName){this.deptName = deptName;}
	void setLocation(String location){this.location = location;}
	void setHeadOfDepartment(String headOfDepartment){this.headOfDepartment = headOfDepartment;}
	void setNoOfEmployees(int noOfEmployees){this.noOfEmployees = noOfEmployees;}
	void setBudget(double budget){this.budget = budget;}

	// Getter Methods
	int getDeptId(){return this.deptId;}
	String getDeptName(){return this.deptName;}
	String getLocation(){return this.location;}
	String getHeadOfDepartment(){return this.headOfDepartment;}
	int getNoOfEmployees(){return this.noOfEmployees;}
	double getBudget(){return this.budget;}

	// Display() Method
	void display()
	{
		System.out.println("Department ID: " + this.deptId);
		System.out.println("Department Name: " + this.deptName);
		System.out.println("Location: " + this.location);
		System.out.println("Head Of Department: " + this.headOfDepartment);
		System.out.println("Number Of Employees: " + this.noOfEmployees);
		System.out.println("Budget (in crores): " + this.budget);
	}
} // CivilDepartment class ends here



class PublicWorkDepartment extends CivilDepartment
{
	int noOfProjects;
	String projectType;
	int completedProjects;
	String contractorName;

	// Default constructor
	PublicWorkDepartment()
	{
		super();
		noOfProjects = 20;
		projectType = "Road Construction";
		completedProjects = 12;
		contractorName = "ABC Constructions";
		System.out.println("PublicWorkDepartment Default constructor called...");
	}

	// Parameterized constructor
	PublicWorkDepartment(int deptId, String deptName, String location, String headOfDepartment, int noOfEmployees, double budget, int noOfProjects, String projectType, int completedProjects, String contractorName)
	{
		super(deptId, deptName, location, headOfDepartment, noOfEmployees, budget);
		this.noOfProjects = noOfProjects;
		this.projectType = projectType;
		this.completedProjects = completedProjects;
		this.contractorName = contractorName;
		System.out.println("PublicWorkDepartment Parameterized constructor called...");
	}

	// Setter Methods
	void setNoOfProjects(int noOfProjects){this.noOfProjects = noOfProjects;}
	void setProjectType(String projectType){this.projectType = projectType;}
	void setCompletedProjects(int completedProjects){this.completedProjects = completedProjects;}
	void setContractorName(String contractorName){this.contractorName = contractorName;}

	// Getter Methods
	int getNoOfProjects(){return this.noOfProjects;}
	String getProjectType(){return this.projectType;}
	int getCompletedProjects(){return this.completedProjects;}
	String getContractorName(){return this.contractorName;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Number Of Projects: " + this.noOfProjects);
		System.out.println("Project Type: " + this.projectType);
		System.out.println("Completed Projects: " + this.completedProjects);
		System.out.println("Contractor Name: " + this.contractorName);
	}
} // PublicWorkDepartment class ends here



class Irrigation extends CivilDepartment
{
	String projectName;
	double waterCapacity;
	double areaCovered;
	String riverName;

	// Default constructor
	Irrigation()
	{
		super();
		projectName = "Krishna Canal Project";
		waterCapacity = 450.5;
		areaCovered = 1200.75;
		riverName = "Krishna";
		System.out.println("Irrigation Default constructor called...");
	}

	// Parameterized constructor
	Irrigation(int deptId, String deptName, String location, String headOfDepartment, int noOfEmployees, double budget, String projectName, double waterCapacity, double areaCovered, String riverName)
	{
		super(deptId, deptName, location, headOfDepartment, noOfEmployees, budget);
		this.projectName = projectName;
		this.waterCapacity = waterCapacity;
		this.areaCovered = areaCovered;
		this.riverName = riverName;
		System.out.println("Irrigation Parameterized constructor called...");
	}

	// Setter Methods
	void setProjectName(String projectName){this.projectName = projectName;}
	void setWaterCapacity(double waterCapacity){this.waterCapacity = waterCapacity;}
	void setAreaCovered(double areaCovered){this.areaCovered = areaCovered;}
	void setRiverName(String riverName){this.riverName = riverName;}

	// Getter Methods
	String getProjectName(){return this.projectName;}
	double getWaterCapacity(){return this.waterCapacity;}
	double getAreaCovered(){return this.areaCovered;}
	String getRiverName(){return this.riverName;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Project Name: " + this.projectName);
		System.out.println("Water Capacity (in million liters): " + this.waterCapacity);
		System.out.println("Area Covered (in hectares): " + this.areaCovered);
		System.out.println("River Name: " + this.riverName);
	}
} // Irrigation class ends here



class TestCivilDepartment
{
	public static void main(String[] args)
	{
		System.out.println("\n--- Civil Department Details ---");
		CivilDepartment cd = new CivilDepartment();
		cd.display();
		System.out.println("\n");

		System.out.println("--- Public Work Department Details ---");
		PublicWorkDepartment pwd = new PublicWorkDepartment();
		pwd.display();
		System.out.println("\n");

		System.out.println("--- Irrigation Department Details ---");
		Irrigation irr = new Irrigation();
		irr.display();
		System.out.println("\n");
	}
} // TestCivilDepartment class ends here