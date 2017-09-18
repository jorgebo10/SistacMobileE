package ar.com.sistac.model.audit.techopiso;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TechoPisoMeasurementRecord {
    private final Long id;
    private final TechoPisoMeasurementDetails techoPisoMeasurementDetails;
    private Map<TechoPisoThiknessMeasurePoint, Integer> techoPisoThiknessMeasurementList;

    public TechoPisoMeasurementRecord(final Long id, final TechoPisoMeasurementDetails techoPisoMeasurementDetails) {
        this.id = id;
        this.techoPisoMeasurementDetails = techoPisoMeasurementDetails;
        this.techoPisoThiknessMeasurementList = new HashMap<>();
    }

    public Long getId() {
        return id;
    }

    public Map<TechoPisoThiknessMeasurePoint, Integer> getTechoPisoThiknessMeasurementList() {
        return Collections.unmodifiableMap(this.techoPisoThiknessMeasurementList);
    }

    public void add(final TechoPisoThiknessMeasurePoint point, final Integer value) {

        if (point.sheetNumber() > techoPisoMeasurementDetails.maxChapas())  {
            throw new IllegalArgumentException("chapa number is grater than allowed");
        }

        if (point.measurementNumber() > techoPisoMeasurementDetails.maxMeasurements())  {
            throw new IllegalArgumentException("measurement number is grater than allowed");
        }

        this.techoPisoThiknessMeasurementList.put(point, value);
    }

    public void remove(final TechoPisoThiknessMeasurePoint point) {
        this.techoPisoThiknessMeasurementList.remove(point);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechoPisoMeasurementRecord that = (TechoPisoMeasurementRecord) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
