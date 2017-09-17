package ar.com.sistac.di;

import ar.com.sistac.auditSummaries.AuditSummariesFragment;
import dagger.Module;
import dagger.Provides;

@Module
public class AuditSummariesFragmentModule {
    private final AuditSummariesFragment auditSummariesFragment;

    public AuditSummariesFragmentModule(final AuditSummariesFragment auditSummariesFragment) {
        this.auditSummariesFragment = auditSummariesFragment;
    }

    @Provides
    @ActivityScope
    public AuditSummariesFragment provideInformeSummariesFragment() {
        return auditSummariesFragment;
    }
}
