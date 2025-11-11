class ElectronicDevice
{
	int deviceId;
	String brandName;
	double price;

	// Default constructor
	ElectronicDevice()
	{
		deviceId = 100;
		brandName = "Unknown";
		price = 0.0;
		System.out.println("ElectronicDevice Default constructor called...");
	}

	// Parameterized constructor
	ElectronicDevice(int deviceId, String brandName, double price)
	{
		this.deviceId = deviceId;
		this.brandName = brandName;
		this.price = price;
		System.out.println("ElectronicDevice Parameterized constructor called...");
	}

	// Setter methods
	void setDeviceId(int deviceId){ this.deviceId = deviceId; }
	void setBrandName(String brandName){ this.brandName = brandName; }
	void setPrice(double price){ this.price = price; }

	// Getter methods
	int getDeviceId(){ return this.deviceId; }
	String getBrandName(){ return this.brandName; }
	double getPrice(){ return this.price; }

	// Display method
	void display()
	{
		System.out.println("Device ID: " + deviceId);
		System.out.println("Brand Name: " + brandName);
		System.out.println("Price: ₹" + price);
	}
} // ElectronicDevice class ends here



class Laptop extends ElectronicDevice
{
	String processor;
	int ram;

	// Default constructor
	Laptop()
	{
		super();
		processor = "Intel i5";
		ram = 8;
		System.out.println("Laptop Default constructor called...");
	}

	// Parameterized constructor
	Laptop(int deviceId, String brandName, double price, String processor, int ram)
	{
		super(deviceId, brandName, price);
		this.processor = processor;
		this.ram = ram;
		System.out.println("Laptop Parameterized constructor called...");
	}

	// Setter methods
	void setProcessor(String processor){ this.processor = processor; }
	void setRam(int ram){ this.ram = ram; }

	// Getter methods
	String getProcessor(){ return this.processor; }
	int getRam(){ return this.ram; }

	// Display method
	void display()
	{
		super.display();
		System.out.println("Processor: " + processor);
		System.out.println("RAM: " + ram + " GB");
	}
} // Laptop class ends here



class TV extends ElectronicDevice
{
	int screenSize;
	String displayType;

	// Default constructor
	TV()
	{
		super();
		screenSize = 32;
		displayType = "LED";
		System.out.println("TV Default constructor called...");
	}

	// Parameterized constructor
	TV(int deviceId, String brandName, double price, int screenSize, String displayType)
	{
		super(deviceId, brandName, price);
		this.screenSize = screenSize;
		this.displayType = displayType;
		System.out.println("TV Parameterized constructor called...");
	}

	// Setter methods
	void setScreenSize(int screenSize){ this.screenSize = screenSize; }
	void setDisplayType(String displayType){ this.displayType = displayType; }

	// Getter methods
	int getScreenSize(){ return this.screenSize; }
	String getDisplayType(){ return this.displayType; }

	// Display method
	void display()
	{
		super.display();
		System.out.println("Screen Size: " + screenSize + " inches");
		System.out.println("Display Type: " + displayType);
	}
} // TV class ends here



class Mobile extends ElectronicDevice
{
	String os;
	int batteryCapacity;

	// Default constructor
	Mobile()
	{
		super();
		os = "Android";
		batteryCapacity = 5000;
		System.out.println("Mobile Default constructor called...");
	}

	// Parameterized constructor
	Mobile(int deviceId, String brandName, double price, String os, int batteryCapacity)
	{
		super(deviceId, brandName, price);
		this.os = os;
		this.batteryCapacity = batteryCapacity;
		System.out.println("Mobile Parameterized constructor called...");
	}

	// Setter methods
	void setOs(String os){ this.os = os; }
	void setBatteryCapacity(int batteryCapacity){ this.batteryCapacity = batteryCapacity; }

	// Getter methods
	String getOs(){ return this.os; }
	int getBatteryCapacity(){ return this.batteryCapacity; }

	// Display method
	void display()
	{
		super.display();
		System.out.println("Operating System: " + os);
		System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
	}
} // Mobile class ends here



class TestElectronicDevice
{
	public static void main(String[] args)
	{
		System.out.println("=== Laptop Object ===");
		Laptop l1 = new Laptop(101, "HP", 65000, "Intel i7", 16);
		l1.display();
		System.out.println();

		System.out.println("=== TV Object ===");
		TV t1 = new TV(202, "Samsung", 55000, 55, "OLED");
		t1.display();
		System.out.println();

		System.out.println("=== Mobile Object ===");
		Mobile m1 = new Mobile(303, "OnePlus", 40000, "Android", 5000);
		m1.display();
	}
} // TestElectronicDevice class ends here