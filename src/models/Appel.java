/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author samnd
 */
public abstract class Appel {
    protected int numeroAppel;
    protected Date dateAppel;
    protected double dureeAppel;
    protected Contact contact;
    
    public abstract double cout();

    public int getNumeroAppel() {
        return numeroAppel;
    }

    public void setNumeroAppel(int numeroAppel) {
        this.numeroAppel = numeroAppel;
    }

    public Date getDateAppel() {
        return dateAppel;
    }

    public void setDateAppel(Date dateAppel) {
        this.dateAppel = dateAppel;
    }

    public double getDureeAppel() {
        return dureeAppel;
    }

    public void setDureeAppel(double dureeAppel) {
        this.dureeAppel = dureeAppel;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Appel(int numeroAppel, Date dateAppel, double dureeAppel) {
        this.numeroAppel = numeroAppel;
        this.dateAppel = dateAppel;
        this.dureeAppel = dureeAppel;
    }
    
}
