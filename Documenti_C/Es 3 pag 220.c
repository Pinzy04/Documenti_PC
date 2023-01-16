#include <stdio.h>

main()

{
    int ndiviso,n;
    printf("inserire un numero: ");
    scanf("%d",&n);
    ndiviso = (int) n / 2;
    ndiviso = ndiviso * 2;

    if (n == ndiviso)
        printf("%d",n);
}
