import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9b4c8d39-2283-45a4-9f64-cc40afec0049")
public class DispositivosControl implements InterfazControlSueno {
    @objid ("8ba4d1e6-4f3a-44ee-89fa-8a0e86c3288b")
    public String id;

    @objid ("11137de8-ee65-48e2-8f74-44b3fc1ccbfe")
    public String nombre;

    @objid ("ed7f8702-92a1-44c9-9de9-7a53c9a1d419")
    public String fabricante;

    @objid ("f45a32be-3883-403a-8d10-972964bfe890")
    public String version;

    @objid ("8f7ba4fe-1408-433f-a892-9108c9b0bd25")
    public void generarInforme(Informe informe) {
    }

}
