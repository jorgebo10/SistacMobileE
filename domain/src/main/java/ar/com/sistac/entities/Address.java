package ar.com.sistac.entities;


import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Address {

    public abstract String street();
    public abstract String location();
    public abstract String state();
    static Builder builder() {
        return new AutoValue_Address.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setStreet(String street);
        abstract Builder setLocation(String location);
        abstract Builder setState(String state);

        abstract Address build();
    }
}
