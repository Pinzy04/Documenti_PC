package ProgSuperBenza;

public class Pompa {
    private int benzina;
    private int diesel;
    private int metano;
    Pompa(int benzina, int diesel, int metano){
        this.benzina = benzina;
        this.diesel = diesel;
        this.metano = metano;
    }
    public void erogazione(int tipoCarburante, int quantita){
        if(tipoCarburante == 1){
            if(benzina<quantita){
                System.out.println("Non c'è abbastanza benzina in questa pompa.");
            }
            else{
                benzina = benzina - quantita;
            }
        }

        if(tipoCarburante == 2){
            if(diesel<quantita){
                System.out.println("Non c'è abbastanza diesel in questa pompa.");
            }
            else{
                diesel = diesel - quantita;
            }
        }

        if(tipoCarburante == 3){
            if(metano<quantita){
                System.out.println("Non c'è abbastanza metano in questa pompa.");
            }
            else{
                metano = metano - quantita;
            }
        }
    }
}
