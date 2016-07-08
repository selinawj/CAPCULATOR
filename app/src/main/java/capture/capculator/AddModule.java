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

import java.util.ArrayList;
import java.util.List;

public class AddModule extends ListActivity {

    ListView semesters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_module);

        /*setting a list of semesters by default*/
        String[] sem = {"YEAR 1 SEMESTER 1", "YEAR 1 SEMESTER 2", "YEAR 2 SEMESTER 1", "YEAR 2 SEMESTER 2", "YEAR 3 SEMESTER 1", "YEAR 3 SEMESTER 2", "YEAR 4 SEMESTER 1", "YEAR 4 SEMESTER 2"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getListView().getContext(), android.R.layout.simple_list_item_1, sem);
        getListView().setAdapter(adapter);
        semesters = this.getListView();
        semesters.setItemsCanFocus(false);
        //onClickAction
        semesters.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long arg3) {
                    Intent intent = new Intent(AddModule.this, AddSemester.class);
                    startActivity(intent);
                }
            });
        }
        /*link to addSemester*/
        //final Button bAddSemester = (Button) findViewById(R.id.bAddSemester);

        //bAddSemester.setOnClickListener(new View.OnClickListener() {
        //@Override
        //    public void onClick(View v) {
        //        Intent addsemesterIntent = new Intent(AddModule.this, AddSemester.class);
        //       AddModule.this.startActivity(addsemesterIntent);

        //    }
        //});
}