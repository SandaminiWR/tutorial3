package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView result,tv1,tv2;
    Button add,subtract,multiply,divide;
    String st1,st2;


    float result_num;
    int num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);

        st1 = getIntent().getExtras().getString("Value1");
        tv1.setText(st1);
        st2 = getIntent().getExtras().getString("Value2");
        tv2.setText(st2);

        result = (TextView) findViewById(R.id.Result);


        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(tv1.getText().toString());
                num2 = Integer.parseInt(tv2.getText().toString());
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));

            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(tv1.getText().toString());
                num2 = Integer.parseInt(tv2.getText().toString());
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(tv1.getText().toString());
                num2 = Integer.parseInt(tv2.getText().toString());
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(tv1.getText().toString());
                num2 = Integer.parseInt(tv2.getText().toString());
                result_num = num1 / num2;
                result.setText(String.valueOf(result_num));

            }
        });


    }
}