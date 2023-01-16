package progauto;

public class Macchina {
    private int velocita;
    private int marcia;
    private int marciaMassima;
    private String nome;
    
    public Auto (String nome) {
        this.velocita = 0;
        this.marcia = 1;
        this.marciamassima = 7;
        this.nome = nome;
    }
    
    public void setVelocita (int velocita) {
        this.velocita = velocita;
    }
    
    public void setMarcia (int marcia) {
        this.marcia = marcia;
    }
        
    public void setMarciaMassima (int marciaMassima) {
        this.marciaMassima = marciaMassima;
    }
        
    public void setVelocita (String nome) {
        this.nome = nome;
    }
    
    public int getVelocita() {
        return velocita;
    }
   
    public String getNome() {
        return nome;
    }
 
    public int getMarcia() {
        return marcia;
    }
    
    public int getMarciaMassima() {
        return marciaMassima;
    }
   
    public void aggiungiMarcia (int marcia) {
        this.marcia + 1;
    }
    
    public void sottraiMarcia (int marcia) {
        this.marcia - 1;
    }
}