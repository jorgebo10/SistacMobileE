package ar.com.sistac.model.audit;

import java.util.List;

public interface AuditRepository {
    List<Audit> findAudits();
}
