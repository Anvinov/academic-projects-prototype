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
public class VerificadoCoordi implements ICoordinatorState {

    private Coordinator coordi;

    public VerificadoCoordi(Coordinator coordi) {
        this.coordi = coordi;
    }

    @Override
    public PendienteCoordi solicitarAcceso() {
        Messages.showMessageDialog("Aprobacion aceptada", "Aceptado");
        return new PendienteCoordi(coordi);
    }

    @Override
    public VerificadoCoordi verificar() {
        Messages.showMessageDialog("Usted si tiene acceso al sistema", "Aceptado");
        return new VerificadoCoordi(coordi);
    }

    @Override
    public RechazadoCoordi rechazar() {
        Messages.showMessageDialog("No se puede rachazar si el admin te acepto", "Aceptado");
        return new RechazadoCoordi(coordi);
    }

     @Override
    public String toString() {
        return "VERIFICADO";
    }
}
