/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import java.util.List;

/**
 *
 * @author lopez
 */
public interface ICoordinatorRepository {
    boolean save(Coordinator newCoordinator);
    void initializeDatabase();
    List<Coordinator> listAll();
    Coordinator Search(String id);
}
