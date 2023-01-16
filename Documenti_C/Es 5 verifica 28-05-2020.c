#include <stdio.h>
#include <stdlib.h>

main()

{
    int a,b,c;                               //a=numero precedente b=numero intero c=numero successivo
    printf("inserisci un numero: ");
    scanf("%d",b);
    a = b-1;
    c = b+1;
    printf("\nnumero precedente: %d",a);
    printf("\nnumero successivo: %d",c);
}
