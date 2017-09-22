package ar.com.sistac.model.audit;

import java.util.List;

public interface AuditRepository {
    List<Audit> findAudits();

    void persist(Audit audit);

    Audit auditOfId(AuditId  auditId);
}
