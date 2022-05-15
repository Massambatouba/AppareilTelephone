/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import iInterface.IAppareil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author samnd
 */
public class Appareil implements IAppareil {
    private List<Contact> contacts = new ArrayList<>();
    private Map<Integer, Appel> appels  = new HashMap<Integer, Appel>();

    @Override
    public void enregistrer(Contact c) {
        contacts.add(c);
    }

    @Override
    public void enregistrer(Appel appel, String numAppel) {
        Contact c = null;
        for (Contact contact : contacts) {
            if(contact.getNumeroTel().equals(numAppel)){
                c = contact;
                break;
                
            }
          appel.setContact(c);
          appels.put(appel.getNumeroAppel(), appel);
            
            
        }
    }

//    @Override
//    public void consulter() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public Contact consulter(int numeroContact) throws Exception {
        for (Contact contact : contacts) {
            if(contact.getNumeroConatct() == numeroContact)
                return contact;
        }
            throw new Exception("Contact"+ numeroContact+ "introuvable");
                
            
            
        
        
    }

    @Override
    public List<Contact> consulter(String mc) {
        List<Contact> cts = new ArrayList<>();
        for (Contact ct : cts) {
            if(ct.getNom().contains(mc))
                cts.add(ct);
        }
        return cts;
    }

    @Override
    public double coutTotalAppels() {
       double total = 0;
        for (Appel appel : appels.values()) {
            total = total + appel.cout();
            
        }
        return total;
    }

    @Override
    public double coutAppel(Date d1, Date d2) {
        double total = 0;
        for (Appel appel : appels.values()) {
            if(appel.getDateAppel().getTime()>=d1.getTime() && 
                    appel.getDateAppel().getTime() <=d2.getTime() )
                total = total + appel.cout();
            
        }
       return total;
    }

    @Override
    public double coutAppels(String numeroTel) {
        double total = 0;
        for (Appel appel : appels.values()) {
            if(appel.getContact().getNumeroTel().equals(numeroTel))
                
            total = total + appel.cout();
        }
       
            
        
       return 0;
    }

   
    
  
    
    
}
