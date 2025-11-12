class Animal
{
	int animalId;
	String animalName;
	String color;
	int age;
	double weight;

	// Default constructor
	Animal()
	{
		animalId = 101;
		animalName = "Unknown Animal";
		color = "Brown";
		age = 5;
		weight = 50.0;
		System.out.println("Animal Default constructor called...");
	}

	// Parameterized constructor
	Animal(int animalId, String animalName, String color, int age, double weight)
	{
		this.animalId = animalId;
		this.animalName = animalName;
		this.color = color;
		this.age = age;
		this.weight = weight;
		System.out.println("Animal Parameterized constructor called...");
	}

	// Setter Methods
	void setAnimalId(int animalId){this.animalId = animalId;}
	void setAnimalName(String animalName){this.animalName = animalName;}
	void setColor(String color){this.color = color;}
	void setAge(int age){this.age = age;}
	void setWeight(double weight){this.weight = weight;}

	// Getter Methods
	int getAnimalId(){return this.animalId;}
	String getAnimalName(){return this.animalName;}
	String getColor(){return this.color;}
	int getAge(){return this.age;}
	double getWeight(){return this.weight;}

	// Display() Method
	void display()
	{
		System.out.println("Animal Id: " + this.animalId);
		System.out.println("Animal Name: " + this.animalName);
		System.out.println("Color: " + this.color);
		System.out.println("Age: " + this.age);
		System.out.println("Weight: " + this.weight);
	}

} // Animal class ends here



class Dog extends Animal
{
	String breed;
	String isTrained;
	String ownerName;

	// Default constructor
	Dog()
	{
		super();
		breed = "Labrador";
		isTrained = "Yes";
		ownerName = "Ramesh";
		System.out.println("Dog Default constructor called...");
	}

	// Parameterized constructor
	Dog(int animalId, String animalName, String color, int age, double weight, String breed, String isTrained, String ownerName)
	{
		super(animalId, animalName, color, age, weight);
		this.breed = breed;
		this.isTrained = isTrained;
		this.ownerName = ownerName;
		System.out.println("Dog Parameterized constructor called...");
	}

	// Setter Methods
	void setBreed(String breed){this.breed = breed;}
	void setIsTrained(String isTrained){this.isTrained = isTrained;}
	void setOwnerName(String ownerName){this.ownerName = ownerName;}

	// Getter Methods
	String getBreed(){return this.breed;}
	String getIsTrained(){return this.isTrained;}
	String getOwnerName(){return this.ownerName;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Breed: " + this.breed);
		System.out.println("Is Trained: " + this.isTrained);
		System.out.println("Owner Name: " + this.ownerName);
	}

} // Dog class ends here



class Elephant extends Animal
{
	double trunkLength;
	double tuskLength;
	String regionFound;

	// Default constructor
	Elephant()
	{
		super();
		trunkLength = 2.5;
		tuskLength = 1.2;
		regionFound = "Africa";
		System.out.println("Elephant Default constructor called...");
	}

	// Parameterized constructor
	Elephant(int animalId, String animalName, String color, int age, double weight, double trunkLength, double tuskLength, String regionFound)
	{
		super(animalId, animalName, color, age, weight);
		this.trunkLength = trunkLength;
		this.tuskLength = tuskLength;
		this.regionFound = regionFound;
		System.out.println("Elephant Parameterized constructor called...");
	}

	// Setter Methods
	void setTrunkLength(double trunkLength){this.trunkLength = trunkLength;}
	void setTuskLength(double tuskLength){this.tuskLength = tuskLength;}
	void setRegionFound(String regionFound){this.regionFound = regionFound;}

	// Getter Methods
	double getTrunkLength(){return this.trunkLength;}
	double getTuskLength(){return this.tuskLength;}
	String getRegionFound(){return this.regionFound;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Trunk Length: " + this.trunkLength + " meters");
		System.out.println("Tusk Length: " + this.tuskLength + " meters");
		System.out.println("Region Found: " + this.regionFound);
	}

} // Elephant class ends here



class Cow extends Animal
{
	String breed;
	double milkProductionPerDay;
	String isPregnant;
	String ownerName;

	// Default constructor
	Cow()
	{
		super();
		breed = "Jersey";
		milkProductionPerDay = 15.5;
		isPregnant = "No";
		ownerName = "Suresh";
		System.out.println("Cow Default constructor called...");
	}

	// Parameterized constructor
	Cow(int animalId, String animalName, String color, int age, double weight, String breed, double milkProductionPerDay, String isPregnant, String ownerName)
	{
		super(animalId, animalName, color, age, weight);
		this.breed = breed;
		this.milkProductionPerDay = milkProductionPerDay;
		this.isPregnant = isPregnant;
		this.ownerName = ownerName;
		System.out.println("Cow Parameterized constructor called...");
	}

	// Setter Methods
	void setBreed(String breed){this.breed = breed;}
	void setMilkProductionPerDay(double milkProductionPerDay){this.milkProductionPerDay = milkProductionPerDay;}
	void setIsPregnant(String isPregnant){this.isPregnant = isPregnant;}
	void setOwnerName(String ownerName){this.ownerName = ownerName;}

	// Getter Methods
	String getBreed(){return this.breed;}
	double getMilkProductionPerDay(){return this.milkProductionPerDay;}
	String getIsPregnant(){return this.isPregnant;}
	String getOwnerName(){return this.ownerName;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Breed: " + this.breed);
		System.out.println("Milk Production Per Day: " + this.milkProductionPerDay + " liters");
		System.out.println("Is Pregnant: " + this.isPregnant);
		System.out.println("Owner Name: " + this.ownerName);
	}

} // Cow class ends here



class TestAnimal
{
	public static void main(String[] args)
	{
		System.out.println("\n");
		Animal a1 = new Animal();
		a1.display();
		System.out.println("\n");

		System.out.println("\n");
		Dog d1 = new Dog();
		d1.display();
		System.out.println("\n");

		System.out.println("\n");
		Elephant e1 = new Elephant();
		e1.display();
		System.out.println("\n");

		System.out.println("\n");
		Cow c1 = new Cow();
		c1.display();
		System.out.println("\n");
	}

} // TestAnimal class ends here

