package ar.com.sistac.model.audit.measure;

import javax.inject.Inject;

import ar.com.sistac.model.audit.Audit;
import ar.com.sistac.model.audit.AuditId;
import ar.com.sistac.model.audit.AuditRepository;

public abstract class AbstractMeasureThicknessService {
    private final AuditRepository auditRepository;
    private final MeasureThiknessRepository measureThiknessRepository;

    @Inject
    public AbstractMeasureThicknessService(final AuditRepository auditRepository, final MeasureThiknessRepository measureThiknessRepository) {
        this.auditRepository = auditRepository;
        this.measureThiknessRepository = measureThiknessRepository;
    }

    public MeasureThiknessPoint newThikness(final Long auditId, final Integer thikness, final MeasurePoint measurePoint) {

        Audit audit = auditRepository.auditOfId(AuditId.builder().setId(auditId).build());

        if (audit == null) {
            throw new IllegalArgumentException("Audit not found by id");
        }

        MeasureThiknessPoint measureThiknessPoint = addMeasurePointThicknessToAudit(audit, thikness, measurePoint);

        measureThiknessRepository.persist(measureThiknessPoint);

        return measureThiknessPoint;
    }

    protected abstract MeasureThiknessPoint addMeasurePointThicknessToAudit(Audit audit, Integer thikness, MeasurePoint measurePoint);
}
