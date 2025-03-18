/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Project;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import java.util.List;

/**
 *
 * @author lopez
 */
public interface IAdminService {
    
    public List<Company> getAllCompanies();
    public List<Student> getAllStudents();
    public List<Project> getAllProjects();
    public List<Coordinator> getAllCoordinators();
    public boolean aceptarCoordinador(String codeCoordinator);
    public boolean eliminarCoodinador(String codeCoordinator);
    
}
