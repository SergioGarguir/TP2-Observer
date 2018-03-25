/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp2.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author TechMDQ
 */
public class Mecanico implements Observer {

    @Override
    public void update(Observable o, Object args) {
        System.out.println("Algo ha cambiado");
        if (args != null) {
            System.out.println(((Cambio) args).toString());
        }
        if (o instanceof Auto) {
            System.out.println(((Auto) o).toString());
            System.out.println("");
        }
    }
}
