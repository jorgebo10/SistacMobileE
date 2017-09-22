package ar.com.sistac.model.audit;


import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AuditId {
    public static AuditId.Builder builder() {
        return new AutoValue_AuditId.Builder();
    }

    public abstract Long id();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract AuditId.Builder setId(Long id);

        public abstract AuditId build();
    }
}
