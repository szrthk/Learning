#include <stdio.h>

#include <string.h>

struct stud
{
    int age;
    int name;
};
    int main(){

        struct stud sarthak, teju, nitin;
        sarthak.age = 29;
        sarthak.name = 'sunny';
        teju.age = 22;
        teju.name = "tej";
        nitin.age = 20;
        nitin.name = 'kallu';

            printf("Name of teju is: %c", teju.name);

    }