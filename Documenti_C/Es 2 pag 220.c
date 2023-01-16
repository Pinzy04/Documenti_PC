#include <stdio.h>

main()

{
    int t;
    printf("temperatura rilevata: ");
    scanf("%d",&t);

    if(t < 5)
        printf("danno irreparabile");
    else
        if((t >= 5)&&(t < 18))
            printf("pericolo");
        else
            printf("temperatura normale");
}
