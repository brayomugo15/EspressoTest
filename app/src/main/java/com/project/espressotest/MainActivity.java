package com.project.espressotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum1, txtNum2;
    private Button btnAdd;
    private TextView tvSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set


        // find view by id
        txtNum1 = findViewById(R.id.txt_num1);
        txtNum2 = findViewById(R.id.txt_num2);
        btnAdd = findViewById(R.id.btn_add);
        tvSum = findViewById(R.id.tv_sum);

        // set / load data


        // listeners
        btnAdd.setOnClickListener(addListener);

    }

    private View.OnClickListener addListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String number1 = txtNum1.getText().toString().trim();
            String number2 = txtNum2.getText().toString().trim();

            if (number1.isEmpty() && number2.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Empty text fields", Toast.LENGTH_SHORT).show();
            } else {
                int num1 = Integer.parseInt(number1);
                int num2 = Integer.parseInt(number2);

                int total = num1 + num2;

                tvSum.setText(String.valueOf(total));
            }
        }
    };
}