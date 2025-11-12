class Farmer
{
	int farmerId;
	String farmerName;
	double landArea;
	String village;
	double annualIncome;
	int numberOfEquipment;
	double insuranceAmount;

	// Default constructor
	Farmer()
	{
		farmerId = 101;
		farmerName = "Ramesh Patil";
		landArea = 5.5;
		village = "Shirur";
		annualIncome = 250000.50;
		numberOfEquipment = 5;
		insuranceAmount = 15000.75;
		System.out.println("Farmer Default constructor called...");
	}

	// Parameterized constructor
	Farmer(int farmerId, String farmerName, double landArea, String village, double annualIncome, int numberOfEquipment, double insuranceAmount)
	{
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.landArea = landArea;
		this.village = village;
		this.annualIncome = annualIncome;
		this.numberOfEquipment = numberOfEquipment;
		this.insuranceAmount = insuranceAmount;
		System.out.println("Farmer Parameterized constructor called...");
	}

	// Setter Methods
	void setFarmerId(int farmerId){this.farmerId = farmerId;}
	void setFarmerName(String farmerName){this.farmerName = farmerName;}
	void setLandArea(double landArea){this.landArea = landArea;}
	void setVillage(String village){this.village = village;}
	void setAnnualIncome(double annualIncome){this.annualIncome = annualIncome;}
	void setNumberOfEquipment(int numberOfEquipment){this.numberOfEquipment = numberOfEquipment;}
	void setInsuranceAmount(double insuranceAmount){this.insuranceAmount = insuranceAmount;}

	// Getter Methods
	int getFarmerId(){return this.farmerId;}
	String getFarmerName(){return this.farmerName;}
	double getLandArea(){return this.landArea;}
	String getVillage(){return this.village;}
	double getAnnualIncome(){return this.annualIncome;}
	int getNumberOfEquipment(){return this.numberOfEquipment;}
	double getInsuranceAmount(){return this.insuranceAmount;}

	// Display() Method
	void display()
	{
		System.out.println("Farmer Id: " + this.farmerId);
		System.out.println("Farmer Name: " + this.farmerName);
		System.out.println("Land Area (in acres): " + this.landArea);
		System.out.println("Village: " + this.village);
		System.out.println("Annual Income: " + this.annualIncome);
		System.out.println("Number Of Equipment: " + this.numberOfEquipment);
		System.out.println("Insurance Amount: " + this.insuranceAmount);
	}
} // Farmer class ends here


class DairyFarmer extends Farmer
{
	int numberOfCattles;
	double milkProducedPerDay;
	String dairyLicenseNumber;

	// Default constructor
	DairyFarmer()
	{
		super();
		numberOfCattles = 25;
		milkProducedPerDay = 180.5;
		dairyLicenseNumber = "DL-4567";
		System.out.println("DairyFarmer Default constructor called...");
	}

	// Parameterized constructor
	DairyFarmer(int farmerId, String farmerName, double landArea, String village, double annualIncome, int numberOfEquipment, double insuranceAmount, int numberOfCattles, double milkProducedPerDay, String dairyLicenseNumber)
	{
		super(farmerId, farmerName, landArea, village, annualIncome, numberOfEquipment, insuranceAmount);
		this.numberOfCattles = numberOfCattles;
		this.milkProducedPerDay = milkProducedPerDay;
		this.dairyLicenseNumber = dairyLicenseNumber;
		System.out.println("DairyFarmer Parameterized constructor called...");
	}

	// Setter Methods
	void setNumberOfCattles(int numberOfCattles){this.numberOfCattles = numberOfCattles;}
	void setMilkProducedPerDay(double milkProducedPerDay){this.milkProducedPerDay = milkProducedPerDay;}
	void setDairyLicenseNumber(String dairyLicenseNumber){this.dairyLicenseNumber = dairyLicenseNumber;}

	// Getter Methods
	int getNumberOfCattles(){return this.numberOfCattles;}
	double getMilkProducedPerDay(){return this.milkProducedPerDay;}
	String getDairyLicenseNumber(){return this.dairyLicenseNumber;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Number Of Cattles: " + this.numberOfCattles);
		System.out.println("Milk Produced Per Day (liters): " + this.milkProducedPerDay);
		System.out.println("Dairy License Number: " + this.dairyLicenseNumber);
	}
} // DairyFarmer class ends here


class PoultryFarmer extends Farmer
{
	int numberOfChickens;
	int numberOfHens;
	int numberOfShades;
	int eggProductionPerDay;
	String poultryFarmName;
	int shedCapacity;

	// Default constructor
	PoultryFarmer()
	{
		super();
		numberOfChickens = 1500;
		numberOfHens = 1000;
		numberOfShades = 5;
		eggProductionPerDay = 900;
		poultryFarmName = "Golden Eggs Poultry";
		shedCapacity = 300;
		System.out.println("PoultryFarmer Default constructor called...");
	}

	// Parameterized constructor
	PoultryFarmer(int farmerId, String farmerName, double landArea, String village, double annualIncome, int numberOfEquipment, double insuranceAmount,
	int numberOfChickens, int numberOfHens, int numberOfShades, int eggProductionPerDay, String poultryFarmName, int shedCapacity)
	{
		super(farmerId, farmerName, landArea, village, annualIncome, numberOfEquipment, insuranceAmount);
		this.numberOfChickens = numberOfChickens;
		this.numberOfHens = numberOfHens;
		this.numberOfShades = numberOfShades;
		this.eggProductionPerDay = eggProductionPerDay;
		this.poultryFarmName = poultryFarmName;
		this.shedCapacity = shedCapacity;
		System.out.println("PoultryFarmer Parameterized constructor called...");
	}

	// Setter Methods
	void setNumberOfChickens(int numberOfChickens){this.numberOfChickens = numberOfChickens;}
	void setNumberOfHens(int numberOfHens){this.numberOfHens = numberOfHens;}
	void setNumberOfShades(int numberOfShades){this.numberOfShades = numberOfShades;}
	void setEggProductionPerDay(int eggProductionPerDay){this.eggProductionPerDay = eggProductionPerDay;}
	void setPoultryFarmName(String poultryFarmName){this.poultryFarmName = poultryFarmName;}
	void setShedCapacity(int shedCapacity){this.shedCapacity = shedCapacity;}

	// Getter Methods
	int getNumberOfChickens(){return this.numberOfChickens;}
	int getNumberOfHens(){return this.numberOfHens;}
	int getNumberOfShades(){return this.numberOfShades;}
	int getEggProductionPerDay(){return this.eggProductionPerDay;}
	String getPoultryFarmName(){return this.poultryFarmName;}
	int getShedCapacity(){return this.shedCapacity;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Number Of Chickens: " + this.numberOfChickens);
		System.out.println("Number Of Hens: " + this.numberOfHens);
		System.out.println("Number Of Shades: " + this.numberOfShades);
		System.out.println("Egg Production Per Day: " + this.eggProductionPerDay);
		System.out.println("Poultry Farm Name: " + this.poultryFarmName);
		System.out.println("Shed Capacity: " + this.shedCapacity);
	}
} // PoultryFarmer class ends here


class OrganicFarmer extends Farmer
{
	String organicCertId;
	String cropType;
	String fertilizerUsed;

	// Default constructor
	OrganicFarmer()
	{
		super();
		organicCertId = "ORG-123";
		cropType = "Soybean";
		fertilizerUsed = "Bio-Compost";
		System.out.println("OrganicFarmer Default constructor called...");
	}

	// Parameterized constructor
	OrganicFarmer(int farmerId, String farmerName, double landArea, String village, double annualIncome, int numberOfEquipment, double insuranceAmount,
	String organicCertId, String cropType, String fertilizerUsed)
	{
		super(farmerId, farmerName, landArea, village, annualIncome, numberOfEquipment, insuranceAmount);
		this.organicCertId = organicCertId;
		this.cropType = cropType;
		this.fertilizerUsed = fertilizerUsed;
		System.out.println("OrganicFarmer Parameterized constructor called...");
	}

	// Setter Methods
	void setOrganicCertId(String organicCertId){this.organicCertId = organicCertId;}
	void setCropType(String cropType){this.cropType = cropType;}
	void setFertilizerUsed(String fertilizerUsed){this.fertilizerUsed = fertilizerUsed;}

	// Getter Methods
	String getOrganicCertId(){return this.organicCertId;}
	String getCropType(){return this.cropType;}
	String getFertilizerUsed(){return this.fertilizerUsed;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Organic Certificate ID: " + this.organicCertId);
		System.out.println("Crop Type: " + this.cropType);
		System.out.println("Fertilizer Used: " + this.fertilizerUsed);
	}
} // OrganicFarmer class ends here


class TestFarmer
{
	public static void main(String[] args)
	{
		System.out.println("\n");
		Farmer f1 = new Farmer();
		f1.display();
		System.out.println("\n");

		System.out.println("\n");
		DairyFarmer df1 = new DairyFarmer();
		df1.display();
		System.out.println("\n");

		System.out.println("\n");
		PoultryFarmer pf1 = new PoultryFarmer();
		pf1.display();
		System.out.println("\n");

		System.out.println("\n");
		OrganicFarmer of1 = new OrganicFarmer();
		of1.display();
		System.out.println("\n");
	}
} // TestFarmer class ends here