package capture.capculator;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;

public class AddModule extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_module);

        String[] sem = {"Year 1 Semester 1", "Year 1 Semester 2"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getListView().getContext(), android.R.layout.simple_list_item_1, sem);
        getListView().setAdapter(adapter);

        /*link to addSemester*/
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
