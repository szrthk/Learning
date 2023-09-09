#include <stdio.h> 
int takenumber (){
int i;
printf("Enter the number: ");
scanf("%d", &i);
return i;
}

int main(){
    int a;
    
    a = takenumber();
    printf("The number entered is : %d", a);
    

    return 0;
}