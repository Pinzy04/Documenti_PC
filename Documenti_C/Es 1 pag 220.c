#include <stdio.h>

main()

{
    int eta;
    printf("inserire l'eta': ");
    scanf("%d",&eta);

    if (eta < 18)
        printf("\nsei minorenne\n");
    else
        printf("\nsei maggiorenne\n");
}
