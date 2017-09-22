package ar.com.sistac.audit.summaries;

import com.google.auto.value.AutoValue;

import java.util.Date;

import ar.com.sistac.model.audit.Auditor;
import ar.com.sistac.model.tank.Address;

@AutoValue
public abstract class AuditSummaryResponseModel {
    static Builder builder() {
        return new AutoValue_AuditSummaryResponseModel.Builder();
    }

    public abstract String cit();

    public abstract Auditor auditor();

    public abstract Date date();

    public abstract Address address();

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setCit(final String cit);

        abstract Builder setAuditor(final Auditor auditor);

        abstract Builder setAddress(final Address direccion);

        abstract Builder setDate(final Date date);

        abstract AuditSummaryResponseModel build();
    }
}