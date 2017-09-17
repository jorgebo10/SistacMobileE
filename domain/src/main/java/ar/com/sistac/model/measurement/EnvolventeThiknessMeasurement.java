package ar.com.sistac.model.measurement;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class EnvolventeThiknessMeasurement {
    public static EnvolventeThiknessMeasurement create(EnvolventeMeasurementPoint envolventeMeasurementPoint, Integer generatriz) {
        return new AutoValue_EnvolventeThiknessMeasurement(envolventeMeasurementPoint, generatriz);
    }

    public abstract EnvolventeMeasurementPoint measurementPoint();

    public abstract Integer measuredQuantityInMm();
}
