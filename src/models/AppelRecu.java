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
public class AppelRecu extends Appel {

    public AppelRecu(int numeroAppel, Date dateAppel, double dureeAppel) {
        super(numeroAppel, dateAppel, dureeAppel);
    }

    @Override
    public double cout() {
        return 0;
    }
    
}
