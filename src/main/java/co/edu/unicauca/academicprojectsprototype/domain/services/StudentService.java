/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import co.edu.unicauca.academicprojectsprototype.access.IStudentRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import java.util.List;

/**
 *
 * @author anvig
 */
public class StudentService implements IStudentService{

     private IStudentRepository repository;

     public StudentService(IStudentRepository repository) {
        this.repository = repository;
    }
     
     
   @Override
    public List<Student> listAll() {
        return repository.listAll();
    }

    @Override
    public boolean save(Student newStudent) {
        return repository.save(newStudent);
    }

    @Override
    public Student Search(String code) {
        return repository.search(code);
    }
    
}
