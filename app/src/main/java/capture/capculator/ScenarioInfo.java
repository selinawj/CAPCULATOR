package capture.capculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.NumberPicker;

public class ScenarioInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_info);


        /*this is to link buttons to CurrentScenario*/
        final Button bNext = (Button) findViewById(R.id.bNext);

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent currentScenario = new Intent(ScenarioInfo.this, CurrentScenario.class);
                ScenarioInfo.this.startActivity(currentScenario);

            }
        });

    }
}
