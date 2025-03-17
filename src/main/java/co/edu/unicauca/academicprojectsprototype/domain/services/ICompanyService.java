/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import java.util.List;

public interface ICompanyService {
    
     public List<Company> getAllCompanies();
     
     public boolean saveCompany(Company newCompany);
     
     public Company search (String id);
}
