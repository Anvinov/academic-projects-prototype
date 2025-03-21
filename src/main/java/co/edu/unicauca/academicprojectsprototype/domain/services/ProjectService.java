/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.domain.services;

import co.edu.unicauca.academicprojectsprototype.access.IProjectRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Project;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import co.edu.unicauca.academicprojectsprototype.domain.services.validationPipelines.NormalizationStep;
import co.edu.unicauca.academicprojectsprototype.domain.services.validationPipelines.ProjectPipeline;
import co.edu.unicauca.academicprojectsprototype.domain.services.validationPipelines.RegisterStep;
import co.edu.unicauca.academicprojectsprototype.domain.services.validationPipelines.ValidationStep;
import co.edu.unicauca.academicprojectsprototype.infra.Messages;
import java.util.List;
import observer.Subject;

public class ProjectService extends Subject implements IProjectService {

    private IProjectRepository repositorio;
    private ProjectPipeline pipeline;
    private static ProjectService instance; // Instancia única

    /**
     * Constructor de ProjectService.Obtiene el repositorio de proyectos desde
     * el PluginManager y configura el pipeline de procesamiento.
     *
     * @param repositorio
     */
    public ProjectService(IProjectRepository repositorio) {
        this.repositorio = repositorio;
        this.pipeline = new ProjectPipeline();
        this.pipeline.addStep(new ValidationStep());
        this.pipeline.addStep(new NormalizationStep());
        this.pipeline.addStep(new RegisterStep(repositorio));
    }

    /**
     * Registra un nuevo proyecto en el sistema.
     *
     * @param title Título del proyecto.
     * @param description Descripción del proyecto.
     * @param empresa Usuario que representa la empresa que propone el proyecto.
     */
    @Override
    public void registerProject(String title, String description, Company empresa) {
        Project proyecto = new Project(title, description, empresa);
        try {
            pipeline.execute(proyecto);
            System.out.println("Proyecto registrado: " + proyecto.getTitle());
            notifyObservers();
        } catch (Exception e) {
            System.out.println("Error al registrar el proyecto: " + e.getMessage());
        }
    }

    /**
     * Lista todos los proyectos disponibles en el sistema.
     */
    @Override
    public void listProject() {
        repositorio.listAll().forEach(System.out::println);
    }

    public List<Project> getAllProjects() {
        return repositorio.listAll();
    }

    /**
     * Asigna un estudiante a un proyecto específico.
     *
     * @param titulo Título del proyecto a asignar.
     * @param estudiante Usuario que representa al estudiante.
     */
    @Override
    public void assignProject(String titulo, Student estudiante) {
        Project proyecto = repositorio.Search(titulo);
        if (proyecto == null) {
            System.out.println("Proyecto no encontrado.");
            return;
        }

        proyecto.assignStudent(estudiante);
        repositorio.update(proyecto); // Guarda los cambios en la BD

        // Actualiza el estado del proyecto
        actualizarEstadoProyecto(titulo, "Asignado");

        System.out.println("Proyecto asignado a: " + estudiante.getName());
        Messages.showMessageDialog("Proyecto asignado a: " + estudiante.getName(), "Éxito");

        notifyObservers();
    }

    public static ProjectService getInstance(IProjectRepository repositorio) {
        if (instance == null) {
            instance = new ProjectService(repositorio);
        }
        return instance;
    }

    public Project searchTitle(String title) {
        return repositorio.Search(title);
    }

    public void actualizarEstadoProyecto(String titulo, String nuevoEstado) {
        Project proyecto = repositorio.Search(titulo);

        if (proyecto != null) {
            proyecto.setState(nuevoEstado); // Cambia el estado en memoria
            repositorio.update(proyecto);  // Guarda en la BD
            System.out.println("Estado del proyecto actualizado a: " + nuevoEstado);
            notifyObservers();
        } else {
            System.out.println("Proyecto no encontrado.");
        }
    }

}
