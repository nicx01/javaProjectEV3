import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4fcd5260-c899-4633-a48c-1b1021d7e79e")
public class Personal {
    @objid ("e5e347ed-5e43-434b-b5b4-88ca42dbe061")
    public String nombre;

    @objid ("410fa827-9c4d-4278-aed5-acc0b961619e")
    public String apellido;

    @objid ("036cbce2-619c-457a-9f98-fd3b97877ab6")
    public String DNI;

    @objid ("0a1d47f7-da5f-4af8-9571-bb017aa64157")
    public String cuentaBancaria;

    @objid ("d9b27c13-61b8-4c7a-a8ae-7ce55959873a")
    public int salario;

    @objid ("82de2e35-537e-407a-8e1a-e6775f99dc46")
    public void consultarInforme(final Usuario paciente, final Informe informe) {
    }

}
