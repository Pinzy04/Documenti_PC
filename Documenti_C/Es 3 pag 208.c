#include <stdio.h>

main()

{
    float e,l,d;
    l=7.54;
    d=1.08;

    printf("Euro: ");
    scanf("%f",&e);
    printf("Lire: %.2f\n",e*l);
    printf("Dollari: %.2f",e*d);
}
