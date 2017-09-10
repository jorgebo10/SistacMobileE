package ar.com.sistac.usecases.informeSummaries;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class InformeSummaryResponseModel {
    static Builder builder() {
        return new AutoValue_InformeSummaryResponseModel.Builder();
    }

    public abstract Long cit();

    public abstract String auditor();

    public abstract String direccion();

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setCit(final Long cit);

        abstract Builder setAuditor(final String auditor);

        abstract Builder setDireccion(final String direccion);

        abstract InformeSummaryResponseModel build();
    }
}