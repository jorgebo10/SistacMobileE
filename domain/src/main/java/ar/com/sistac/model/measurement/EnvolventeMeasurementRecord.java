package ar.com.sistac.model.measurement;

import java.util.List;
import java.util.Objects;

public class EnvolventeMeasurementRecord {
    private final Long id;
    private final EnvolventeMeasurementDetails envolventeMeasurementDetails;
    private List<EnvolventeThiknessMeasurement> envolventeThiknessMeasurementList;

    public EnvolventeMeasurementRecord(final Long id, final EnvolventeMeasurementDetails envolventeMeasurementDetails) {
        this.id = id;
        this.envolventeMeasurementDetails = envolventeMeasurementDetails;
    }

    public Long getId() {
        return id;
    }

    public EnvolventeMeasurementDetails getEnvolventeMeasurementDetails() {
        return this.envolventeMeasurementDetails;
    }

    public List<EnvolventeThiknessMeasurement> getEnvolventeThiknessMeasurementList() {
        return this.envolventeThiknessMeasurementList;
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
