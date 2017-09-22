package ar.com.sistac.model.audit;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Auditor {
    public static Auditor.Builder builder() {
        return new AutoValue_Auditor.Builder();
    }

    public abstract String name();

    public abstract String surname();

    public abstract String entity();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Auditor.Builder name(String name);

        public abstract Auditor.Builder surname(String surname);

        public abstract Auditor.Builder entity(String entity);

        public abstract Auditor build();
    }
}
