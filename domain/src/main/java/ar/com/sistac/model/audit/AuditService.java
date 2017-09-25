package ar.com.sistac.model.audit;


import java.util.Date;

import javax.inject.Inject;

import ar.com.sistac.model.tank.Tank;
import ar.com.sistac.model.tank.TankId;
import ar.com.sistac.model.tank.TankRepository;

public class AuditService {

    private final TankRepository tankRepository;

    private final AuditRepository auditRepository;

    @Inject
    public AuditService(TankRepository tankRepository, AuditRepository auditRepository) {
        this.tankRepository = tankRepository;
        this.auditRepository = auditRepository;
    }

    public Audit newAudit(final Long aTankId, final Date auditionDate, String name, String surname, String entity) {
        Tank tank = tankRepository.tankOfId(TankId.builder().setId(aTankId).build());

        Audit audit = tank.auditOnDateByAuditor(
                auditionDate,
                Auditor.builder()
                        .name(name)
                        .surname(surname)
                        .entity(entity)
                        .build()
        );

        auditRepository.persist(audit);

        return audit;
    }
}
