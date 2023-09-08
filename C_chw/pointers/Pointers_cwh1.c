#include <stdio.h>
int main() {

    printf("Lets learn pointers\n");
    int a = 27;
    int *ptr = &a;
    int **pptr = ptr;
    int **pptra = pptr;


    printf("The address of a is : %d\n", &ptr);
    printf("The value of a is : %d\n", *ptr);
    printf("The value of a **pptr: %d\n", ptr);
    printf("The value of a **pptra %d\n", *pptr);

    return 0;
}