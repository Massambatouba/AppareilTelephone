/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iInterface;

import java.util.Date;
import java.util.List;
import models.Appel;
import models.Contact;

/**
 *
 * @author samnd
 */
public interface IAppareil {
    public void enregistrer(Contact c);
    public void enregistrer(Appel appel, String numeroTel);
    public Contact consulter(int numeroContact) throws Exception;
    public List<Contact> consulter(String mc);
    public double coutTotalAppels();
    public double coutAppel(Date d1, Date d2);
    public double coutAppels(String numeroTel);
    
}
