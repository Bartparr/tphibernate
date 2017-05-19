/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.formation.hibernate.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author ib
 */

@ManagedBean
@SessionScoped
public class UserManaged {
    
    public void save(){
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            // Début de la transaction
            Transaction t = s.beginTransaction();
            
            User e = new User();
            e.setName("ddd");
            e.setPrenom("sd");
            // Enregistrement de l'event
       
            s.save(e);
            // Fin de la transaction
            t.commit();
           
            // Fermeture de la session Hibernate
            s.close();
    }
}
