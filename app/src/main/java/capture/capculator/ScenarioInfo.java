package capture.capculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class ScenarioInfo extends AppCompatActivity {

    NumberPicker numPicker = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_info);

        numPicker = (NumberPicker)findViewById(R.id.etMCs);
        numPicker.setMaxValue(9);
        numPicker.setMinValue(0);
        numPicker.setWrapSelectorWheel(false);

    }
}
