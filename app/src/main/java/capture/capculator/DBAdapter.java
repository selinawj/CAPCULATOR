package capture.capculator;

/**
 * Created by Selina on 10/7/16.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class DBAdapter {

    //COLUMNS
    static final String ROWID="id";
    static final String MODULECODE = "moduleCode";
    static final String MC = "MC";
    static final String GRADE = "grade";

    //DB PROPERTIES
    static final String DBNAME="m_DB";
    static final String TBNAME="m_TB";
    static final int DBVERSION='1';

    static final String CREATE_TB="CREATE TABLE m_TB(id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "moduleCode TEXT NOT NULL,mc TEXT NOT NULL,grade TEXT NOT NULL);";

    final Context c;
    SQLiteDatabase db;
    DBHelper helper;

    public DBAdapter(Context ctx) {
        // TODO Auto-generated constructor stub

        this.c=ctx;
        helper=new DBHelper(c);
    }

    // INNER HELPER DB CLASS
    private static class DBHelper extends SQLiteOpenHelper
    {

        public DBHelper(Context context	) {
            super(context, DBNAME, null, DBVERSION);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            try
            {
                db.execSQL(CREATE_TB);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // TODO Auto-generated method stub

            Log.w("DBAdapetr","Upgrading DB");

            db.execSQL("DROP TABLE IF EXISTS m_TB");

            onCreate(db);
        }

    }

    // OPEN THE DB
    public DBAdapter openDB()
    {
        try
        {
            db=helper.getWritableDatabase();

        }catch(SQLException e)
        {
            Toast.makeText(c, e.getMessage(), Toast.LENGTH_LONG).show();
        }

        return this;
    }


    //CLOSE THE DB
    public void close()
    {
        helper.close();
    }

    //INSERT INTO TABLE
    public long add(String name,String cred,String res)
    {
        try
        {
            ContentValues cv=new ContentValues();
            cv.put(MODULECODE, name);
            cv.put(MC, cred);
            cv.put(GRADE,res);

            Module moduleInfo = new Module(name,cred,res);//instantiate a module object

            return db.insert(TBNAME, ROWID, cv);

        }catch(SQLException e)
        {
            e.printStackTrace();
        }

        return 0;
    }

    //GET ALL VALUES

    public Cursor getAllNames()
    {
        String[] columns={ROWID,MODULECODE,MC,GRADE};

        return db.query(TBNAME, columns, null, null, null, null, null);
    }
}
