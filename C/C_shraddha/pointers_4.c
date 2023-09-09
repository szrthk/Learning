#include <stdio.h>
int main () {
    int *ptr;           // here we took ptr and x as variables.
    int x;                  

    ptr = &x;           // here we have defined the value of ptr =  value of x
    *ptr  = 0;          // here we have defined the value of *ptr =  0;
                        // indirectly we have stored 0 as the value of X

    printf(" x = %d\n",x );
    printf(" *ptr = %d\n", *ptr);

        *ptr += 5;
            printf(" x = %d\n", x);
            printf(" *ptr = %d\n", *ptr);

                (*ptr)++;
                    printf(" x = %d\n", x);
                    printf(" *ptr = %d\n", *ptr);

    return 0;
}