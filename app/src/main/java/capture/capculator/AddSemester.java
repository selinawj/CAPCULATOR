package capture.capculator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
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

    public void bAddModule(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("ModuleInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("module", module.getText().toString());
        editor.putString("MC", MC.getText().toString());
        editor.putString("grade", grade.getText().toString());

        editor.commit();

        Toast.makeText(this, "MODULE ADDED SUCCESSFULLY", Toast.LENGTH_LONG).show();
    }
}
