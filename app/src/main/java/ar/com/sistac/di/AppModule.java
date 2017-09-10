package ar.com.sistac.di;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import ar.com.sistac.SistacApplication;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final SistacApplication app;

    public AppModule(final SistacApplication app) {
        this.app = app;
    }

    @Provides
    @Singleton
    protected Application provideApplication() {
        return app;
    }

    @Provides
    @Singleton
    protected Resources provideResources() {
        return app.getResources();
    }

    @Provides
    @Singleton
    protected Context provideContext() {
        return app.getApplicationContext();
    }
}
