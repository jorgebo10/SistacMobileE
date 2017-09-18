package ar.com.sistac.model.audit.envolvente;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class EnvolventeThiknessMeasurePoint {
    public static EnvolventeThiknessMeasurePoint create(Integer virolaNumber, Integer generatrizNumber, Integer measureNumber) {
        return new AutoValue_EnvolventeThiknessMeasurePoint(virolaNumber, generatrizNumber, measureNumber);
    }

    public abstract Integer virolaNumber();

    public abstract Integer generatrizNumber();

    public abstract Integer measureNumber();

}
