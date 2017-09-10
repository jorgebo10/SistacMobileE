package ar.com.sistac.di;

import ar.com.sistac.informeSummaries.InformeSummariesFragment;
import dagger.Module;
import dagger.Provides;

@Module
public class InformeSummariesFragmentModule {
    private final InformeSummariesFragment informeSummariesFragment;

    public InformeSummariesFragmentModule(final InformeSummariesFragment informeSummariesFragment) {
        this.informeSummariesFragment = informeSummariesFragment;
    }

    @Provides
    @ActivityScope
    public InformeSummariesFragment provideInformeSummariesFragment() {
        return informeSummariesFragment;
    }
}
