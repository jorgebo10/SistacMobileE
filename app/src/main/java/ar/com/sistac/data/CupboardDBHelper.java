package ar.com.sistac.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import ar.com.sistac.entities.Informe;

import static nl.qbusict.cupboard.CupboardFactory.cupboard;

public class CupboardDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "sistacMobile.db";
    private static final int DATABASE_VERSION = 1;

    static {
        // register our models
        cupboard().register(Informe.class);
    }

    public CupboardDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // this will ensure that all tables are created
        cupboard().withDatabase(db).createTables();
        // add indexes and other database tweaks
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this will upgrade tables, adding columns and new tables.
        // Note that existing columns will not be converted
        cupboard().withDatabase(db).upgradeTables();
        // do migration work
    }
}