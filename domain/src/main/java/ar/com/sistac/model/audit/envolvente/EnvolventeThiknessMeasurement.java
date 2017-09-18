package ar.com.sistac.model.audit.envolvente;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class EnvolventeThiknessMeasurement {
    public static EnvolventeThiknessMeasurement create(EnvolventeThiknessMeasurePoint envolventeThiknessMeasurePoint, Integer value) {
        return new AutoValue_EnvolventeThiknessMeasurement(envolventeThiknessMeasurePoint, value);
    }

    public abstract EnvolventeThiknessMeasurePoint measurementPoint();

    public abstract Integer measuredQuantityInMm();
}
