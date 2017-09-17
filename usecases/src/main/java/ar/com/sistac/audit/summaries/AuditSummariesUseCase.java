package ar.com.sistac.audit.summaries;


import com.annimon.stream.Collectors;
import com.annimon.stream.Stream;

import java.util.List;

import javax.inject.Inject;

import ar.com.sistac.model.audit.Audit;
import ar.com.sistac.model.audit.AuditRepository;


public class AuditSummariesUseCase implements AuditSummariesInputBoundary {
    private AuditRepository auditRepository;

    @Inject
    public AuditSummariesUseCase(final AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }

    @Override
    public void summarize(final AuditSummariesOutputBoundary presenter) {

        final List<Audit> audits = auditRepository.findAudits();

        presenter.setResponseModel(getAuditsSummaries(audits));
    }

    private List<AuditSummaryResponseModel> getAuditsSummaries(final List<Audit> audits) {

        return Stream.of(audits)
                .map(audit -> AuditSummaryResponseModel.builder()
                        .setAuditor(audit.getAuditor())
                        .setAddress(audit.getTank().getAddress())
                        .setCit(audit.getTank().getCit())
                        .setDate(audit.getAuditionDate())
                        .build())
                .collect(Collectors.toList());
    }
}
