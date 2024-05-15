import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("856e74f6-a033-48dc-82a1-6e422e829d91")
public class Informe {
    @objid ("bf0d4272-a6c4-440f-a338-ddb157ff654a")
    public Usuario paciente;

    @objid ("ee467925-9726-492a-94fc-cd24242b417f")
    public String datosMedicos;

    @objid ("1994077c-5e15-418d-b662-52ae92b20f1f")
    public String resultados;

    @objid ("77097aad-886f-4353-a304-451de3536eee")
    public String solucionesRecomendadas;

    @objid ("d0788c69-216f-42dd-b50a-7637550c787a")
    public Usuario getPaciente() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.paciente;
    }

    @objid ("6572b0a5-5695-4958-a0a5-5e50289511eb")
    public void setPaciente(final Usuario value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.paciente = value;
    }

    @objid ("588c2f4e-4821-4264-b04c-e1923bb078f2")
    public String getDatosMedicos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.datosMedicos;
    }

    @objid ("030d80e9-76f5-4a3a-9844-b16dad67cb88")
    public void setDatosMedicos(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.datosMedicos = value;
    }

    @objid ("9d8f7558-d02c-4ba5-9877-e3786fd2c263")
    public String getResultados() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.resultados;
    }

    @objid ("90e3d643-7788-4b41-8f97-04efa6b60f2c")
    public void setResultados(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.resultados = value;
    }

    @objid ("c092b65a-9671-4c80-ac57-5d558e20bb6a")
    public String getSolucionesRecomendadas() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.solucionesRecomendadas;
    }

    @objid ("6bc90e6c-8a8d-4c5e-ac1a-6a59c997365d")
    public void setSolucionesRecomendadas(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.solucionesRecomendadas = value;
    }

}
