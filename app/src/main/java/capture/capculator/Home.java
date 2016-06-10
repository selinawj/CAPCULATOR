package capture.capculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ImageView center = (ImageView) findViewById(R.id.center);

        final ImageButton bAddModule = (ImageButton) findViewById(R.id.bAddModule);

        bAddModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addmoduleIntent = new Intent(Home.this, AddModule.class);
                Home.this.startActivity(addmoduleIntent);

            }
        });

        final ImageButton bProgressChart = (ImageButton) findViewById(R.id.bProgressChart);

        bProgressChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent progresschartIntent = new Intent(Home.this, ProgressChart.class);
                Home.this.startActivity(progresschartIntent);

            }
        });

        final ImageButton bTargetSetting = (ImageButton) findViewById(R.id.bTargetSetting);

        bTargetSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent targetsettingIntent = new Intent(Home.this, TargetSetting.class);
                Home.this.startActivity(targetsettingIntent);

            }
        });

        final ImageButton bModuleList = (ImageButton) findViewById(R.id.bModuleList);

        bModuleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent modulelistIntent = new Intent(Home.this, ModuleList.class);
                Home.this.startActivity(modulelistIntent);

            }
        });

        final ImageButton bScenarioList = (ImageButton) findViewById(R.id.bScenarioList);

        bScenarioList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scenariolistIntent = new Intent(Home.this, ScenarioList.class);
                Home.this.startActivity(scenariolistIntent);

            }
        });

        final ImageButton bExamReminder = (ImageButton) findViewById(R.id.bExamReminder);

        bExamReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scenariolistIntent = new Intent(Home.this, ExamReminder.class);
                Home.this.startActivity(scenariolistIntent);

            }
        });


        final TextView tvAddModule = (TextView) findViewById(R.id.tvAddModule);
        final TextView tvProgressChart = (TextView) findViewById(R.id.tvProgressChart);
        final TextView tvTargetSetting = (TextView) findViewById(R.id.tvTargetSetting);
        final TextView tvModuleList = (TextView) findViewById(R.id.tvModuleList);
        final TextView tvScenarioList = (TextView) findViewById(R.id.tvScenarioList);
        final TextView tvExamReminder = (TextView) findViewById(R.id.tvExamReminder);

    }
}
