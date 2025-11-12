class SocialMediaAccount
{
	String userName;
	String mailId;
	String isPublic;
	String isVerified;
	String countryOrigin;
	int numberOfPost;
	int like;
	int comment;
	

	// Default constructor
	SocialMediaAccount()
	{
		userName = "Unknown";
		mailId = "abc@gmail.com";
		isPublic = "Yes";
		isVerified = "Yes";
		countryOrigin = "Yes";
		numberOfPost = 15;
		like = 3000;
		comment = 1424;
		System.out.println("SocialMediaAccount Default constructor called...");
	}

	// Parameterized constructor
	SocialMediaAccount(String username, String mailId, String isPublic, String isVerified, String countryOrigin, int numberOfPost, int like, int comment)
	{
		this.userName = username;
		this.mailId = mailId;
		this.isPublic = isPublic;
		this.isVerified = isVerified;
		this.countryOrigin = countryOrigin;
		this.numberOfPost = numberOfPost;
		this.like = like;
		this.comment = comment;
		System.out.println("SocialMediaAccount Parameterized constructor called...");
	}

	// Setter Methods
	void setUserName(String userName){this.userName = userName;}
	void setMailId(String mailId){this.mailId = mailId;}
	void setIsPublic(String isPublic){this.isPublic = isPublic;}
	void setIsVerified(String isVerified){this.isVerified = isVerified;}
	void setCountryOrigin(String countryOrigin){this.countryOrigin = countryOrigin;}
	void setNumberOfPost(int numberOfPost){this.numberOfPost = numberOfPost;}
	void setLike(int like){this.like = like;}
	void setComment(int comment){this.comment = comment;}
	
	// Getter Methods
	String getuserName(){return this.userName;}
	String getmailId(){return this.mailId;}
	String getisPublic(){return this.isPublic;}
	String getisVerified(){return this.isVerified;}
	String getcountryOrigin(){return this.countryOrigin;}
	int getnumberOfPost(){return this.numberOfPost;}
	int getlike(){return this.like;}
	int getcomment(){return this.comment;}

	// Display() Method
	void display()
	{
		System.out.println("User Name: " + this.userName);
		System.out.println("Mail Id: " + this.mailId);
		System.out.println("Is Public: " + this.isPublic);
		System.out.println("Is Verified: " + this.isVerified);
		System.out.println("Country Origin: " + this.countryOrigin);
		System.out.println("Number Of Posts: " + this.numberOfPost);
		System.out.println("Likes: " + this.like);
		System.out.println("Comments: " + this.comment);
	}

} // SocialMediaAccount class ends here



class InstagramAccount extends SocialMediaAccount
{
	int numberOfFollower;
	int numberOfFollowing;
	int numberOfHighlight;
	int numberOfPostArchive;
	int numberOfStoryArchive;
	int numberOfAudioSaved;

	// Default constructor
	InstagramAccount()	
	{
		super();
		numberOfFollower = 2500;
		numberOfFollowing = 12458;
		numberOfHighlight = 12;
		numberOfPostArchive = 100;
		numberOfStoryArchive = 25;
		numberOfAudioSaved = 21;
		System.out.println("InstagramAccount Default constructor called...");
	}

	// Parameterized constructor
	InstagramAccount(String username, String mailId, String isPublic, String isVerified, String countryOrigin, int numberOfPost, int like, int comment, int numberOfFollower, int 	numberOfFollowing, int numberOfHighlight, int numberOfPostArchive, int numberOfStoryArchive, int numberOfAudioSaved)
	{
		super(username, mailId, isPublic, isVerified, countryOrigin, numberOfPost, like, comment);
		this.numberOfFollower = numberOfFollower;
		this.numberOfFollowing = numberOfFollowing;
		this.numberOfHighlight = numberOfHighlight;
		this.numberOfPostArchive = numberOfPostArchive;
		this.numberOfStoryArchive = numberOfStoryArchive;
		this.numberOfAudioSaved = numberOfAudioSaved;
		System.out.println("InstagramAccount Parameterized constructor called...");
	}

	// Setter Methods
	void setNumberOfFollower(int numberOfFollower){this.numberOfFollower = numberOfFollower;}
	void setNumberOfFollowing(int numberOfFollowing){this.numberOfFollowing = numberOfFollowing;}
	void setNumberOfHighlight(int numberOfHighlight){this.numberOfHighlight = numberOfHighlight;}
	void setNumberOfPostArchive(int numberOfPostArchive){this.numberOfPostArchive = numberOfPostArchive;}
	void setNumberOfStoryArchive(int numberOfStoryArchive){this.numberOfStoryArchive = numberOfStoryArchive;}
	void setNumberOfAudioSaved(int numberOfAudioSaved){this.numberOfAudioSaved = numberOfAudioSaved;}

	// Getter Methods
	int getNumberOfFollower(){return this.numberOfFollower;}
	int getNumberOfFollowing(){return this.numberOfFollowing;}
	int getNumberOfHighlight(){return this.numberOfHighlight;}
	int getNumberOfPostArchive(){return this.numberOfPostArchive;}
	int getNumberOfStoryArchive(){return this.numberOfStoryArchive;}
	int getNumberOfAudioSaved(){return this.numberOfAudioSaved;}
		
	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Number Of Followers: " + this.numberOfFollower);
		System.out.println("Number Of Following: " + this.numberOfFollowing);
		System.out.println("Number Of Heighlight: " + this.numberOfHighlight);
		System.out.println("Number Of Posts Archived: " + this.numberOfPostArchive);
		System.out.println("Number Of Story Archieved: " + this.numberOfStoryArchive);
		System.out.println("Number Of Audio Saved: " + this.numberOfAudioSaved);
	}

} // InstagramAccount class ends here


class LinkedIn extends SocialMediaAccount
{
	int numberOfConnection;
	int numberOfProfileViewed;
	int numberOfJobApplied;

	// Default constructor
	LinkedIn()
	{
		super();
		numberOfConnection = 5000;
		numberOfProfileViewed = 500;
		numberOfJobApplied = 10;
		System.out.println("LinkedIn Default constructor called...");
	}
	
	// Parameterized constructor
	LinkedIn(String username, String mailId, String isPublic, String isVerified, String countryOrigin, int numberOfPost, int like, int comment, int numberOfConnection, int 	numberOfProfileViewed, int numberOfJobApplied)
	{
		super(username, mailId, isPublic, isVerified, countryOrigin, numberOfPost, like, comment);
		this.numberOfConnection = numberOfConnection;
		this.numberOfProfileViewed = numberOfProfileViewed;
		this.numberOfJobApplied = numberOfJobApplied;
		System.out.println("LinkedIn Parameterized constructor called...");
	}

	// Setter Methods

	void setNumberOfConnection(int numberOfConnection){this.numberOfConnection = numberOfConnection;}
	void setNumberOfProfileViewed(int numberOfProfileViewed){this.numberOfProfileViewed = numberOfProfileViewed;}
	void setNumberOfJobApplied(int numberOfJobApplied){this.numberOfJobApplied = numberOfJobApplied;}

	// Getter Methods
	int getNumberOfConnection(){return this.numberOfConnection;}
	int getNumberOfProfileViewed(){return this.numberOfProfileViewed;}
	int getNumberOfJobApplied(){return this.numberOfJobApplied;}

	// Display() Method
	void display()
	{
		super.display();
		System.out.println("Number Of Connection: " + this.numberOfConnection);
		System.out.println("Number Of Profile Viewed: " + this.numberOfProfileViewed);
		System.out.println("Number Of Job Applied: " + this.numberOfJobApplied);
	}

} // LinkedIn class ends here



class Youtube extends SocialMediaAccount
{
	int numberOfSubscriber;
	int waterTime;
	String isMonitized;
	String estimatedRevenue;

	// Default constructor
	Youtube()
	{
		super();
		numberOfSubscriber = 5000;
		waterTime = 5;
		isMonitized = "Yes";
		estimatedRevenue = "Yes";
		System.out.println("Youtube Default constructor called...");
	}

	// Parameterized constructor
	Youtube(String username, String mailId, String isPublic, String isVerified, String countryOrigin, int numberOfPost, int like, int comment, int numberOfSubscriber, int waterTime, 	String isMonitized, String estimatedRevenue)
	{
		super(username, mailId, isPublic, isVerified, countryOrigin, numberOfPost, like, comment);
		this.numberOfSubscriber = numberOfSubscriber;
		this.waterTime = waterTime;
		this.isMonitized = isMonitized;
		this.estimatedRevenue = estimatedRevenue;
	}

	// Setter Methods
	
	void setNumberOfSubscriber(int numberOfSubscriber){this.numberOfSubscriber = numberOfSubscriber;}
	void setWaterTime(int waterTime){this.waterTime = waterTime;}
	void setIsMonitized(String isMonitized){this.isMonitized = isMonitized;}
	void setEstimatedRevenue(String estimatedRevenue){this.estimatedRevenue = estimatedRevenue;}

	// Getter Methods

	int getNumberOfSubscriber(){return this.numberOfSubscriber;}
	int getWaterTime(){return this.waterTime;}
	String getIsMonitized(){return this.isMonitized;}
	String getEstimatedRevenue(){return this.estimatedRevenue;}

	//Display() Method
	void display()
	{
		super.display();
		System.out.println("Number Of Subscriber: " + this.numberOfSubscriber);
		System.out.println("Water Time: " + this.waterTime);
		System.out.println("Is Monitized: " + this.isMonitized);
		System.out.println("Estimated Revenue: " + this.estimatedRevenue);
	}

} // Youtube class ends here


class TestSocialMediaAccount
{

public static void main(String[] args)
{
	
	System.out.println("\n");
	SocialMediaAccount sma1 = new SocialMediaAccount();
	sma1.display();
	System.out.println("\n");

	System.out.println("\n");
	InstagramAccount ia1 = new InstagramAccount();
	ia1.display();
	System.out.println("\n");

	System.out.println("\n");
	LinkedIn li1 = new LinkedIn();
	li1.display();
	System.out.println("\n");
	
	System.out.println("\n");
	Youtube y1 = new Youtube();
	y1.display();
	System.out.println("\n");

}

} // TestSocialMediaAccount class ends here


	

