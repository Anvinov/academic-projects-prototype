/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State.Coordinator;

import State.ICoordinatorState;
import co.edu.unicauca.academicprojectsprototype.domain.entities.Coordinator;
import co.edu.unicauca.academicprojectsprototype.infra.Messages;

/**
 *
 * @author lopez
 */
public class RechazadoCoordi implements ICoordinatorState {

    private Coordinator coordi;

    public RechazadoCoordi(Coordinator coordi) {
        this.coordi = coordi;
    }

    @Override
    public PendienteCoordi solicitarAcceso() {
        Messages.showMessageDialog("Usted no tiene acceso. Rechazado por el admin", "Sin acceso");
        return new PendienteCoordi(coordi);
    }

    @Override
    public VerificadoCoordi verificar() {
        Messages.showMessageDialog("Usted no tiene acceso. Rechazado por el admin", "Sin acceso");
        return new VerificadoCoordi(coordi);
    }

    @Override
    public RechazadoCoordi rechazar() {
        Messages.showMessageDialog("Usted no tiene acceso. Rechazado por el admin", "Sin acceso");
        return new RechazadoCoordi(coordi);
    }

     @Override
    public String toString() {
        return "RECHAZADO";
    }
}
