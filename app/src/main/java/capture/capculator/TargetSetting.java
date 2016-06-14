package capture.capculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class TargetSetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_setting);

        final EditText etTargetCAP = (EditText) findViewById(R.id.etTargetCAP);

        final Button bFinalGradeTargetSetting = (Button) findViewById(R.id.bFinalGradeTargetSetting);

        bFinalGradeTargetSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CAComponentsIntent = new Intent(TargetSetting.this, CAComponents.class);
                TargetSetting.this.startActivity(CAComponentsIntent);

            }
        });

    }
}
