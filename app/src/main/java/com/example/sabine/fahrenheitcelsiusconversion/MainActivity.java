package com.example.sabine.fahrenheitcelsiusconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextNumber);
        resultView = (TextView) findViewById(R.id.textViewResult);
    }

    public void calcC(View view) {
        String numString = editText.getText().toString();

        double num = 0;

        try {
            num = Double.parseDouble(numString);

            double result = (num - 32.0) / 1.8;
            resultView.setText("Fahrenheit " + num + " are " + result + " Celsius");
        } catch(NumberFormatException e) {
            resultView.setText("Wrong Input");
            e.printStackTrace();
        }
    }


    public void calcF(View view) {
        String numString = editText.getText().toString();

        double num = 0;

        try {
            num = Double.parseDouble(numString);

            double result = 0;

                result = num * 1.8 + 32;
            resultView.setText("Celsius " + num + " are " + result + " Fahrenheit");
        } catch(NumberFormatException e) {
            resultView.setText("Wrong Input");
            e.printStackTrace();
        }

    }

}
