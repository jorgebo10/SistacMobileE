package ar.com.sistac.di;


import ar.com.sistac.auditSummaries.AuditSummariesFragment;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {AuditSummariesFragmentModule.class})
public interface AuditSummariesFragmentComponent {
    void inject(final AuditSummariesFragment auditSummariesFragment);
}