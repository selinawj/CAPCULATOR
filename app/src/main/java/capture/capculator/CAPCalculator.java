package capture.capculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by ASUS on 11/6/2016.
 */
public class CAPCalculator extends Fragment {

    public static final String ARG_SECTION_NUMBER = "section_number";

    public CAPCalculator() {
    }

    @Override
    public View onCreateView(
                LayoutInflater inflater,
                ViewGroup container,
                Bundle savedInstanceState) {
            return inflater.inflate(R.layout.activity_home,container, false);
        }

    public void sendToCalculate() {

        CAPCalculator calculator = new CAPCalculator();
        Double calc = calculator.calculate(compiler.getValues(getView()));
        DecimalFormat df = new DecimalFormat("###.##");
        String calculation = df.format(calc);
        TextView view1 = (TextView) getView().findViewById(R.id.totalGrade);
        view1.setTextSize(20);
        view1.setText("Your CAP is " + calculation + ".");

    }

}
