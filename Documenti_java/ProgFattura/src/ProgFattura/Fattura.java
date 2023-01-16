package ProgFattura;

public class Fattura {
    private Cliente cliente;
    private int numeroProdotti;

    Fattura(Cliente cliente){
        this.cliente = cliente;
    }

    Fattura(int numeroProdotti){
        this.numeroProdotti = numeroProdotti;
    }

    Fattura(Cliente cliente,int numeroProdotti){
        this.cliente = cliente;
        this.numeroProdotti = numeroProdotti;
    }

    @Override
    public String toString() {
        return "Fattura{" + "Cliente=" + cliente.toString() + ", Numero prodotti='" + numeroProdotti + '\'' + '}';
    }
}
