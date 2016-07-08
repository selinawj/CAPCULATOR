package capture.capculator;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class AddModule extends ListActivity {

    ListView semesters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_module);

        /*setting a list of semesters by default*/
        String[] sem = {"Year 1 Semester 1", "Year 1 Semester 2", "Year 2 Semester 1", "Year 2 Semester 2", "Year 3 Semester 1", "Year 3 Semester 2", "Year 4 Semester 1", "Year 4 Semester 2", "Year 5 Semester 1", "Year 5 Semester 2"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getListView().getContext(), android.R.layout.simple_list_item_1, sem);
        getListView().setAdapter(adapter);

        /*onClick function*/
        semesters = this.getListView();
        semesters.setItemsCanFocus(false);
        semesters.setOnItemClickListener( new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView , View view , int position ,long arg3)
            {
                Intent intent = new Intent(AddModule.this, AddSemester.class);
                startActivity(intent);
            }
        });

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
