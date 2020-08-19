package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com. example.IntentsProj.MESSAGE";

    EditText number1,number2;
    int num1,num2;
    String st1,st2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                number1 = (EditText) findViewById(R.id.number1);
                number2 = (EditText) findViewById(R.id.number2);
                st1 = number1.getText().toString();
                st2 = number2.getText().toString();



                i.putExtra("Value1",st1);
                i.putExtra("Value2",st2);


                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
                toast.setGravity(Gravity.TOP| Gravity.LEFT, 0, 0);


                startActivity(i);
                finish();

            }
        });


    }
}