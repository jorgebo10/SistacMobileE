package ar.com.sistac.model.audit.techopiso;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class TechoPisoMeasurementDetails {
    public static TechoPisoMeasurementDetails create(Integer maxChapas, Integer maxMeasurements) {
        return new AutoValue_TechoPisoMeasurementDetails(maxChapas, maxMeasurements);
    }

    public abstract Integer maxChapas();

    public abstract Integer maxMeasurements();
}