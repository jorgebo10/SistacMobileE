package ar.com.sistac.usecases.informeDetails;

import com.google.auto.value.AutoValue;

import java.util.Date;

@AutoValue
public abstract class InformeDetails {
    static InformeDetails.Builder builder() {
        return new AutoValue_InformeDetails.Builder();
    }

    public abstract Long cit();

    public abstract String auditor();

    public abstract String direccion();

    public abstract Date fechaCreacion();

    @AutoValue.Builder
    public abstract static class Builder {
        abstract InformeDetails.Builder setCit(final Long cit);

        abstract InformeDetails.Builder setAuditor(final String auditor);

        abstract InformeDetails.Builder setDireccion(final String direccion);

        abstract InformeDetails.Builder setFechaCreacion(final Date fechaCreacion);

        abstract InformeDetails build();
    }
}
