/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

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
        //------------- empresas
        dictionary = new HashMap<>();
        dictionary.put("SQLITE", new CompanySqliteRepository());
        
        //----------------
        
        //----------- estudiantes
        dictionary2 = new HashMap<>();
        dictionary2.put("SQLITE", new StudentSqliteRepository());
        
        //-----------
        
        //--------- proyectos
        dictionary3 = new HashMap<>();
        dictionary3.put("ARRAY", new ProjectArrayRepository());
        dictionary3.put("SQLITE", new ProjectSqliteRepository());
        
        //---------------
        
        //----------- coordinador
        dictionary4 = new HashMap<>();
        dictionary4.put("ARRAY", new CoordinatorArrayRepository());
         dictionary4.put("SQLITE", new CoordinatorSqliteRepository());
        //dictionary.put("ARRAYS", new CompanyArraysRepository());
        
        
        
        
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
