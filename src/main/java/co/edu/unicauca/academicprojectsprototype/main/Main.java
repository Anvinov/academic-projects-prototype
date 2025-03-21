/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.main;

import co.edu.unicauca.academicprojectsprototype.access.Factory;
import co.edu.unicauca.academicprojectsprototype.access.ICompanyRepository;
import co.edu.unicauca.academicprojectsprototype.access.ICoordinatorRepository;
import co.edu.unicauca.academicprojectsprototype.access.IProjectRepository;
import co.edu.unicauca.academicprojectsprototype.access.IStudentRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Admin;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Sector;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import co.edu.unicauca.academicprojectsprototype.domain.services.CompanyService;
import co.edu.unicauca.academicprojectsprototype.domain.services.CoordinatorService;
import co.edu.unicauca.academicprojectsprototype.domain.services.ProjectService;
import co.edu.unicauca.academicprojectsprototype.domain.services.StudentService;
import co.edu.unicauca.academicprojectsprototype.presentation.GUIHomeWithoutLog;
import javax.swing.JFrame;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Hacia futuro el tipo de repositorio lo podemos leer de un archivo plano
        // setup.properties, asi no tendriamos que recompilar la aplicación
        ICompanyRepository repositoryCompany = Factory.getInstance().getRepositoryCompany("SQLITE");// Podria ir ARRAYS/SQLITE
        IStudentRepository repositoryStudent = Factory.getInstance().getRepositoryStudent("SQLITE");
        ICoordinatorRepository repositoryCoordi = Factory.getInstance().getRepositoryCoordi("SQLITE");
        CompanyService.getInstance(repositoryCompany);
        StudentService.getInstance(repositoryStudent);

        IProjectRepository repositoryProject = Factory.getInstance().getRepositoryProject("SQLITE");
        ProjectService.getInstance(repositoryProject);

        //------- quema de datos Coordi
        CoordinatorService coordiService = CoordinatorService.getInstance(repositoryCoordi);
        coordiService.save(new Coordinator("1", "Julio Ariel", "123", "julioAriel@gmail.com", "Sistemas", "pass"));
        coordiService.save(new Coordinator("2", "Libardo", "tel", "email", "program", "pass"));

        //---- queda de datos admin
        Admin admin = Admin.getInstance();
        admin.setAdminData("Julian", "123", "123");

        //---- quema de datos Estudiante
        StudentService studentService = StudentService.getInstance(repositoryStudent);
        studentService.save(new Student("1", "Julian", "31762", "julianrojas@unicauca.edu.co", "Pili.123"));
        studentService.save(new Student("2", "Anderson", "31111", "avinasco@unicauca.edu.co", "Pili.123"));

        //--- quema de datos empresa
        CompanyService companyService = CompanyService.getInstance(repositoryCompany);
        companyService.saveCompany(new Company("1234567890", "Lacteos popayan", "123", "lacteos.com", Sector.HEALTH, "Lactes@correo.com", "123"));
        companyService.saveCompany(new Company("1234567891", "Fresas con crema popayan", "1111", "tufresita.com", Sector.SERVICES, "tufresita@correo.com", "123"));

        GUIHomeWithoutLog instance = new GUIHomeWithoutLog();
        instance.setExtendedState(JFrame.MAXIMIZED_BOTH);
        instance.setVisible(true);
    }

}
