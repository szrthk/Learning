#include <stdio.h>

int sum (int a, int b);

int takenumber(){
    int i;
    printf("Enter the number: ");
    scanf("%d",&i);
    return i;
}
    int main() {
        int a;
        a = takenumber();
        printf("The number is: %d\n", a);
        return 0;
    }
    