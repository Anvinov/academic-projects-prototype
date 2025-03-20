/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import State.Coordinator.RechazadoCoordi;
import State.Coordinator.VerificadoCoordi;
import State.ICoordinatorState;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Admin;
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

    private CompanyService companyService;
    private StudentService studentService;
    private ProjectService projectService;
    private CoordinatorService coordinatorService;
    private ICoordinatorState estado;
    private static AdminService instance;

    public AdminService() {
        this.companyService = CompanyService.getInstance(null);
        this.studentService = StudentService.getInstance(null);
        this.projectService = ProjectService.getInstance(null);
        this.coordinatorService = CoordinatorService.getInstance(null);
    }

    public static AdminService getInstance() {
        if (instance == null) {
            instance = new AdminService();
        }
        return instance;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentService.listAll();
    }

    @Override
    public List<Project> getAllProjects() {
        //return ProjectService.listProject();
        return null;
    }

    @Override
    public List<Coordinator> getAllCoordinators() {
        return coordinatorService.listAll();
    }

    @Override
    public boolean aceptarCoordinador(Coordinator coordi) {
        if (coordi != null) {
            System.out.println("Te vamos a pasar el estado de " + coordi.getEstado());
            coordi.setEstado(coordi.getEstado().verificar()); // Aquí sí se cambia el estado
            System.out.println("Nuevo estado: " + coordi.getEstado());
            return true;
        }
        return false;
    }

    @Override
    public boolean rechazarCoodinador(Coordinator coordi) {
        if (coordi != null) {
            System.out.println("Te vamos a pasar el estado de " + coordi.getEstado());
            coordi.setEstado(coordi.getEstado().rechazar()); // Aquí sí se cambia el estado
            System.out.println("Nuevo estado: " + coordi.getEstado());
            return true;
        }
        return false;

    }
}
