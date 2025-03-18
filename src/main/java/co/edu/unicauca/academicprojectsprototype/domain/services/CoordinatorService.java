/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import co.edu.unicauca.academicprojectsprototype.access.ICoordinatorRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import java.util.List;

/**
 *
 * @author anvig
 */
public class CoordinatorService implements ICoordinatorService{

    private ICoordinatorRepository repository;
    
     public CoordinatorService(ICoordinatorRepository repository) {
        this.repository = repository;
     }
    
    @Override
    public boolean save(Coordinator newCoordinator) {
        return repository.save(newCoordinator);
    }

    @Override
    public List<Coordinator> listAll() {
        return repository.listAll();
    }

    @Override
    public Coordinator Search(String id) {
        return repository.Search(id);
    }
    
}
