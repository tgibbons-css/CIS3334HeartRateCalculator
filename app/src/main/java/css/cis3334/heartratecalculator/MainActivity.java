package css.cis3334.heartratecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAge;
    Spinner spinnerExerLevel;
    TextView tvLowerRate, tvUpperRate;

    HeartHealthCalculator heartCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAge = (EditText) findViewById(R.id.editTextAge);
        spinnerExerLevel = (Spinner) findViewById(R.id.spinnerExerciseLevel);
        tvLowerRate = (TextView) findViewById(R.id.textViewLowerHeartrate);
        tvUpperRate = (TextView) findViewById(R.id.textViewUpperHeartRate);
    }

    public void onClickCalcButton(View view) {



    }
}
