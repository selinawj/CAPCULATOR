package capture.capculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AddModule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_module);

        final Button bAddSemester = (Button) findViewById(R.id.bAddSemester);

        bAddSemester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addsemesterIntent = new Intent(AddModule.this, AddSemester.class);
                AddModule.this.startActivity(addsemesterIntent);

            }
        });


    }
}
