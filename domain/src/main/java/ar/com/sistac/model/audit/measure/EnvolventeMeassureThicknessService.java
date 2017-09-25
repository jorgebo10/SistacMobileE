package ar.com.sistac.model.audit.measure;


import ar.com.sistac.model.audit.Audit;
import ar.com.sistac.model.audit.AuditRepository;

public class EnvolventeMeassureThicknessService extends AbstractMeasureThicknessService {

    public EnvolventeMeassureThicknessService(AuditRepository auditRepository, MeasureThiknessRepository measureThiknessRepository) {
        super(auditRepository, measureThiknessRepository);
    }

    @Override
    protected MeasureThiknessPoint addMeasurePointThicknessToAudit(Audit audit, Integer thikness, MeasurePoint measurePoint) {
        return audit.newEnvolventeThiknessForMeasurePoint(thikness, measurePoint);
    }
}
