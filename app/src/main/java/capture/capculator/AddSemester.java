package capture.capculator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddSemester extends AppCompatActivity {

    private SharedPreferences preferenceSettings;
    private SharedPreferences.Editor preferenceEditor;
    private static final int PREFERENCE_MODE_PRIVATE = 0;

    EditText module;
    EditText MC;
    EditText grade;
    Button bAddMod;

    ArrayList<String> players=new ArrayList<String>();

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_semester);
        module = (EditText) findViewById(R.id.etCode1);
        MC = (EditText) findViewById(R.id.etMC1);
        grade = (EditText) findViewById(R.id.etGrade1);
        bAddMod =(Button) findViewById(R.id.bAddModule);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,players);
        final DBAdapter db=new DBAdapter(this);

        /*onclick for add mod button*/
        //EVENTS
        bAddMod.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //OPEN
                db.openDB();

                //INSERT
                long result=db.add(module.getText().toString(), MC.getText().toString(), grade.getText().toString());

                if(result > 0)
                {
                    module.setText("");
                    MC.setText("");
                    grade.setText("");
                    Toast.makeText(AddSemester.this, "MODULE ADDED SUCCESSFULLY", Toast.LENGTH_LONG).show();
                }else
                {
                    Toast.makeText(getApplicationContext(), "Failure", Toast.LENGTH_SHORT).show();
                }


                //CLOSE DB
                db.close();
            }
        });

        /*this is to link buttons to MyModules*/
        final Button next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewMods = new Intent(AddSemester.this, MyModules.class);
                AddSemester.this.startActivity(viewMods);
            }
        });


    }

    /*this is to store modular info into ModuleInfo.xml on android sharedPreferences*/
    //public void bAddModule(View view) {

      //  preferenceSettings = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
      //  preferenceEditor = preferenceSettings.edit();

      //  preferenceEditor.putString("module", module.getText().toString());
      //  preferenceEditor.putString("MC", MC.getText().toString());
      //  preferenceEditor.putString("grade", grade.getText().toString());

      // preferenceEditor.commit();
      // Toast.makeText(this, "MODULE ADDED SUCCESSFULLY", Toast.LENGTH_LONG).show();
}
