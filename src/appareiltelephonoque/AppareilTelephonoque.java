/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appareiltelephonoque;

import iInterface.IAppareil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.Appareil;
import models.Appel;
import models.AppelEmis;11
import models.AppelRecu;
import models.Contact;



/**
 *
 * @author samnd
 */
public class AppareilTelephonoque {

    /**
     * @param args the command line arguments
     */
    public static List<Contact> main(String[] args) {
      IAppareil appareil = new Appareil();
      appareil.enregistrer(new Contact(1, "C1", "0650778845"));
      appareil.enregistrer(new Contact(2, "C2", "0750778845"));
      appareil.enregistrer(new Contact(3, "C3", "0650778800"));
      
      appareil.enregistrer(new AppelEmis(1, new Date(), 66), "0650778845");
      appareil.enregistrer(new AppelEmis(2, new Date(), 125), "0650778845");
      appareil.enregistrer(new AppelEmis(3, new Date(), 122), "0650778845");
      appareil.enregistrer(new AppelRecu(4, new Date(), 98), "0650778845");
        System.out.println("---------------------------");
        System.out.println("Consulter un appel sachant son numéro");
        try {
            Contact c = appareil.consulter(1);
            System.out.println("Num :"+ c.getNumeroConatct());
            System.out.println("Nom :"+ c.getNom());
            System.out.println("Tel :"+ c.getNumeroTel());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
         System.out.println("---------------------------");
        System.out.println("Consulter un contact dont le nom con,tient le mot clé");
        List<Contact> contacts  = appareil.consulter("C");
        for (Contact contact : contacts){ 
            System.out.println("***********************");
            System.out.println("Nom:)"+ contact.getNom());
            System.out.println("Tel:)"+ contact.getNumeroTel());
        
    }
    
}
}
