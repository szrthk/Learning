#include <stdio.h>
int sum (int a, int b){
    return a + b;           // here we have declared 2 variables a and b and the sys will return a + b
}
int main () {
        
        int a, b, c;    // here we have taken 3 variables and assigned them a value sum will use the above func and give ans
        a = 2;
        b = 4;
        c = sum(a , b);
            printf("The sum is : %d\n", c);
    return 0;
}