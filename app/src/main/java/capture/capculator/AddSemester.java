package capture.capculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddSemester extends AppCompatActivity {

    EditText module;
    EditText MC;
    EditText grade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_semester);
        module = (EditText) findViewById(R.id.etCode1);
        MC = (EditText) findViewById(R.id.etMC1);
        grade = (EditText) findViewById(R.id.etGrade1);
    }

    public void bAddModule(View view)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("ModuleInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("module", module.getText().toString());
        editor.putString("MC", MC.getText().toString());
        editor.putString("grade", grade.getText().toString());

        editor.commit();

        Toast.makeText(this, "MODULE ADDED SUCCESSFULLY", Toast.LENGTH_LONG).show();
    }
}
