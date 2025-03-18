/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import co.edu.unicauca.academicprojectsprototype.access.ICompanyRepository;
import co.edu.unicauca.academicprojectsprototype.access.ICoordinatorRepository;
import co.edu.unicauca.academicprojectsprototype.access.IProjectRepository;
import co.edu.unicauca.academicprojectsprototype.access.IStudentRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Project;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import java.util.List;

/**
 *
 * @author anvig
 */
public class AdminService implements IAdminService {

    private ICompanyRepository CompanyRepository;
    private IStudentRepository studentRepository;
    private IProjectRepository projectRepository;
    private ICoordinatorRepository coordiRepository;

    @Override
    public List<Company> getAllCompanies() {
        return CompanyRepository.listAll();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.listAll();
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.getProjects();
    }

    @Override
    public List<Coordinator> getAllCoordinators() {
        return coordiRepository.listAll();
    }

    @Override
    public boolean aceptarCoordinador(String codeCoordinator) {
        if (coordiRepository.Search(codeCoordinator) != null) {
            Coordinator coordi = coordiRepository.Search(codeCoordinator);
            coordi.setEstado("Aceptado");
            System.out.println("El coordinador ha sido aceptado por el admin");
            return true;
        }
        System.out.println("El coordinador NO sido aceptado por el admin");
        return false;
    }

    @Override
    public boolean eliminarCoodinador(String codeCoordinator) {
        if (coordiRepository.Search(codeCoordinator) != null) {
            Coordinator coordi = coordiRepository.Search(codeCoordinator);
            coordi.setEstado("Eliminado");
            System.out.println("El coordinador ha sido eliminado por el admin");
            return true;
        }
        System.out.println("Error al borrar el coordinador");
        return false;
    }

}
