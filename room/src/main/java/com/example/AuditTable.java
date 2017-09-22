package com.example;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "audits", foreignKeys = @ForeignKey(entity = TankTable.class,
        parentColumns = "id",
        childColumns = "tank_id"))
public class AuditTable {
    @PrimaryKey
    private Long id;

    @ColumnInfo(name = "tank_id")
    private Long tankId;
    private Date auditionDate;
    private String auditorName;
    private String auditorSurname;
    private Long checklistId;
    private Long envolventeMeasurementRecordId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTankId() {
        return tankId;
    }

    public void setTankId(Long tankId) {
        this.tankId = tankId;
    }

    public Date getAuditionDate() {
        return auditionDate;
    }

    public void setAuditionDate(Date auditionDate) {
        this.auditionDate = auditionDate;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getAuditorSurname() {
        return auditorSurname;
    }

    public void setAuditorSurname(String auditorSurname) {
        this.auditorSurname = auditorSurname;
    }

    public Long getChecklistId() {
        return checklistId;
    }

    public void setChecklistId(Long checklistId) {
        this.checklistId = checklistId;
    }

    public Long getEnvolventeMeasurementRecordId() {
        return envolventeMeasurementRecordId;
    }

    public void setEnvolventeMeasurementRecordId(Long envolventeMeasurementRecordId) {
        this.envolventeMeasurementRecordId = envolventeMeasurementRecordId;
    }
}
