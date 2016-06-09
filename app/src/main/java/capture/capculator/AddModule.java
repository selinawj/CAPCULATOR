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

        final Button bCAComponents = (Button) findViewById(R.id.bCAComponents);

        bCAComponents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cacomponentsIntent = new Intent(AddModule.this, CAComponents.class);
                AddModule.this.startActivity(cacomponentsIntent);

            }
        });


    }
}
