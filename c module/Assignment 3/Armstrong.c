// Write a C program for Check the given number is Armstrong number or not.
// Input: n=153
// Output: Armstrong

#include <stdio.h>

int main()
{
    int n, original, remainder, result = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    original = n;

    while (n > 0)
	{
        remainder = n % 10;
        result = result + remainder * remainder * remainder;
        n = n / 10;
    }

    if (result == original)
        printf("Armstrong\n");
    else
        printf("Not Armstrong\n");

}