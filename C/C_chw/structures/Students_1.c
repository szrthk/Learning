#include <stdio.h>
#include <string.h>

struct Students_1
{
    int id;
    int marks;
    char fave_char;
    char name[34];
};

int main()
{

    struct Students_1 Sarthak, Aashna, Paridhi;
    Sarthak.id = 1;
    Aashna.id = 2;
    Paridhi.id = 3;
    Sarthak.marks = 200;
    Aashna.marks = 300;
    Paridhi.marks = 400;
    Sarthak.fave_char = 'p';
    Aashna.fave_char = 'p';
    Paridhi.fave_char = 'p';
    strcpy(Sarthak.name, "Sarthak Sagar student of the year"); // strcpy copied the text in semicoln in sarthaj.name

    printf("Sarthak got %d marks\n", Sarthak.marks); // the warning was generated because i used %d instead of %f
    printf("Sarthak's name is: %s\n", Sarthak.name);

    return 0;
}
