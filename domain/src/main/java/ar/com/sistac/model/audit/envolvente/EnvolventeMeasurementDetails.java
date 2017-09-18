package ar.com.sistac.model.audit.envolvente;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class EnvolventeMeasurementDetails {
    public static EnvolventeMeasurementDetails create(Integer maxVirolas, Integer maxGeneratrices, Integer maxMeasurements) {
        return new AutoValue_EnvolventeMeasurementDetails(maxVirolas, maxGeneratrices, maxMeasurements);
    }

    public abstract Integer maxVirolas();

    public abstract Integer maxGeneratrices();

    public abstract Integer maxMeasurements();
}
