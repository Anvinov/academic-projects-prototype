/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Project;
import java.util.List;

/**
 *
 * @author lopez
 */
public interface IProjectRepository {
    /**
     * Agrega un nuevo proyecto al repositorio.
     * 
     * @param proyecto Objeto de tipo Project que representa el proyecto a agregar.
     */
    void addProject(Project proyecto);

    /**
     * Busca un proyecto en el repositorio por su título.
     * 
     * @param titulo Título del proyecto a buscar.
     * @return El objeto Project si se encuentra, de lo contrario, null.
     */
    Project findProjectByTitle(String titulo);

    /**
     * Obtiene la lista de todos los proyectos almacenados en el repositorio.
     * 
     * @return Lista de objetos Project.
     */
    List<Project> getProjects();
}
