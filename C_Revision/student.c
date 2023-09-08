#include <stdio.h>
#include <string.h>

struct student
{
    int age;
    int dob;
    char name;
    char fave_char;
};
int main(){

    struct student sarthak, aashna, paridhi;
    sarthak.age = 19;
    sarthak.dob = 27;
    aashna.age = 19;
    aashna.dob = 9;
    paridhi.age = 19;
    paridhi.dob = 27;
        printf("Sarthak's age is %d", sarthak.age);


}
