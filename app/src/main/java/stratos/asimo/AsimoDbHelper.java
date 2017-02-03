package stratos.asimo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Shreyansh Khajanchi on 03-02-2017.
 */
/*
class AsimoDbHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    int DATABASE_VERSION = 1;
    String DATABASE_NAME = "profilesdb.db";

    public AsimoDbHelper(Context context, String name, int version) {
        DATABASE_NAME = name;
        DATABASE_VERSION = version;
        AsimoDbHelper(context);
    }
    public AsimoDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("SQL_CREATE_ENTRIES");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL("SQL_DELETE_ENTRIES");
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
} */