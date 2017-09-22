package ar.com.sistac.model.audit.measure;


import ar.com.sistac.model.audit.Audit;
import ar.com.sistac.model.audit.AuditId;
import ar.com.sistac.model.audit.AuditRepository;

public class MeashureThinknessServiceService {
    private final AuditRepository auditRepository;
    private final MeasureThiknessRepository measureThiknessRepository;

    public MeashureThinknessServiceService(final AuditRepository auditRepository, final MeasureThiknessRepository measureThiknessRepository) {
        this.auditRepository = auditRepository;
        this.measureThiknessRepository = measureThiknessRepository;
    }

    public MeasureThiknessPoint newEnvolventeThikness(final Long auditId, final Integer thikness, final Integer virola, final Integer generatriz, final Integer point) {

        Audit audit = auditRepository.auditOfId(AuditId.builder().setId(auditId).build());

        if (audit == null) {
            throw new IllegalArgumentException("Audit not found by id");
        }

        MeasureThiknessPoint measureThiknessPoint = audit.envolventeThiknessForMeasurePoint(thikness, MeasurePoint.create(virola, generatriz, point));

        measureThiknessRepository.persist(measureThiknessPoint);

        return measureThiknessPoint;
    }

    public MeasureThiknessPoint newPisoThikness(final Long auditId, final Integer thikness, final Integer virola, final Integer generatriz, final Integer point) {

        Audit audit = auditRepository.auditOfId(AuditId.builder().setId(auditId).build());

        if (audit == null) {
            throw new IllegalArgumentException("Audit not found by id");
        }

        MeasureThiknessPoint measureThiknessPoint = audit.pisoThiknessForMeasurePoint(thikness, MeasurePoint.create(virola, generatriz, point));

        measureThiknessRepository.persist(measureThiknessPoint);

        return measureThiknessPoint;
    }

    public MeasureThiknessPoint newTechoThikness(final Long auditId, final Integer thikness, final Integer virola, final Integer generatriz, final Integer point) {

        Audit audit = auditRepository.auditOfId(AuditId.builder().setId(auditId).build());

        if (audit == null) {
            throw new IllegalArgumentException("Audit not found by id");
        }

        MeasureThiknessPoint measureThiknessPoint = audit.techoThiknessForMeasurePoint(thikness, MeasurePoint.create(virola, generatriz, point));

        measureThiknessRepository.persist(measureThiknessPoint);

        return measureThiknessPoint;
    }
}
