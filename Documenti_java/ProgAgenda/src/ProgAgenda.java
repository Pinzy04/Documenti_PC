/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daniele
 */
public class ProgAgenda {
    public static void main(String argv[])
    {
        ScriviAgenda a =new ScriviAgenda();
        a.scrivi();
        System.out.println("scritto nel file... ora leggo da file...");
        LeggiAgenda b=new LeggiAgenda();
        b.leggeToken();
    }
    
}
