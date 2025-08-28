// Write a C program to check whether the given character is upper case or lower case.

#include<stdio.h>
int main()
{
	char ch;
	
	printf("Enter the character:");
	scanf("%c", &ch);
	
	if(ch>='A' && ch<='Z')
	{
		printf("This is a Upper Case character");
	}
	else
	{
		printf("This is a Lower Case character");
	}
}