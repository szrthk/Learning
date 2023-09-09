#include <stdio.h> 
void square (int n);    // here we defined this as global variable
void _square (int* n);
int main () {
        int number = 4;
        
            square(number);
                printf("Number = %d\n", number);

                _square(&number);
                printf("number is %d", number);

    return 0;
}
        // call by value
        void square (int n) {

        n = n * n;
            printf("square is %d\n", n);
        }

        void _square (int* n) {
         *n = (*n) * (*n);
            printf("square is %d\n", *n);    
        }