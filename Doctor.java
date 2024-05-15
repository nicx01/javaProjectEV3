import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("91d716a5-825c-447d-8290-3153a2003c58")
public class Doctor extends Personal {
    @objid ("8d284986-60f8-4131-aa44-41d26b16ff19")
    public List<Usuario> controla = new ArrayList<Usuario> ();

    @objid ("92e8a524-302b-4e35-90e6-4bff1a8f2b75")
    public Enfermera trabajaCon;

    @objid ("c0f9e02e-2f3a-43b0-b8b5-b5e6d7665203")
    public void darAltaPaciente(final Usuario paciente) {
    }

}
