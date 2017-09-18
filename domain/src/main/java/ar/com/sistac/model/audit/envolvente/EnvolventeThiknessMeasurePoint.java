package ar.com.sistac.model.audit.envolvente;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class EnvolventeThiknessMeasurePoint {
    public static EnvolventeThiknessMeasurePoint create(Integer virola, Integer generatriz, Integer measure) {
        return new AutoValue_EnvolventeThiknessMeasurePoint(virola, generatriz, measure);
    }

    public abstract Integer virola();

    public abstract Integer generatriz();

    public abstract Integer measure();

}
