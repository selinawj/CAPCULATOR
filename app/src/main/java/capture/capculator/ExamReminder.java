package capture.capculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ExamReminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_reminder);

         /*this is to link buttons to ExamReminderDetails*/
        final Button select = (Button) findViewById(R.id.select);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent details = new Intent(ExamReminder.this, ExamReminderDetails.class);
                ExamReminder.this.startActivity(details);

            }
        });
    }
}
