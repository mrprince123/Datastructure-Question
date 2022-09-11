#include <stdio.h>

int main() {

    // array declaration
    int rollNo[10];

    // taking input
    for(int i = 0; i<10; i++)
    scanf(" Enter 10 Number : 1%d", &rollNo[i]);

    // printing
    for(int i = 0; i<10; i++)
    printf("%d", rollNo[i]);
    
    return  0;
}

// To which number is not repeated twice.
// #include <stdio.h>

// int main(){

//     int arr[] = {1, 2, 3, 2, 3 ,1, 4, 5, 5, 6, 6};
//     // bitwise opertor = 0^0 = 0  ,1^1 = 0,  1^0 = 1

//     int res = 0;

//     for(int i = 0; i<11; i++){
//         res = res ^ arr[i];
//     }

//     printf("%d", res);
//     return 0;
// }