/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import java.util.List;

/**
 *
 * @author lopez
 */
public interface IStudentRepository {
    /**
     * Inicializa el repositorio para guardar los estudiantes.
     */
    void initializeDatabase();
    
    /**
     * Agrega un nuevo estudiante al repositorio.
     * @param newStudent Objeto de tipo Student que representa el estudiante a agregar.
     */
    boolean save(Student newStudent);
    
    /**
     * Obtiene la lista de todos los estudiante almacenadas en el repositorio.
     * @return Lista de objetos Student.
     */
    List<Student> listAll();
    
    /**
     * Busca un estudiante en el repositorio por su codigo.
     * @param code codigo de el estudiante a buscar.
     * @return El objeto Student si se encuentra, de lo contrario, null.
     */
    Student search(String code);
}
