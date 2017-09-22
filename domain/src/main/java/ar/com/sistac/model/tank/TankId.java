package ar.com.sistac.model.tank;


import com.google.auto.value.AutoValue;


@AutoValue
public abstract class TankId {
    public static TankId.Builder builder() {
        return new AutoValue_TankId.Builder();
    }

    public abstract Long id();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract TankId.Builder setId(Long id);

        public abstract TankId build();
    }
}
