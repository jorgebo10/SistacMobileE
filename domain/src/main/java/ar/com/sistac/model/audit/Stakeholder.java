package ar.com.sistac.model.audit;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Stakeholder {
    public static Stakeholder.Builder builder() {
        return new AutoValue_Stakeholder.Builder();
    }

    public abstract String name();

    public abstract String surname();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Stakeholder.Builder setName(String name);

        public abstract Stakeholder.Builder setSurname(String surname);

        public abstract Stakeholder build();
    }
}
