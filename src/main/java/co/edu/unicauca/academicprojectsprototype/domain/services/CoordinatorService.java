/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import State.ICoordinatorState;
import co.edu.unicauca.academicprojectsprototype.access.ICoordinatorRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import java.util.List;
import observer.Subject;

/**
 *
 * @author anvig
 */
public class CoordinatorService extends Subject implements ICoordinatorService {

    private static CoordinatorService instance;
    private ICoordinatorRepository repository;

    private CoordinatorService(ICoordinatorRepository repository) {
        this.repository = repository;
    }

    public static CoordinatorService getInstance(ICoordinatorRepository repository) {
        if (instance == null) {
            instance = new CoordinatorService(repository);
        }
        return instance;
    }

    public void SetStudentRepository(ICoordinatorRepository repository) {
        this.repository = repository;
    }

    public void SetCoordinatorService(ICoordinatorRepository repository) {
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

        public void actualizarEstadoCoordinador(String code, ICoordinatorState nuevoEstado) {
        Coordinator coordi = this.Search(code);
        
        if (coordi != null) {
            coordi.setEstado(nuevoEstado); // Cambia el estado en el objeto
            repository.actualizarEstado(code, nuevoEstado); // Actualiza en la base de datos
            System.out.println("Estado actualizado a: " + nuevoEstado);
            notifyObservers();
        } else {
            System.out.println("Coordinador no encontrado.");
        }
    }
}
