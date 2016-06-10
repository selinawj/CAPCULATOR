package capture.capculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;

public class ScenarioList extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_list);
    }

    /*this is to link buttons to another Activity*/
    final ImageButton addScenario = (ImageButton) findViewById(R.id.addScenario);

    addScenario.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent scenarioInfoIntent = new Intent(ScenarioList.this, ScenarioInfo.class);
            ScenarioList.this.startActivity(scenarioInfoIntent);

        }
    });
}
