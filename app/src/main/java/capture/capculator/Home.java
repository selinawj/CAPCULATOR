package capture.capculator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Comment;

import java.util.Map;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView capView = (TextView) findViewById(R.id.capView);

        final DBAdapter db = new DBAdapter(this);//this line
        db.openDB();
        //RETRIEVE
        Cursor c = db.getAllNames();//this line

        while (c.moveToNext()) {

            String code = c.getString(1);
            String mc = c.getString(3);
            String grade = c.getString(2);
            /*double finalGrade = calculatorFinal(grade, mc);
            capView.setText(Double.toString(finalGrade));*///SELINA
            capView.setText(grade);
        }


        final ImageButton bTargetSetting = (ImageButton) findViewById(R.id.bTargetSetting);

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
                Intent modulelistIntent = new Intent(Home.this, MyModules.class);
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
                Intent examReminderIntent = new Intent(Home.this, ExamReminder.class);
                Home.this.startActivity(examReminderIntent);

            }
        });


        final TextView tvAddModule = (TextView) findViewById(R.id.tvAddModule);
        final TextView tvProgressChart = (TextView) findViewById(R.id.tvProgressChart);
        final TextView tvTargetSetting = (TextView) findViewById(R.id.tvTargetSetting);
        final TextView tvModuleList = (TextView) findViewById(R.id.tvModuleList);
        final TextView tvScenarioList = (TextView) findViewById(R.id.tvScenarioList);
        final TextView tvExamReminder = (TextView) findViewById(R.id.tvExamReminder);
        }

        public double convertGrade(String cap) {

            double numCap = 0.00;

            if (cap == "A+") {

                numCap = 5.00;

            } else if (cap == "A") {

                numCap = 5.00;

            } else if (cap == "A-") {

                numCap = 4.50;

            } else if (cap == "B+") {

                numCap = 4.00;

            } else if (cap == "B") {

                numCap = 3.50;

            } else if (cap == "B-") {

                numCap = 3.00;

            } else if (cap == "C+") {

                numCap = 2.50;

            } else if (cap == "C") {

                numCap = 2.00;

            } else if (cap == "D+") {

                numCap = 1.50;

            } else if (cap == "D") {

                numCap = 1.00;

            } else {

                numCap = 0.00;

            }

            return numCap;

        }



        public double convertMC(String mc) {

            double numMC = 0.00;

            if (mc == "S") {

                numMC = 0.00;

            } else if (mc == "U") {

                numMC = 0.00;

            }

            return numMC;
        }


        public double calculatorNumerator(String grade, String mc) {

            double counter = 0.00;

            /*while (c.moveToNext()) {

                counter = counter + Double.parseDouble(c.getString(2)) * convertGrade(c.getString(3));

            }*///SELINA

            return counter;
        }

        public double calculatorDenominator(String grade, String mc) {

            double counter = 0.00;

            /*while (c.moveToNext()) {

                counter = counter + convertMC(c.getString(2));

            }*///SELINA

            return counter;

        }

        public double calculatorFinal(String grade, String mc) {

            return calculatorNumerator(grade, mc)/calculatorDenominator(grade, mc);

            /*
            double finalCAP = calculatorNumerator(grade, mc)/calculatorDenominator(grade, mc);

            capView.setText(Double.toString(finalCAP));
            *///SELINA

        }

}
