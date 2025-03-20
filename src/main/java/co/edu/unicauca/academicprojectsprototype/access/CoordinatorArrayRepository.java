/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import State.ICoordinatorState;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anvig
 */
public class CoordinatorArrayRepository implements ICoordinatorRepository {

    private final List<Coordinator> coordinators;

    /**
     * Constructor que inicializa la lista de proyectos.
     */
    public CoordinatorArrayRepository() {
        this.coordinators = new ArrayList<>();
    }

    @Override
    public void initializeDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean save(Coordinator newCoordinator) {
        if (newCoordinator != null) {
            coordinators.add(newCoordinator);
            System.out.println("Coordinador creado correctamente");
            return true;
        }
        return false;
    }

    @Override
    public List<Coordinator> listAll() {
        return new ArrayList<>(coordinators);
    }

    @Override
    public Coordinator Search(String id) {
        for (Coordinator coordinator : coordinators) {
            if (coordinator.getCode().equalsIgnoreCase(id)) {
                return coordinator;
            }
        }
        return null;
    }

    @Override
    public boolean actualizarEstado(String code, ICoordinatorState nuevoEstado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
