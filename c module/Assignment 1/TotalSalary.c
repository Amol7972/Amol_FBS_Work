// Write a C program to calculating total salary based on basic. If basic <=5000 da,ta and hra will be 10%, 20% and 25% respectively, Otherwise da, ta, hra will be 15%, 25%, 30% respectively.

#include<stdio.h>
int main()
{
	double total_salary, basic_salary;
	double da,ta,hra;
	
	printf("Enter the basic salary:");
	scanf("%lf", &basic_salary);
	
	if(basic_salary<=5000)
	{
		da=basic_salary*0.10;
		ta=basic_salary*0.20;
		hra=basic_salary*0.25;
	}
	else
	{
		da=basic_salary*0.15;
		ta=basic_salary*0.25;
		hra=basic_salary*0.30;
	}
	
	total_salary=basic_salary+da+ta+hra;
	
	printf("The total salary is: %lf", total_salary);
	
}