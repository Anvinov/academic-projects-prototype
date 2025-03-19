/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import java.util.List;

public interface ICompanyRepository {
    
    /**
     * Inicializa el repositorio para guardar las empresas.
     */
    void initializeDatabase();
    
    /**
     * Agrega una nueva empresa al repositorio.
     * @param newCompany Objeto de tipo Company que representa la empresa a agregar.
     */
    boolean save(Company newCompany);
    
    /**
     * Obtiene la lista de todas las empresas almacenadas en el repositorio.
     * @return Lista de objetos Company.
     */
    List<Company> listAll();
    
    /**
     * Busca una empresa en el repositorio por su NIT.
     * @param nit NIT de la empresa a buscar.
     * @return El objeto Company si se encuentra, de lo contrario, null.
     */
    Company Search(String nit);
}
