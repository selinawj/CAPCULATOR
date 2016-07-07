package capture.capculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyModules extends AppCompatActivity {

    public static final String DEFAULT="N/A";
    TextView moduleView, MCView, gradeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_modules);
        moduleView = (TextView) findViewById(R.id.textView11);
        MCView = (TextView) findViewById(R.id.textView12);
        gradeView = (TextView) findViewById(R.id.textView13);
    }

    public void refresh(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("moduleInfo", Context.MODE_PRIVATE);
        String module = sharedPreferences.getString("module",DEFAULT);
        String MC = sharedPreferences.getString("MC", DEFAULT);
        String grade = sharedPreferences.getString("grade", DEFAULT);

        if (module.equals(DEFAULT) || MC.equals(DEFAULT) || grade.equals(DEFAULT)){
            Toast.makeText(this, "NO MODULES AVAILABLE", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "REFRESHED", Toast.LENGTH_LONG).show();
            moduleView.setText(module);
            MCView.setText(MC);
            gradeView.setText(grade);
        }
    }
}
