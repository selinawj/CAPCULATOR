package capture.capculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScenarioList extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_list);

        /*this is to link buttons to another Activity*/
        final ImageButton bAddScenario = (ImageButton) findViewById(R.id.bAddScenario);

        bAddScenario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scenarioInfoIntent = new Intent(ScenarioList.this, ScenarioInfo.class);
                ScenarioList.this.startActivity(scenarioInfoIntent);

            }
        });

        final TextView tvAddScenario = (TextView) findViewById(R.id.tvAddScenario);

    }

}
