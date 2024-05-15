import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6e4aec89-036e-4fc3-9b5f-1641feee0791")
public class Usuario {
    @objid ("4c5dbdcc-92f2-4e21-8e15-0f2b99ac9c56")
    public String UDID;

    @objid ("fd4c150d-9afd-408e-b4d2-b97d73405c5d")
    public String DNI;

    @objid ("d6c911f8-eded-4e66-ae2d-5cf12130f457")
    public String nombre;

    @objid ("7ef8d24b-0307-41f2-b5f1-da9cba9fc109")
    public Date fechaNacimiento;

    @objid ("3b3a2aee-add0-457f-9c2e-a726ec5bd793")
    public String sexo;

    @objid ("6361cfa9-976a-4188-af8c-9ffab8cfe220")
    public String solucionesActivas;

    @objid ("7b09872a-8ef7-41c8-8efe-8c85c58dc563")
    public List<DispositivosControl> posee = new ArrayList<DispositivosControl> ();

    @objid ("79baea5a-7511-4e56-b7a2-d31678c9bd19")
    public void calcularUDID() {
    }

    @objid ("c153ebf1-0bd1-4fb7-a5d4-b18741a0cf20")
    public void configurarSolucion(final String solucion) {
    }

    @objid ("aeacd138-88d0-4e81-9f69-e53dca72b4ea")
    public void encuestaDiaria(final int calidadDescanso) {
    }

    @objid ("f76455cd-4642-4ddc-9654-e64b8e777b72")
    public void consultarInforme(Informe informe) {
    }

}
