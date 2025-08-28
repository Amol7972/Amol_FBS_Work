// Find sum of first and last digit of given number
// Input: n=12345
// Output: 6(1+5)

#include <stdio.h>

int main()
{
    int n, first, last;

    printf("Enter a number: ");
    scanf("%d", &n);

    last = n % 10;

    
    while (n >= 10)
	{
        n = n / 10;
    }
    first = n;
    
    printf("Sum = %d",first + last);

}