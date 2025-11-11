class Vehicle
{
	String brand;
	String color;
	int speed;

	// Default Constructor
	Vehicle()
	{
		brand = "Unknown";
		color = "White";
		speed = 60;
		System.out.println("Vehicle Default constructor called...");
	}

	// Parameterized Constructor
	Vehicle(String brand, String color, int speed)
	{
		this.brand = brand;
		this.color = color;
		this.speed = speed;
		System.out.println("Vehicle Parameterized constructor called...");
	}

	// Setters
	void setBrand(String brand) { this.brand = brand; }
	void setColor(String color) { this.color = color; }
	void setSpeed(int speed) { this.speed = speed; }

	// Getters
	String getBrand() { return brand; }
	String getColor() { return color; }
	int getSpeed() { return speed; }

	// Display Method
	void display()
	{
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Speed: " + speed + " km/h");
	}
} // Vehicle class ends here




class Bus extends Vehicle
{
	int capacity;

	// Default Constructor
	Bus()
	{
		super();
		capacity = 50;
		System.out.println("Bus Default constructor called...");
	}

	// Parameterized Constructor
	Bus(String brand, String color, int speed, int capacity)
	{
		super(brand, color, speed);
		this.capacity = capacity;
		System.out.println("Bus Parameterized constructor called...");
	}

	// Setter
	void setCapacity(int capacity) { this.capacity = capacity; }

	// Getter
	int getCapacity() { return capacity; }

	// Display Method
	void display()
	{
		super.display();
		System.out.println("Passenger Capacity: " + capacity);
	}
} // Bus class ends here




class Car extends Vehicle
{
	int doors;
	String fuelType;

	// Default Constructor
	Car()
	{
		super();
		doors = 4;
		fuelType = "Petrol";
		System.out.println("Car Default constructor called...");
	}

	// Parameterized Constructor
	Car(String brand, String color, int speed, int doors, String fuelType)
	{
		super(brand, color, speed);
		this.doors = doors;
		this.fuelType = fuelType;
		System.out.println("Car Parameterized constructor called...");
	}

	// Setters
	void setDoors(int doors) { this.doors = doors; }
	void setFuelType(String fuelType) { this.fuelType = fuelType; }

	// Getters
	int getDoors() { return doors; }
	String getFuelType() { return fuelType; }

	// Display Method
	void display()
	{
		super.display();
		System.out.println("Doors: " + doors);
		System.out.println("Fuel Type: " + fuelType);
	}
} // Car class ends here




class Bike extends Vehicle
{
	String type;
	boolean hasGear;

	// Default Constructor
	Bike()
	{
		super();
		type = "Standard";
		hasGear = true;
		System.out.println("Bike Default constructor called...");
	}

	// Parameterized Constructor
	Bike(String brand, String color, int speed, String type, boolean hasGear)
	{
		super(brand, color, speed);
		this.type = type;
		this.hasGear = hasGear;
		System.out.println("Bike Parameterized constructor called...");
	}

	// Setters
	void setType(String type) { this.type = type; }
	void setHasGear(boolean hasGear) { this.hasGear = hasGear; }

	// Getters
	String getType() { return type; }
	boolean getHasGear() { return hasGear; }

	// Display Method
	void display()
	{
		super.display();
		System.out.println("Bike Type: " + type);
		System.out.println("Has Gear: " + hasGear);
	}
} // Bike class ends here




class TestVehicle
{
	public static void main(String[] args)
	{
		// Creating Vehicle object
		Vehicle v1 = new Vehicle("Tata", "Grey", 80);
		v1.display();
		System.out.println("\n");

		// Creating Bus object
		Bus b1 = new Bus("Volvo", "Blue", 120, 60);
		b1.display();
		System.out.println("\n");

		// Creating Car object
		Car c1 = new Car("BMW", "Black", 220, 4, "Diesel");
		c1.display();
		System.out.println("\n");

		// Creating Bike object
		Bike bk1 = new Bike("Yamaha", "Red", 150, "Sports", true);
		bk1.display();
	}

} // TestVehicle class ends here
