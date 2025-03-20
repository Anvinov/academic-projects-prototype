/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.academicprojectsprototype.access;

import State.ICoordinatorState;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import java.util.List;

public interface ICoordinatorRepository {

    /**
     * Inicializa el repositorio para guardar los coordinadores.
     */
    void initializeDatabase();

    /**
     * Agrega un nuevo coordinador al repositorio.
     *
     * @param newCoordinator Objeto de tipo Coordinator que representa el
     * coordinador a agregar.
     */
    boolean save(Coordinator newCoordinator);

    /**
     * Obtiene la lista de todos los coordinadores almacenadas en el
     * repositorio.
     *
     * @return Lista de objetos Coordinator.
     */
    List<Coordinator> listAll();

    /**
     * Busca un coordinador en el repositorio por su NIT.
     *
     * @param code codigo de el coordinador a buscar.
     * @return El objeto Coordinator si se encuentra, de lo contrario, null.
     */
    Coordinator Search(String code);

    /**
     * Actualiza el estado de un coordinador en el repositorio.
     *
     * @param code Código del coordinador a actualizar.
     * @param nuevoEstado Nuevo estado del coordinador.
     * @return true si se actualizó correctamente, false en caso contrario.
     */
    boolean actualizarEstado(String code, ICoordinatorState nuevoEstado);
}
