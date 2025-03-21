package co.edu.unicauca.academicprojectsprototype.domain.service;

import co.edu.unicauca.academicprojectsprototype.access.IProjectRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Company;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Project;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Student;
import co.edu.unicauca.academicprojectsprototype.domain.services.ProjectService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MockProjectRepository implements IProjectRepository {
    private List<Project> projects = new ArrayList<>();

    @Override
    public void initializeDatabase() {
        // No-op for mock
    }

    @Override
    public boolean save(Project newProject) {
        return projects.add(newProject);
    }

    @Override
    public List<Project> listAll() {
        return new ArrayList<>(projects);
    }

    @Override
    public Project Search(String title) {
        return projects.stream()
                .filter(project -> project.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean update(Project proyect) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class ProjectServiceTest {
    private ProjectService projectService;
    private IProjectRepository repositorio;

    @BeforeEach
    public void setUp() {
        // Initialize the mock repository
        repositorio = new MockProjectRepository();

        // Create an instance of ProjectService
        projectService = new ProjectService(repositorio);
    }

    @Test
    public void testRegisterProject() {
        // Arrange
        String title = "Sistema de Inventarios";
        String description = "Desarrollar un sistema de gestión de inventarios.";
        Company empresa = new Company();

        // Act
        projectService.registerProject(title, description, empresa);

        // Assert
        List<Project> proyectos = repositorio.listAll();
        assertEquals(1, proyectos.size(), "Debe haber un proyecto registrado");
        assertEquals(title.toUpperCase(), proyectos.get(0).getTitle(), "El título del proyecto debe coincidir");
        assertEquals(description, proyectos.get(0).getDescription(), "La descripción del proyecto debe coincidir");
        assertEquals(empresa, proyectos.get(0).getCompany(), "La empresa del proyecto debe coincidir");
    }

    @Test
    public void testListProject() {
        // Arrange
        Company empresa = new Company();
        projectService.registerProject("Sistema de Inventarios", "Desarrollar un sistema de gestión de inventarios.", empresa);

        // Act & Assert
        assertDoesNotThrow(() -> projectService.listProject(), "No debe lanzar excepciones al listar proyectos");
    }

    @Test
    public void testAssignProject() {
        // Arrange
        String title = "Sistema de Inventarios";
        Company empresa = new Company();
        Student estudiante = new Student();

        projectService.registerProject(title, "Desarrollar un sistema de gestión de inventarios.", empresa);

        // Act
        projectService.assignProject(title, estudiante);

        // Assert
        Project proyecto = repositorio.Search(title);
        assertNotNull(proyecto, "El proyecto debe existir en el repositorio");
        assertEquals(estudiante, proyecto.getStudent(), "El estudiante debe estar asignado al proyecto");
    }

    @Test
    public void testAssignProject_ProjectNotFound() {
        // Arrange
        String title = "Proyecto Inexistente";
        Student estudiante = new Student();

        // Act & Assert
        assertDoesNotThrow(() -> projectService.assignProject(title, estudiante), "No debe lanzar excepciones si el proyecto no existe");
    }
}