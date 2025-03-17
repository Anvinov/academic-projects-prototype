/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.main;

import co.edu.unicauca.academicprojectsprototype.access.Factory;
import co.edu.unicauca.academicprojectsprototype.access.ICompanyRepository;
import co.edu.unicauca.academicprojectsprototype.access.IStudentRepository;
import co.edu.unicauca.academicprojectsprototype.domain.services.CompanyService;
import co.edu.unicauca.academicprojectsprototype.domain.services.ICompanyService;
import co.edu.unicauca.academicprojectsprototype.domain.services.IStudentService;
import co.edu.unicauca.academicprojectsprototype.domain.services.StudentService;
import co.edu.unicauca.academicprojectsprototype.presentation.GUIHomeCoordinator;
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
        
        ICompanyService serviceCompany = new CompanyService(repositoryCompany);
        IStudentService serviceStudent = new StudentService(repositoryStudent);
        
        GUIHomeWithoutLog instance = new GUIHomeWithoutLog(serviceCompany,serviceStudent);
        instance.setExtendedState(JFrame.MAXIMIZED_BOTH);
        instance.setVisible(true);
    }
    
}

