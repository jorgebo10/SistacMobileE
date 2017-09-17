package ar.com.sistac.di;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import javax.inject.Singleton;

import ar.com.sistac.data.CupboardDBHelper;
import ar.com.sistac.data.audits.AuditRepositoryCupboardImpl;
import ar.com.sistac.model.audit.AuditRepository;
import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    public AuditRepository provideAuditRepository(final SQLiteDatabase db) {
        return new AuditRepositoryCupboardImpl(db);
    }
    @Provides
    @Singleton
    public SQLiteDatabase provideSQLiteDatabase(final Context context) {
        return new CupboardDBHelper(context).getWritableDatabase();
    }
}