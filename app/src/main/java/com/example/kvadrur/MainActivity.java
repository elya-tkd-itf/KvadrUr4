package com.example.kvadrur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText koeff_a = findViewById(R.id.KoefA);
        String string_a = koeff_a.getText().toString();
        double a = Double.parseDouble(string_a);
        EditText koeff_b = findViewById(R.id.KoefB);
        String string_b = koeff_b.getText().toString();
        double b = Double.parseDouble(string_b);
        EditText koeff_c = findViewById(R.id.KoefC);
        String string_c = koeff_c.getText().toString();
        double c = Double.parseDouble(string_c);

        double x1, x2;

        if (a == 0)
            x1 = -c/b;
    }
}
