package com.example;

import android.arch.persistence.room.TypeConverter;

import ar.com.sistac.model.audit.Audit;

public class Converters {

    @TypeConverter
    public static AuditTable auditToAuditTable(Audit audit) {
        AuditTable auditTable = new AuditTable();
        auditTable.setId(audit.getId());
        auditTable.setAuditionDate(audit.getAuditionDate());
        auditTable.setAuditorName(audit.getAuditor().name());
        auditTable.setAuditorSurname(audit.getAuditor().surname());
        return auditTable;
    }
}