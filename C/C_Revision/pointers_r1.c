#include <stdio.h> 
 int main () {

    printf("Pointers\n");
    int a = 27;
    int *ptr = &a;
    int **pptr = ptr;
    int **pptra = pptr; 
        printf("Value of pptra is %c\n", pptr);



    return 0;
}