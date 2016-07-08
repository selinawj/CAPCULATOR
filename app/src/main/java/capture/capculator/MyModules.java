package capture.capculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyModules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_modules);

        /*loads module data from AddSemester and displays them*/
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        TextView moduleView = (TextView) findViewById(R.id.textView11);
        TextView MCView = (TextView) findViewById(R.id.textView12);
        TextView gradeView = (TextView) findViewById(R.id.textView13);

        String mod = sharedPreferences.getString("module", "missing");
        String cred = sharedPreferences.getString("MC", "missing");
        String result = sharedPreferences.getString("grade", "missing");
        moduleView.setText(mod);
        MCView.setText(cred);
        gradeView.setText(result);

    }

    /*this is to view all the stored module info from sharedPreferences*/
    public void refresh(View view) {
        Toast.makeText(this, "REFRESHED", Toast.LENGTH_LONG).show();
    }
}
