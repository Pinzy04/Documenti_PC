#include <stdio.h>

main()

{
    int B,b,h;

    printf("Inserire la base maggiore: ");

    scanf("%d",&B);

    printf("Inserire la base minore: ");

    scanf("%d",&b);

    printf("Inserire l'altezza: ");

    scanf("%d",&h);

    printf("\narea trapezio e' uguale a: %d \n",((B+b)*h)/2);
}
