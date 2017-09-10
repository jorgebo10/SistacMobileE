package ar.com.sistac;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import ar.com.sistac.di.AppComponent;
import ar.com.sistac.di.AppModule;
import ar.com.sistac.di.DaggerAppComponent;


public class SistacApplication extends Application {
    private static AppComponent appComponent;
    private static SistacApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initAppComponents();
    }

    private void initAppComponents() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static SistacApplication get(final Context context) {
        return (SistacApplication) context.getApplicationContext();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public static SistacApplication get(Activity activity) {
        return (SistacApplication) activity.getApplication();
    }
}