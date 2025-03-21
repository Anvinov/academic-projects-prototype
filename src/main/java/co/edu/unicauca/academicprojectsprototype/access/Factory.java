/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.services.CompanyService;
import co.edu.unicauca.academicprojectsprototype.domain.services.StudentService;
import java.util.HashMap;
import java.util.Map;

/**
 * Fabrica que se encarga de instanciar ProductRepository o cualquier otro que
 * se cree en el futuro.
 *
 */
public class Factory {

    /**
     * Singleton
     */
    private static Factory instance;

    private Map<String, ICompanyRepository> dictionary;
    private Map<String, IStudentRepository> dictionary2;
    private Map<String, IProjectRepository> dictionary3;
    private Map<String, ICoordinatorRepository> dictionary4;

    private Factory() {
        // Inicializar diccionarios antes de crear repositorios
        dictionary = new HashMap<>();
        dictionary2 = new HashMap<>();
        dictionary3 = new HashMap<>();
        dictionary4 = new HashMap<>();

        // Inicializar repositorios de Company y Student
        ICompanyRepository repositoryCompany = new CompanySqliteRepository();
        IStudentRepository repositoryStudent = new StudentSqliteRepository();

        dictionary.put("SQLITE", repositoryCompany);
        dictionary2.put("SQLITE", repositoryStudent);

        // Inicializar servicios con repositorios
        CompanyService companyService = CompanyService.getInstance(repositoryCompany);
        StudentService studentService = StudentService.getInstance(repositoryStudent);

        // Inicializar repositorios de Project y Coordinator
        dictionary3.put("ARRAY", new ProjectArrayRepository());
        dictionary3.put("SQLITE", new ProjectSqliteRepository(companyService, studentService));

        dictionary4.put("ARRAY", new CoordinatorArrayRepository());
        dictionary4.put("SQLITE", new CoordinatorSqliteRepository());
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }

        return instance;
    }

    /**
     * Método que crea una instancia concreta de la jerarquia ICompanyRepository
     *
     * @param repository cadena que indica qué tipo de clase hija debe
     * instanciar
     * @return una clase hija de la abstracción IProductRepository
     */
    public ICompanyRepository getRepositoryCompany(String repository) {

        ICompanyRepository result = null;

        if (dictionary.containsKey(repository)) {
            result = dictionary.get(repository);
        }

        return result;
    }

    public IStudentRepository getRepositoryStudent(String repository) {

        IStudentRepository result = null;

        if (dictionary2.containsKey(repository)) {
            result = dictionary2.get(repository);
        }

        return result;
    }

    public IProjectRepository getRepositoryProject(String repository) {

        IProjectRepository result = null;

        if (dictionary3.containsKey(repository)) {
            result = dictionary3.get(repository);
        }

        return result;
    }

    public ICoordinatorRepository getRepositoryCoordi(String repository) {

        ICoordinatorRepository result = null;

        if (dictionary4.containsKey(repository)) {
            result = dictionary4.get(repository);
        }

        return result;
    }

}
