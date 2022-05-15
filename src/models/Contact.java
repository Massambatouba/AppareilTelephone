/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author samnd
 */
public class Contact {
    private int numeroConatct;
    private String nom;
    private String numeroTel;
    private Appel appel;
    private  Appareil appareil;

    public Contact(int numeroConatct, String nom, String numeroTel) {
        this.numeroConatct = numeroConatct;
        this.nom = nom;
        this.numeroTel = numeroTel;
    }

    public int getNumeroConatct() {
        return numeroConatct;
    }

    public void setNumeroConatct(int numeroConatct) {
        this.numeroConatct = numeroConatct;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public Appel getAppel() {
        return appel;
    }

    public void setAppel(Appel appel) {
        this.appel = appel;
    }

    public Appareil getAppareil() {
        return appareil;
    }

    public void setAppareil(Appareil appareil) {
        this.appareil = appareil;
    }
    
}
