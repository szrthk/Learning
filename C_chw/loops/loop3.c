#include <stdio.h>

int main() // while loop
{

    int num, i;
    printf("Enter number: ");
    scanf("%d", &i);

    while (i < 30)
    {
        printf("%d\n", i);
        i = i + 1;
    }

    return 0;
}