/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Pet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author Oliver
 */
public class FacadePet implements FacadePetInterface {

    private EntityManagerFactory emf;

    public FacadePet(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Pet> findAllPets() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Pet.findAll");
        List<Pet> allPets = query.getResultList();
        return allPets;
    }

}
