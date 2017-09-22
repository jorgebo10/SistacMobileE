package ar.com.sistac.model.audit;


import java.util.Date;

import ar.com.sistac.model.audit.checklist.Checklist;
import ar.com.sistac.model.audit.measure.MeasurePoint;
import ar.com.sistac.model.audit.measure.MeasureThiknessPoint;
import ar.com.sistac.model.tank.TankId;

import static ar.com.sistac.model.audit.measure.ThicknessType.ENVOLVENTE;
import static ar.com.sistac.model.audit.measure.ThicknessType.PISO;
import static ar.com.sistac.model.audit.measure.ThicknessType.TECHO;

public class Audit {
    private AuditId auditId;
    private TankId tankId;
    private Date auditionDate;
    private Auditor auditor;
    private Checklist checklist;
    //auditspec    private Integer maxGeneratrices;
    private Integer maxVirolas;
    private Integer maxGeneratrices;
    private Integer maxMeasureNumber;
    private Integer maxPisoMeasureNumber;
    private Integer maxPisoSheet;
    private Integer maxTechoMeasureNumber;
    private Integer maxTechoSheet;


    public Audit(final TankId tankId, final Date date, final Auditor auditor) {
        this.tankId = tankId;
        this.auditionDate = date;
        this.auditor = auditor;
    }

    public AuditId getAuditId() {
        return auditId;
    }

    public MeasureThiknessPoint envolventeThiknessForMeasurePoint(final Integer thikness, final MeasurePoint measurePoint) {

        if (measurePoint.generatrizNumber() > maxGeneratrices)  {
            throw new IllegalArgumentException("Genetriz number is grater than allowed");
        }

        if (measurePoint.virolaNumber() > maxVirolas)  {
            throw new IllegalArgumentException("Virola number is grater than allowed");
        }

        if (measurePoint.measureNumber() > maxMeasureNumber)  {
            throw new IllegalArgumentException("measureNumber number is grater than allowed");
        }

        return new MeasureThiknessPoint(auditId, ENVOLVENTE, measurePoint, thikness);
    }

    public MeasureThiknessPoint pisoThiknessForMeasurePoint(final Integer thikness, final MeasurePoint measurePoint) {

        if (measurePoint.virolaNumber() > maxPisoSheet)  {
            throw new IllegalArgumentException("Piso sheet number is grater than allowed");
        }

        if (measurePoint.measureNumber() > maxPisoMeasureNumber)  {
            throw new IllegalArgumentException("measureNumber number is grater than allowed");
        }

        return new MeasureThiknessPoint(auditId, PISO, measurePoint, thikness);
    }

    public MeasureThiknessPoint techoThiknessForMeasurePoint(final Integer thikness, final MeasurePoint measurePoint) {

        if (measurePoint.virolaNumber() > maxTechoSheet)  {
            throw new IllegalArgumentException("Techo sheet number is grater than allowed");
        }

        if (measurePoint.measureNumber() > maxTechoMeasureNumber)  {
            throw new IllegalArgumentException("measureNumber number is grater than allowed");
        }

        return new MeasureThiknessPoint(auditId, TECHO, measurePoint, thikness);
    }

    public Date getAuditionDate() {
        return auditionDate;
    }

    public void setAuditionDate(Date auditionDate) {
        this.auditionDate = auditionDate;
    }

    public Auditor getAuditor() {
        return auditor;
    }

    public void setAuditor(Auditor auditor) {
        this.auditor = auditor;
    }

    public Checklist getChecklist() {
        return checklist;
    }

    public void setChecklist(Checklist checklist) {
        this.checklist = checklist;
    }
}
