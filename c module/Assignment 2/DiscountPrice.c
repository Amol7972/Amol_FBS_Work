// Accept the price from user. Ask the user if he is a student (user may say y or n).
// If he is a student and he has purchased more than 500 than discount is 20% otherwise
// discount is 10%.But if he is not a student then if he has purchased more than 600
// discount is 15% otherwise there is not discount.

#include<stdio.h>
int main()
{
	float price, discount=0.0, final_price;
	char is_student;
	
	printf("Enter the purchase amount:");
	scanf("%f", &price);
	
	printf("Are you a Student?");
	scanf(" %c", &is_student);
	
	if(is_student =='y' || is_student =='Y')
	{
		if(price>500)
			discount=0.20*price;		// final_price=price-price*0.20
		else
			discount=0.10*price;		// final_price=price-price*0.10
	}
	else
	{
		if(price>600)
			discount=0.15*price;		// final_price=price-price*0.15
		else
			printf("No discount");
	}
	
	final_price=price-discount;
	
	printf("Discount Applied: %f \n", discount);
	printf("Final Price: %f \n", final_price);
	
	
}