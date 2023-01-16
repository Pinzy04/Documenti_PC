class Main {
  public static void main(String[] args) {
    int i, j, max, min, cont = 0, app = 0;
    int vet[] = new int[10];
    int vet1[] = new int[10];
    int vet2[] = new int[10];
    for (i = 0; i < 10; i++) {
      vet[i] = (int) ((Math.random() * 41) - 20);

    }

    System.out.println();
    System.out.println("Punto 0");
    for (i = 0; i < 10; i++) {
      System.out.print(vet[i] + " ");
    }

    System.out.println();
    System.out.println("Punto 1");
    for (i = 0; i < 10; i++) {
      if (vet[i] > -10 && vet[i] < 10) {
        System.out.print(vet[i] + " ");
      }
    }

    System.out.println();
    System.out.println("Punto 2");
    for (i = 0; i < 10; i++) {
      if (vet[i] < 0) {
        System.out.print(vet[i] + " ");
      }
    }

    min = vet[0];
    max = vet[0];
    System.out.println();
    System.out.println("Punto 3");
    for (i = 1; i < 10; i++) {
      if (vet[i] > max) {
        max = vet[i];
      }
      if (vet[i] < min) {
        min = vet[i];
      }

    }
    System.out.println("Massimo " + max);
    System.out.println("Minimo " + min);

    for (i = 0; i < 10; i++) {
      if (vet[i] > 0) {
        vet1[cont] = vet[i];
        cont++;
      }
    }

    if (cont != 0) {
      System.out.println("Punto 4");
      for (i = 0; i < 10; i++) {
        for (j = i + 1; j < 10; j++) {
          if (vet1[j] < vet1[i]) {
            app = vet1[i];
            vet1[i] = vet1[j];
            vet1[j] = app;
          }
        }
      }
    } else {
      System.out.println("non ci sono numeri positivi");
    }

    for (i = 0; i < 10; i++) {
      if (vet1[i] != 0)
        System.out.print(vet1[i] + " ");
    }

    System.out.println();
    System.out.println("Punto 5");

    j=9;
    for(i=0;i<10;i++){
        vet2[j]=vet[i];
        j--;
    }
    for(i=0;i<10;i++){
      System.out.print(vet2[i] + " ");
    }
  }
}