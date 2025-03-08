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

    private Factory() {
        dictionary = new HashMap<>();
        dictionary2 = new HashMap<>();
        //dictionary.put("ARRAYS", new CompanyArraysRepository());
        dictionary.put("SQLITE", new CompanySqliteRepository());
        dictionary2.put("SQLITE", new StudentSqliteRepository());
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
     * @param repository cadena que indica qué tipo de clase hija debe instanciar
     * @return una clase hija de la abstracción IProductRepository
     */
    public ICompanyRepository getRepository(String repository) {

        ICompanyRepository result = null;

        if (dictionary.containsKey(repository)) {
            result = dictionary.get(repository);
        }

        return result;
    }
    
    public IStudentRepository getRepository2(String repository) {

        IStudentRepository result = null;

        if (dictionary2.containsKey(repository)) {
            result = dictionary2.get(repository);
        }

        return result;
    }
    
    
}
