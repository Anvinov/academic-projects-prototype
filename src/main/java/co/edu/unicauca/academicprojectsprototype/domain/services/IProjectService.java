/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;

/**
 *
 * @author lopez
 */
public interface IProjectService {
    void registerProject(String title, String description, Company empresa);
    public void listProject();
    void assignProject(String titulo, Student estudiante);
    
}
