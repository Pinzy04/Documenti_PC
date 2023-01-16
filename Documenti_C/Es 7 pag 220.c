#include <stdio.h>

main()

{
    float i,is;           //i = importo totale is = importo scontato

    printf("importo totale: ");
    scanf("%f",&i);
    is = i - ((i * 20) / 100);

    if (i >= 100)
        printf("\nimporto scontato, spesa totale: %.2f",is);
    else
        printf("\nimporto non scontato, spesa totale: %.2f",i);
}
