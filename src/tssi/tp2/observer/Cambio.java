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
public class Cambio {

    private String cambio;
    private String valueOld;
    private String valueNew;

    public Cambio(String cambio, String valueOld, String valueNew) {
        this.cambio = cambio;
        this.valueOld = valueOld;
        this.valueNew = valueNew;
    }

    public String getCambio() {
        return cambio;
    }

    public String getValueOld() {
        return valueOld;
    }

    public String getValueNew() {
        return valueNew;
    }

    @Override
    public String toString() {
        return "Campo: " + cambio + " - Valor Anterior: " + valueOld + " - Valor Actual: " + valueNew;
    }
}
