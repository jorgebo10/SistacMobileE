package ar.com.sistac.model.tank;


import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Address {
    public static Address.Builder builder() {
        return new AutoValue_Address.Builder();
    }

    public abstract String street();

    public abstract String location();

    public abstract String state();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setStreet(String street);

        public abstract Builder setLocation(String location);

        public abstract Builder setState(String state);

        public abstract Address build();
    }
}
