/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp2.observer;

import java.util.Observable;

/**
 *
 * @author TechMDQ
 */
public class Auto extends Observable {

    private int autoNro;
    private String conductor;
    private int nivelAceite;
    private int nivelAgua;
    private int aireNeumatico;

    public Auto(int autoNro, String conductor) {
        this.autoNro = autoNro;
        this.conductor = conductor;
        this.nivelAceite = 100;
        this.nivelAgua = 100;
        this.aireNeumatico = 30;
    }

    public int getAutoNro() {
        return this.autoNro;
    }

    public String getConductor() {
        return this.conductor;
    }

    public int getNivelAceite() {
        return this.nivelAceite;
    }

    public int getNivelAgua() {
        return this.nivelAgua;
    }

    public int getAireNeumatico() {
        return this.aireNeumatico;
    }

    public void setConductor(String conductor) {
        String oldConductor = this.conductor;
        this.conductor = conductor;
        setChanged();
        notifyObservers(new Cambio("Conductor", oldConductor, this.conductor));
    }

    public void setNivelAceite(int nivelAceite) {
        int oldNivelAceite = this.nivelAceite;
        this.nivelAceite = nivelAceite;
        setChanged();
        notifyObservers(new Cambio("Nivel de Aceite", String.valueOf(oldNivelAceite), String.valueOf(this.nivelAceite)));
    }

    public void setNivelAgua(int nivelAgua) {
        int oldNivelAgua = this.nivelAgua;
        this.nivelAgua = nivelAgua;
        setChanged();
        notifyObservers(new Cambio("Nivel de Agua", String.valueOf(oldNivelAgua), String.valueOf(this.nivelAgua)));
    }

    public void setAireNeumatico(int aireNeumatico) {
        int oldAireNeumatico = this.aireNeumatico;
        this.aireNeumatico = aireNeumatico;
        setChanged();
        notifyObservers(new Cambio("Aire Neumatico", String.valueOf(oldAireNeumatico), String.valueOf(this.aireNeumatico)));
    }

    @Override
    public String toString() {
        return "Auto Nro: " + this.autoNro + " - Conductor: " + this.conductor + " - Nivel de Aceite: " + this.nivelAceite + " - Nivel de Agua: " + this.nivelAgua + " - Aire Neumaticos:  " + this.aireNeumatico;
    }
}
