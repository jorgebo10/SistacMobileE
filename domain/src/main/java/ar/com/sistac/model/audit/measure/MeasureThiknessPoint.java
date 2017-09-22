package ar.com.sistac.model.audit.measure;

import ar.com.sistac.model.audit.AuditId;

public class MeasureThiknessPoint {
    private Long id;
    private final AuditId auditId;
    private final ThicknessType thicknessType;
    private final MeasurePoint measurePoint;
    private final Integer thikness;

    public MeasureThiknessPoint(final AuditId auditId, final ThicknessType thicknessType, final MeasurePoint measurePoint, final Integer thikness) {
        this.auditId = auditId;
        this.measurePoint = measurePoint;
        this.thicknessType = thicknessType;
        this.thikness = thikness;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public AuditId getAuditId() {
        return auditId;
    }

    public ThicknessType getThicknessType() {
        return thicknessType;
    }

    public MeasurePoint getMeasurePoint() {
        return measurePoint;
    }

    public Integer getThikness() {
        return thikness;
    }
}
