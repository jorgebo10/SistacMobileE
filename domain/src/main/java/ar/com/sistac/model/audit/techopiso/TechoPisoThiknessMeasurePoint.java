package ar.com.sistac.model.audit.techopiso;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class TechoPisoThiknessMeasurePoint {
     public static TechoPisoThiknessMeasurePoint create(Integer sheetNumber, Integer measurementNumber) {
            return new AutoValue_TechoPisoThiknessMeasurePoint(sheetNumber, measurementNumber);
        }

        public abstract Integer sheetNumber();

        public abstract Integer measurementNumber();

}