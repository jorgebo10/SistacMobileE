package ar.com.sistac.model.audit.envolvente;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EnvolventeMeasurementRecord {
    private final Long id;
    private final EnvolventeMeasurementDetails envolventeMeasurementDetails;
    private Map<EnvolventeThiknessMeasurePoint, Integer> envolventeThiknessMeasurementList;

    public EnvolventeMeasurementRecord(final Long id, final EnvolventeMeasurementDetails envolventeMeasurementDetails) {
        this.id = id;
        this.envolventeMeasurementDetails = envolventeMeasurementDetails;
        this.envolventeThiknessMeasurementList = new HashMap<>();
    }

    public Long getId() {
        return id;
    }

    public EnvolventeMeasurementDetails getEnvolventeMeasurementDetails() {
        return this.envolventeMeasurementDetails;
    }

    public Map<EnvolventeThiknessMeasurePoint, Integer> getEnvolventeThiknessMeasurementList() {
        return Collections.unmodifiableMap(this.envolventeThiknessMeasurementList);
    }

    public void add(final EnvolventeThiknessMeasurePoint point, final Integer value) {

        if (point.generatrizNumber() > envolventeMeasurementDetails.maxGeneratrices())  {
            throw new IllegalArgumentException("Genetriz number is grater than allowed");
        }

        if (point.virolaNumber() > envolventeMeasurementDetails.maxVirolas())  {
            throw new IllegalArgumentException("Virola number is grater than allowed");
        }

        if (point.measureNumber() > envolventeMeasurementDetails.maxMeasurements())  {
            throw new IllegalArgumentException("measureNumber number is grater than allowed");
        }

        this.envolventeThiknessMeasurementList.put(point, value);
    }

    public void remove(final EnvolventeThiknessMeasurePoint point) {
        this.envolventeThiknessMeasurementList.remove(point);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnvolventeMeasurementRecord that = (EnvolventeMeasurementRecord) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
