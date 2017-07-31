package ar.com.sistac.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Informe implements Serializable {
    private Long _id;
    private Long cit;
    private String identificacion;
    private Date fechaCreacion;
    private String calle;
    private String localidad;
    private String provincia;
    private String entidadAuditora;
    private String inspector;
    private String operador;
    private Integer anioFabricacion;
    private Integer syncStatus;

    public int getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Integer syncStatus) {
        this.syncStatus = syncStatus;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getEntidadAuditora() {
        return entidadAuditora;
    }

    public void setEntidadAuditora(String entidadAuditora) {
        this.entidadAuditora = entidadAuditora;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Long getCit() {
        return cit;
    }

    public void setCit(Long cit) {
        this.cit = cit;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return Objects.equals(_id, informe._id) &&
                Objects.equals(cit, informe.cit) &&
                Objects.equals(identificacion, informe.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, cit, identificacion);
    }
}
