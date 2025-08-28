// Write a c program for Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations.

/*#include<stdio.h>
int main()
{
	int a,b;
	int addition, substraction, multiplication, division; 
	int modulo;
	
	printf("Enter the value of a:");
	scanf("%d", &a);
	
	printf("Enter the value of b:");
	scanf("%d", &b);
	
	addition=a+b;
	substraction=a-b;
	multiplication=a*b;
	division=a/b;
	modulo=a%b;
	
	printf("The addition is: %d \n", addition);
	printf("The substraction is:%d \n", substraction);
	printf("The multiplication is:%d \n", multiplication);
	printf("The division is:%d \n", division);
	printf("The modulo is:%d \n", modulo);
	 
}*/

#include<stdio.h>
int main()
{
	float a,b;
	char op;
	
	printf("Enter the value of a:");
	scanf("%f", &a);
	
	printf("Enter the value of b:");
	scanf("%f", &b);
	
	printf("Enter the operator:");
	scanf(" %c", &op);
	
	if(op=='+')
	{
		printf("Addition: %f \n", a+b);
	}
	else
	{
		if(op=='-')
		{
			printf("Substraction: %f \n", a-b);
		}
		else
		{
			if(op=='*')
			{
				printf("Multiplacation: %f", a*b);
			}
			else
			{
				if(op=='/')
				{
					if(b !=0)
					{
						printf("Division: %f", a/b);
					}
					else
					{
						printf("Error: Division by 0 is not allowed");
					}
			}
				else
				{
				
					if(op=='%')
					{
						if((int)b !=0)
						{
							printf("Modulo: %d", (int)a % (int)b);
						}
						else
						{
							printf("Error: Modulo by 0 is not allowed");
						}
					}
						else
						{
							printf("Invalid Operator");
						}
					}
				
				}
			}
		}
	}

