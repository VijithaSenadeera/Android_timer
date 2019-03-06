package lk.ac.kln.android_timer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDown();
    }


    private void countDown(){

        final TextView text_count = findViewById(R.id.text_count);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
                         @Override
                         public void run() {
                             text_count.setText(Integer.toString(counter));
                             counter--;
                             handler.postDelayed(this, 1000);
                         }
                     }
        );
    }
}
