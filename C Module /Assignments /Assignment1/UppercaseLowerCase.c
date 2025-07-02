// Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>
void main()
{
	char ch;
	
	printf("Please enter a character");
	scanf("%c", &ch);
	
	if(ch>='a' || ch>='z')
	{
		printf("This is a lowercase character");
	}
	else
	{
		printf("This is a uppercase character");
	}
}