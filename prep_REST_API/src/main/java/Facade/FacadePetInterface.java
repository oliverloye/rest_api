/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Pet;
import java.util.List;

/**
 *
 * @author Oliver
 */
public interface FacadePetInterface {
    
    public List<Pet> findAllPets();
    
    
}
