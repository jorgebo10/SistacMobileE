package ar.com.sistac.usecases.informeSummaries;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class InformeSummary {
    static Builder builder() {
        return new AutoValue_InformeSummary.Builder();
    }

    public abstract Long cit();

    public abstract String auditor();

    public abstract String direccion();

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setCit(final Long cit);

        abstract Builder setAuditor(final String auditor);

        abstract Builder setDireccion(final String direccion);

        abstract InformeSummary build();
    }
}