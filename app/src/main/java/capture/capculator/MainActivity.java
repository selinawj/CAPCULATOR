package capture.capculator;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //display the logo during 2 seconds
        new CountDownTimer(2000,1000){
            @Override
            public void onTick(long millisUntilFinished){}

            @Override
            public void onFinish(){
                //set the new Content of your activity
                MainActivity.this.setContentView(R.layout.activity_home);
            }
        }.start();
    }

    /*this is to link buttons to another Activity*/
    //public void buttonOnClick(View v){
      //  Button button = (Button) v;
        //startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    //}
}
