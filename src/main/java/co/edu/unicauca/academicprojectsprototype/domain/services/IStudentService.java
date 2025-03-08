/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import java.util.List;

/**
 *
 * @author lopez
 */
public interface IStudentService{
    boolean save(Student newStudent);
    List<Student> listAll();
}
