package com.example;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import ar.com.sistac.model.audit.Audit;
import ar.com.sistac.model.audit.AuditRepository;

@Dao
public interface AuditRepositoryImpl extends AuditRepository {
    @Override
    @Query("SELECT * FROM auditTable")
    List<Audit> findAudits();

    @Override
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAudits(final Audit... audits);
}
