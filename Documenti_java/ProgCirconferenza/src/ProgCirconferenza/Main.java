package ProgCirconferenza;

public class Main {

    public static void main(String[] args) {
        int i, j, x, y, cont = 0;

        Cerchio circonferenze[] = new Cerchio[10];

        for(i = 0; i < 10; i++){
            circonferenze[i] = new Cerchio();
            System.out.println(circonferenze[i].toString());
        }

        for(i = 0; i < 10; i++){

            for(j = 0; j < 10; j++){
                x = (circonferenze[i].getX() - circonferenze[j].getX()) * (circonferenze[i].getX() - circonferenze[j].getX());
                y = (circonferenze[i].getY() - circonferenze[j].getY()) * (circonferenze[i].getY() - circonferenze[j].getY());
                if(Math.sqrt(x + y) > circonferenze[i].getRaggio() + circonferenze[j].getRaggio()){
                    cont++;
                }
            }

            if(cont == 9){
                System.out.println("La circonferenza " + i + " non interseca con nessuna");
            }
            cont = 0;
        }
    }
}
