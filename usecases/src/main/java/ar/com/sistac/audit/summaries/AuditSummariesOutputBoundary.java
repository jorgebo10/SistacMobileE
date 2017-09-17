package ar.com.sistac.audit.summaries;


import java.util.List;

public interface AuditSummariesOutputBoundary {
    void setResponseModel(final List<AuditSummaryResponseModel> auditSummaryResponseModels);
}
