package ar.com.sistac.model.measurement;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class EnvolventeMeasurementPoint {
    public static EnvolventeMeasurementPoint create(Integer virola, Integer generatriz) {
        return new AutoValue_EnvolventeMeasurementPoint(virola, generatriz);
    }

    public abstract Integer virola();

    public abstract Integer generatriz();
}
