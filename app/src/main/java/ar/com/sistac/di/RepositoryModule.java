package ar.com.sistac.di;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import javax.inject.Singleton;

import ar.com.sistac.data.CupboardDBHelper;
import ar.com.sistac.data.informes.InformeRepositoryCupboardImpl;
import ar.com.sistac.repositories.InformeRepository;
import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    public InformeRepository provideInformeRepository(final SQLiteDatabase db) {
        return new InformeRepositoryCupboardImpl(db);
    }
    @Provides
    @Singleton
    public SQLiteDatabase provideSQLiteDatabase(final Context context) {
        return new CupboardDBHelper(context).getWritableDatabase();
    }
}