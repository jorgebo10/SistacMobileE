package ar.com.sistac.model.audit.measure;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MeasurePoint {
    public static MeasurePoint create(Integer virolaNumber, Integer generatrizNumber, Integer measureNumber) {
        return new AutoValue_MeasurePoint(virolaNumber, generatrizNumber, measureNumber);
    }

    public abstract Integer virolaNumber();

    public abstract Integer generatrizNumber();

    public abstract Integer measureNumber();

}
