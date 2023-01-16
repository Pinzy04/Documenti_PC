class Main {
  public static void main(String[] args) {
    int i, pos = 0, pari = 0, pospari = 0, div5 = 0, vet[],  somma = 0, max;
    vet = new int[10];

    for(i=0;i<10;i++)
    {
      vet[i] = (int)(Math.random()*41-20);
      System.out.println(vet[i]);
    }

    for(i=0;i<10;i++)
    {
      if(vet[i] > 0)
      {
        pos++;
        somma = somma + vet[i];
      }
      if(vet[i]%2==0)
      {
        pari++;

        if(i%2==0)
          pospari++;
      }
      if(vet[i]%5==0)
        div5++;
    }

    System.out.println("I numeri positivi sono " + pos);
    System.out.println("I numeri pari sono " + pari);
    System.out.println("I numeri pari in posizione pari sono " + pospari);
    System.out.println("La somma dei numeri positivi e' " + somma);
    System.out.println("I numeri divisibili 5 sono " + div5);

    max = vet[0];
    for(i=1;i<10;i++)
    {
      if(max < vet[i])
        max = vet[i];
    }
    System.out.println("Il numero massimo e' " + max);
  }
}