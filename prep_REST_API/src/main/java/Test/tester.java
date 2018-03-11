/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Facade.FacadePet;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Oliver
 */
public class tester {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "PU" );
        System.out.println("daksdas");
        FacadePet fp = new FacadePet(emf);
        
        System.out.println(fp.findAllPets().toString());
        
    }
    
}
