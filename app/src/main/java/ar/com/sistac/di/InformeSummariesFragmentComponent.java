package ar.com.sistac.di;


import ar.com.sistac.informeSummaries.InformeSummariesFragment;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {InformeSummariesFragmentModule.class})
public interface InformeSummariesFragmentComponent {
    void inject(final InformeSummariesFragment informeListFragment);
}