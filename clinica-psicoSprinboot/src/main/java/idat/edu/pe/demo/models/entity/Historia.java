package idat.edu.pe.demo.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historia")
public class Historia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String motivoconsulta;

    private Boolean tuvomedicacion;

    private String medicacion;

    private Boolean tuvoriesgo;

    
    @JoinColumn(name = "riesgo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Riesgo riesgo; // OneToOne

    private Boolean tuvoviolencia;

    @ManyToMany
    @JoinTable(name = "tiposviolencia", joinColumns = {
            @JoinColumn(name = "historia", referencedColumnName = "id") }, inverseJoinColumns = {
                    @JoinColumn(name = "violencia", referencedColumnName = "id") })
    private List<Violencia> historialista; // ManyToMany

    private String lugaratencionprevio;

    private Boolean tuvodianosticoprevio;

    private String diagnosticoprevio;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "historia")
    private Diagnostico diagnostico; // OneToOne

    @OneToOne
    @JoinColumn(name = "paciente", referencedColumnName = "id")
    private Paciente paciente;

    public Historia() {
    }

    public Historia(String motivoconsulta, Boolean tuvomedicacion, String medicacion, Boolean tuvoriesgo, Riesgo riesgo,
            Boolean tuvoviolencia, List<Violencia> historialista, String lugaratencionprevio,
            Boolean tuvodianosticoprevio, String diagnosticoprevio) {
        this.motivoconsulta = motivoconsulta;
        this.tuvomedicacion = tuvomedicacion;
        this.medicacion = medicacion;
        this.tuvoriesgo = tuvoriesgo;
        this.riesgo = riesgo;
        this.tuvoviolencia = tuvoviolencia;
        this.historialista = historialista;
        this.lugaratencionprevio = lugaratencionprevio;
        this.tuvodianosticoprevio = tuvodianosticoprevio;
        this.diagnosticoprevio = diagnosticoprevio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivoconsulta() {
        return motivoconsulta;
    }

    public void setMotivoconsulta(String motivoconsulta) {
        this.motivoconsulta = motivoconsulta;
    }

    public Boolean getTuvomedicacion() {
        return tuvomedicacion;
    }

    public void setTuvomedicacion(Boolean tuvomedicacion) {
        this.tuvomedicacion = tuvomedicacion;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    public Boolean getTuvoriesgo() {
        return tuvoriesgo;
    }

    public void setTuvoriesgo(Boolean tuvoriesgo) {
        this.tuvoriesgo = tuvoriesgo;
    }

    public Riesgo getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(Riesgo riesgo) {
        this.riesgo = riesgo;
    }

    public Boolean getTuvoviolencia() {
        return tuvoviolencia;
    }

    public void setTuvoviolencia(Boolean tuvoviolencia) {
        this.tuvoviolencia = tuvoviolencia;
    }

    public List<Violencia> getHistorialista() {
        return historialista;
    }

    public void setHistorialista(List<Violencia> historialista) {
        this.historialista = historialista;
    }

    public String getLugaratencionprevio() {
        return lugaratencionprevio;
    }

    public void setLugaratencionprevio(String lugaratencionprevio) {
        this.lugaratencionprevio = lugaratencionprevio;
    }

    public Boolean getTuvodianosticoprevio() {
        return tuvodianosticoprevio;
    }

    public void setTuvodianosticoprevio(Boolean tuvodianosticoprevio) {
        this.tuvodianosticoprevio = tuvodianosticoprevio;
    }

    public String getDiagnosticoprevio() {
        return diagnosticoprevio;
    }

    public void setDiagnosticoprevio(String diagnosticoprevio) {
        this.diagnosticoprevio = diagnosticoprevio;
    }

    private static final long serialVersionUID = 1L;
}
