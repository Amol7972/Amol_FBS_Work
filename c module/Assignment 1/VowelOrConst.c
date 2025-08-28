// Write a C program to check whether the given character is a vowel or consonant.

#include<stdio.h>
int main()
{
	char ch;
	
	printf("Enter the character:");
	scanf("%c", &ch);
	
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	{
		printf("This is a Vowel");
	}
	else
	{
		printf("This is a Consonant");
	}
}