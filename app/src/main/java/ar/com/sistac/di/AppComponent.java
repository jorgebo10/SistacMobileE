package ar.com.sistac.di;


import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, RepositoryModule.class})
public interface AppComponent {
    AuditSummariesFragmentComponent plus(final AuditSummariesFragmentModule module);
    Application application();
}
