/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import co.edu.unicauca.academicprojectsprototype.domain.entities.Project;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anvig
 */
public class ProjectArrayRepository implements IProjectRepository {

    private final List<Project> projects;

    /**
     * Constructor que inicializa la lista de proyectos.
     */
    public ProjectArrayRepository() {
        this.projects = new ArrayList<>();
    }

    /**
     * Agrega un nuevo proyecto a la lista de proyectos.
     *
     * @param proyecto El proyecto que se desea agregar.
     */
    @Override
    public void addProject(Project proyecto) {
        if (proyecto != null) {
            projects.add(proyecto);
        }
    }

    /**
     * Obtiene la lista de todos los proyectos almacenados.
     *
     * @return Una lista de proyectos.
     */
    @Override
    public List<Project> getProjects() {
        return new ArrayList<>(projects); // Retornar una copia para evitar modificaciones externas
    }

    /**
     * Busca un proyecto por su título.
     *
     * @param titulo El título del proyecto que se desea buscar.
     * @return El proyecto encontrado, o `null` si no se encuentra ningún
     * proyecto con el título especificado.
     */
    @Override
    public Project findProjectByTitle(String titulo) {
        for (Project project : projects) {
            if (project.getTitle().equalsIgnoreCase(titulo)) {
                return project;
            }
        }
        return null;
    }

}
