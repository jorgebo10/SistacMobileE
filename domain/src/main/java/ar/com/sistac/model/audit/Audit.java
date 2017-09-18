package ar.com.sistac.model.audit;


import java.util.Date;

import ar.com.sistac.model.audit.checklist.Checklist;
import ar.com.sistac.model.audit.envolvente.EnvolventeMeasurementRecord;
import ar.com.sistac.model.tank.Tank;

public class Audit {
    private Long id;
    private Tank tank;
    private Date auditionDate;
    private Stakeholder auditor;
    private Stakeholder operator;
    private Checklist checklist;
    private EnvolventeMeasurementRecord envolventeMeasurementRecord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Date getAuditionDate() {
        return auditionDate;
    }

    public void setAuditionDate(Date auditionDate) {
        this.auditionDate = auditionDate;
    }

    public Stakeholder getAuditor() {
        return auditor;
    }

    public void setAuditor(Stakeholder auditor) {
        this.auditor = auditor;
    }

    public Stakeholder getOperator() {
        return operator;
    }

    public void setOperator(Stakeholder operator) {
        this.operator = operator;
    }

    public Checklist getChecklist() {
        return checklist;
    }

    public void setChecklist(Checklist checklist) {
        this.checklist = checklist;
    }

    public EnvolventeMeasurementRecord getEnvolventeMeasurementRecord() {
        return envolventeMeasurementRecord;
    }

    public void setEnvolventeMeasurementRecord(EnvolventeMeasurementRecord envolventeMeasurementRecord) {
        this.envolventeMeasurementRecord = envolventeMeasurementRecord;
    }
}
