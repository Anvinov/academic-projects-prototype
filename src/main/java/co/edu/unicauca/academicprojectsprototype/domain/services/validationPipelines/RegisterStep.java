
package co.edu.unicauca.academicprojectsprototype.domain.services.validationPipelines;



import co.edu.unicauca.academicprojectsprototype.access.IProjectRepository;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Project;
import java.util.List;

/**
 * Clase que representa un paso en la validación de registro de proyectos.
 * Verifica si un proyecto con el mismo título ya existe en el repositorio
 * antes de registrarlo.
 * 
 * Implementa la interfaz {@link PipelineStep}.
 * 
 * @author libardo
 */
public class RegisterStep implements PipelineStep {
    
    /**
     * Repositorio de proyectos donde se almacenarán los registros.
     */
    private IProjectRepository repositorio;

    /**
     * Constructor que inicializa el repositorio de proyectos.
     * 
     * @param repositorio el repositorio donde se almacenarán los proyectos
     */
    public RegisterStep(IProjectRepository repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * Procesa el proyecto verificando si ya existe uno con el mismo título
     * en el repositorio. Si ya existe, lanza una excepción. Si no, lo agrega
     * al repositorio.
     * 
     * @param proyecto el proyecto a registrar
     * @return el proyecto registrado
     * @throws IllegalArgumentException si ya existe un proyecto con el mismo título
     */
    @Override
    public Project process(Project proyecto) {
        List<Project> proyectosExistentes = repositorio.listAll();
        boolean existe = proyectosExistentes.stream()
                .anyMatch(p -> p.getTitle().equals(proyecto.getTitle()));
        
        if (existe) {
            throw new IllegalArgumentException("Ya existe un proyecto con este título.");
        }
        
        repositorio.save(proyecto);
        return proyecto;
    }
}
