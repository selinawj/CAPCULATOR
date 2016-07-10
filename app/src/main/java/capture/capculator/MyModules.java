package capture.capculator;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyModules extends ListActivity {

    ArrayAdapter<String> adapter;
    ArrayList<String> players = new ArrayList<String>();
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_modules);

        /*loads module data from AddSemester and displays them*/
        //SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        //TextView moduleView = (TextView) findViewById(R.id.textView11);
        //TextView MCView = (TextView) findViewById(R.id.textView12);
        //TextView gradeView = (TextView) findViewById(R.id.textView13);

        //String mod = sharedPreferences.getString("module", "missing");
        //String cred = sharedPreferences.getString("MC", "missing");
        //String result = sharedPreferences.getString("grade", "missing");
        //moduleView.setText(mod);
        //MCView.setText(cred);
        //gradeView.setText(result);

        lv = this.getListView();
        lv.setBackgroundColor(Color.LTGRAY);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,players);
        final DBAdapter db=new DBAdapter(this);

        players.clear();

        //OPEN
        db.openDB();

        //RETRIEVE
        Cursor c=db.getAllNames();

        while(c.moveToNext())
        {
            String name=c.getString(1);
            String mc = c.getString(2);
            players.add(name);
            players.add(mc);
        }

        lv.setAdapter(adapter);

        db.close();

    }

    /*this is to view all the stored module info from sharedPreferences*/
    public void refresh(View view) {
        Toast.makeText(this, "REFRESHED", Toast.LENGTH_LONG).show();
    }
}
