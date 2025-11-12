class Defence
{
	String nameOfHead;
	int numberOfTroops;
	int numberOfVehicle;
	double budget;
	int numberOfDepartment;
	String locationOfHeadQuarter;
	String countryName;
	int manPowerCount;
	int numberOfBases;
	int numberOfMissionPerformed;

	// Default constructor
	Defence()
	{
		nameOfHead = "Amol Shelke";
		numberOfTroops = 50000;
		numberOfVehicle = 2000;
		budget = 500000000;
		numberOfDepartment = 5;
		locationOfHeadQuarter = "Delhi";
		countryName = "India";
		manPowerCount = 100000;
		numberOfBases = 20;
		numberOfMissionPerformed = 120;
		System.out.println("Defence Default constructor called...");
	}

	// Parameterized constructor
	Defence(String nameOfHead, int numberOfTroops, int numberOfVehicle, double budget,
	        int numberOfDepartment, String locationOfHeadQuarter, String countryName,
	        int manPowerCount, int numberOfBases, int numberOfMissionPerformed)
	{
		this.nameOfHead = nameOfHead;
		this.numberOfTroops = numberOfTroops;
		this.numberOfVehicle = numberOfVehicle;
		this.budget = budget;
		this.numberOfDepartment = numberOfDepartment;
		this.locationOfHeadQuarter = locationOfHeadQuarter;
		this.countryName = countryName;
		this.manPowerCount = manPowerCount;
		this.numberOfBases = numberOfBases;
		this.numberOfMissionPerformed = numberOfMissionPerformed;
		System.out.println("Defence Parameterized constructor called...");
	}

	// Setter Methods
	void setNameOfHead(String H){this.nameOfHead = H;}
	void setNumberOfTroops(int T){this.numberOfTroops = T;}
	void setNumberOfVehicle(int V){this.numberOfVehicle = V;}
	void setBudget(double B){this.budget = B;}
	void setNumberOfDepartment(int D){this.numberOfDepartment = D;}
	void setLocationOfHeadQuarter(String L){this.locationOfHeadQuarter = L;}
	void setCountryName(String C){this.countryName = C;}
	void setManPowerCount(int M){this.manPowerCount = M;}
	void setNumberOfBases(int N){this.numberOfBases = N;}
	void setNumberOfMissionPerformed(int MP){this.numberOfMissionPerformed = MP;}

	// Getter Methods
	String getNameOfHead(){return this.nameOfHead;}
	int getNumberOfTroops(){return this.numberOfTroops;}
	int getNumberOfVehicle(){return this.numberOfVehicle;}
	double getBudget(){return this.budget;}
	int getNumberOfDepartment(){return this.numberOfDepartment;}
	String getLocationOfHeadQuarter(){return this.locationOfHeadQuarter;}
	String getCountryName(){return this.countryName;}
	int getManPowerCount(){return this.manPowerCount;}
	int getNumberOfBases(){return this.numberOfBases;}
	int getNumberOfMissionPerformed(){return this.numberOfMissionPerformed;}

	// Display() Method
	void display()
	{
		System.out.println("Head of Defence: " + nameOfHead);
		System.out.println("Number of Troops: " + numberOfTroops);
		System.out.println("Number of Vehicles: " + numberOfVehicle);
		System.out.println("Budget: " + budget);
		System.out.println("Number of Departments: " + numberOfDepartment);
		System.out.println("HeadQuarter Location: " + locationOfHeadQuarter);
		System.out.println("Country Name: " + countryName);
		System.out.println("Man Power Count: " + manPowerCount);
		System.out.println("Number of Bases: " + numberOfBases);
		System.out.println("Number of Missions Performed: " + numberOfMissionPerformed);
	}

} // Defence class ends here


class Army extends Defence
{
	int numberOfTanks;
	int numberOfGuns;
	int numberOfGranades;
	int numberOfBatallion;

	// Default constructor
	Army()
	{
		super();
		numberOfTanks = 1000;
		numberOfGuns = 20000;
		numberOfGranades = 5000;
		numberOfBatallion = 15;
		System.out.println("Army Default constructor called...");
	}

	// Parameterized constructor
	Army(String nameOfHead, int numberOfTroops, int numberOfVehicle, double budget,
	     int numberOfDepartment, String locationOfHeadQuarter, String countryName,
	     int manPowerCount, int numberOfBases, int numberOfMissionPerformed,
	     int numberOfTanks, int numberOfGuns, int numberOfGranades, int numberOfBatallion)
	{
		super(nameOfHead, numberOfTroops, numberOfVehicle, budget, numberOfDepartment,
		      locationOfHeadQuarter, countryName, manPowerCount, numberOfBases, numberOfMissionPerformed);
		this.numberOfTanks = numberOfTanks;
		this.numberOfGuns = numberOfGuns;
		this.numberOfGranades = numberOfGranades;
		this.numberOfBatallion = numberOfBatallion;
		System.out.println("Army Parameterized constructor called...");
	}

	// Setter Methods
	void setNumberOfTanks(int T){this.numberOfTanks = T;}
	void setNumberOfGuns(int G){this.numberOfGuns = G;}
	void setNumberOfGranades(int Gr){this.numberOfGranades = Gr;}
	void setNumberOfBatallion(int B){this.numberOfBatallion = B;}

	// Getter Methods
	int getNumberOfTanks(){return this.numberOfTanks;}
	int getNumberOfGuns(){return this.numberOfGuns;}
	int getNumberOfGranades(){return this.numberOfGranades;}
	int getNumberOfBatallion(){return this.numberOfBatallion;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Number of Tanks: " + numberOfTanks);
		System.out.println("Number of Guns: " + numberOfGuns);
		System.out.println("Number of Granades: " + numberOfGranades);
		System.out.println("Number of Batallion: " + numberOfBatallion);
	}
} // Army class ends here


class Navy extends Defence
{
	int numberOfShips;
	int numberOfSubmarines;
	int numberOfTorpedos;

	// Default constructor
	Navy()
	{
		super();
		numberOfShips = 50;
		numberOfSubmarines = 10;
		numberOfTorpedos = 200;
		System.out.println("Navy Default constructor called...");
	}

	// Parameterized constructor
	Navy(String nameOfHead, int numberOfTroops, int numberOfVehicle, double budget,
	     int numberOfDepartment, String locationOfHeadQuarter, String countryName,
	     int manPowerCount, int numberOfBases, int numberOfMissionPerformed,
	     int numberOfShips, int numberOfSubmarines, int numberOfTorpedos)
	{
		super(nameOfHead, numberOfTroops, numberOfVehicle, budget, numberOfDepartment,
		      locationOfHeadQuarter, countryName, manPowerCount, numberOfBases, numberOfMissionPerformed);
		this.numberOfShips = numberOfShips;
		this.numberOfSubmarines = numberOfSubmarines;
		this.numberOfTorpedos = numberOfTorpedos;
		System.out.println("Navy Parameterized constructor called...");
	}

	// Setter Methods
	void setNumberOfShips(int S){this.numberOfShips = S;}
	void setNumberOfSubmarines(int Sub){this.numberOfSubmarines = Sub;}
	void setNumberOfTorpedos(int T){this.numberOfTorpedos = T;}

	// Getter Methods
	int getNumberOfShips(){return this.numberOfShips;}
	int getNumberOfSubmarines(){return this.numberOfSubmarines;}
	int getNumberOfTorpedos(){return this.numberOfTorpedos;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Number of Ships: " + numberOfShips);
		System.out.println("Number of Submarines: " + numberOfSubmarines);
		System.out.println("Number of Torpedos: " + numberOfTorpedos);
	}
} // Navy class ends here


class AirForce extends Defence
{
	int numberOfMissiles;
	int numberOfAircraft;
	int numberOfSquadron;

	// Default constructor
	AirForce()
	{
		super();
		numberOfMissiles = 100;
		numberOfAircraft = 200;
		numberOfSquadron = 10;
		System.out.println("AirForce Default constructor called...");
	}

	// Parameterized constructor
	AirForce(String nameOfHead, int numberOfTroops, int numberOfVehicle, double budget,
	         int numberOfDepartment, String locationOfHeadQuarter, String countryName,
	         int manPowerCount, int numberOfBases, int numberOfMissionPerformed,
	         int numberOfMissiles, int numberOfAircraft, int numberOfSquadron)
	{
		super(nameOfHead, numberOfTroops, numberOfVehicle, budget, numberOfDepartment,
		      locationOfHeadQuarter, countryName, manPowerCount, numberOfBases, numberOfMissionPerformed);
		this.numberOfMissiles = numberOfMissiles;
		this.numberOfAircraft = numberOfAircraft;
		this.numberOfSquadron = numberOfSquadron;
		System.out.println("AirForce Parameterized constructor called...");
	}

	// Setter Methods
	void setNumberOfMissiles(int M){this.numberOfMissiles = M;}
	void setNumberOfAircraft(int A){this.numberOfAircraft = A;}
	void setNumberOfSquadron(int S){this.numberOfSquadron = S;}

	// Getter Methods
	int getNumberOfMissiles(){return this.numberOfMissiles;}
	int getNumberOfAircraft(){return this.numberOfAircraft;}
	int getNumberOfSquadron(){return this.numberOfSquadron;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Number of Missiles: " + numberOfMissiles);
		System.out.println("Number of Aircraft: " + numberOfAircraft);
		System.out.println("Number of Squadron: " + numberOfSquadron);
	}
} // AirForce class ends here


class TestDefence
{
	public static void main(String[] args)
	{
		// Creating Defence object
		Defence d1 = new Defence("Ravi", 60000, 2500, 600000000, 6, "Delhi", "India", 120000, 25, 150);
		d1.display();
		System.out.println("\n");

		// Creating Army object
		Army a1 = new Army();
		a1.display();
		System.out.println("\n");

		// Creating Navy object
		Navy n1 = new Navy("Prathmesh", 30000, 1500, 400000000, 4, "Mumbai", "India", 70000, 15, 80, 60, 12, 250);
		n1.display();
		System.out.println("\n");

		// Creating AirForce object
		AirForce af1 = new AirForce("Prakash", 40000, 1800, 500000000, 5, "Bangalore", "India", 90000, 18, 100, 120, 250, 15);
		af1.display();
	}

} // TestDefence class ends here

