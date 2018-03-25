/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp2.observer;

/**
 *
 * @author TechMDQ
 */
public class TSSITP2Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mecanico m = new Mecanico();
        Auto a1 = new Auto(15, "Pepe");
        Auto a2 = new Auto(21, "Paco");
        a1.addObserver(m);
        a2.addObserver(m);
        a1.setConductor("Juan");
        a1.setAireNeumatico(0);
        a2.setNivelAgua(0);
    }

}
