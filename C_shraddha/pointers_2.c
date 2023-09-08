# include <stdio.h>

int main() {

int age = 13;
int *ptr =  &age;
int _blah = *ptr;

    printf("%d", _blah);
    return 0;
}