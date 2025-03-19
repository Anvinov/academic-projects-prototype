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

    public ProjectArrayRepository(){
        this.projects = new ArrayList<>();
    }
    
    @Override
    public void initializeDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean save(Project newProject){
        if (newProject != null) {
            projects.add(newProject);
            return true;
        }
        
        return false;
    }

    @Override
    public List<Project> listAll() {
        return new ArrayList<>(projects); // Retornar una copia para evitar modificaciones externas
    }

    @Override
    public Project Search(String title){
        for (Project project : projects) {
            if (project.getTitle().equalsIgnoreCase(title)) {
                return project;
            }
        }
        return null;
    }

    

}
