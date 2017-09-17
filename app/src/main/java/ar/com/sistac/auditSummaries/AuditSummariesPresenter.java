package ar.com.sistac.auditSummaries;


import java.util.List;

import javax.inject.Inject;

import ar.com.sistac.audit.summaries.AuditSummariesOutputBoundary;
import ar.com.sistac.audit.summaries.AuditSummariesUseCase;
import ar.com.sistac.audit.summaries.AuditSummaryResponseModel;

public class AuditSummariesPresenter implements AuditSummariesOutputBoundary {
    private final AuditSummariesUseCase auditSummariesUseCase;
    private AuditSummariesViewModel viewModel;


    @Inject
    public AuditSummariesPresenter(final AuditSummariesUseCase auditSummariesUseCase) {
        this.auditSummariesUseCase = auditSummariesUseCase;
    }

    public AuditSummariesViewModel getViewModel() {
        return viewModel;
    }

    @Override
    public void setResponseModel(final List<AuditSummaryResponseModel> responseModel) {
        this.viewModel = AuditSummariesViewModel.create(responseModel);
    }

    public void summarizeAudits() {
        this.auditSummariesUseCase.summarize(this);
    }
}
