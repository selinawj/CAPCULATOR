package capture.capculator;

import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by ASUS on 11/6/2016.
 */
public class GradesCompiler {

    public GradesCompiler {

    }

    public static List<Double[]> getValues(View view) {

        List<Double> mcList = new ArrayList<Double>();
        List<Double> gradeList = new ArrayList<Double>();
        List<Double[]> finalList = new ArrayList<Double[]>();

        int[] mcArray = {
                R.id.Semester1MC1,
                R.id.Semester1MC2,
                R.id.Semester1MC3,
                R.id.Semester1MC4,
                R.id.Semester1MC5,
                R.id.Semester1MC6,
                R.id.Semester1MC7,
                R.id.Semester1MC8
        };

        int[] gradeArray = {
                R.id.Semester1Grade1,
                R.id.Semester1Grade2,
                R.id.Semester1Grade3,
                R.id.Semester1Grade4,
                R.id.Semester1Grade5,
                R.id.Semester1Grade6,
                R.id.Semester1Grade7,
                R.id.Semester1Grade8
        };

        for (int gradeID : mcArray) {

            EditText etMCText = (EditText) view.findViewById(mcID);
            String sMCString = etMCText.getText().toString();
            double mc;

            if (sMCString.trim().equals("")) {
                mc = 0.0;
            } else {
                mc = Double.parseDouble(sMCString);
            }

            mcList.add(mc);

        }

        for (int gradeID : gradeArray) {

            EditText etGradeText = (EditText) view.findViewById(gradeID);
            String sGradeString = etGradeText.getText().toString();
            double grade;

            if (sGradeString.trim().equals("")) {
                grade = 0.0;
            } else {
                grade = Double.parseDouble(sGradeString);
            }

            gradeList.add(grade);

        }

        int i = 0;
        while (i < 10) {
            Double[] array = {mcList.get(i), gradeList.get(i)};
            finalList.add(array);
            i++;
        }

        return finalList;

    }

}
