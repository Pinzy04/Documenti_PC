#include <stdio.h>
#include <stdlib.h>

main()

{
    int a;                      //a=anni
    printf("anni: ");
    scanf("%d",a);

    if (a<=10) || (a>=65)          //se anni<=10 o anni>=65 dire che l'ingresso è gratuito
        printf("ingresso gratuito");
    else
        if (a>10)&&(a<=18)
            printf("paghi 5 euro per l'ingresso");
        else
            printf("paghi 10 euro per l'ingresso");
}
