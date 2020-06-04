package com.example.task_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mainactivity2 extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    Button button;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    String p1;
    String p2;
    String p3;
    String p4;
    String p5;
    String p6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2);

        editText1=findViewById(R.id.editText13);
        editText2=findViewById(R.id.editText14);
        editText3=findViewById(R.id.editText15);
        editText4=findViewById(R.id.editText16);
        editText5=findViewById(R.id.editText9);
        editText6=findViewById(R.id.editText17);
        button=findViewById(R.id.button39);
        textView1=findViewById(R.id.textView18);
        textView2=findViewById(R.id.textView22);
        textView3=findViewById(R.id.textView21);
        textView4=findViewById(R.id.textView19);
        textView5=findViewById(R.id.textView20);
        textView6=findViewById(R.id.textView17);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1 = editText1.getText().toString().trim();
                textView1.setText(p1);

                p2 = editText2.getText().toString().trim();
                textView2.setText(p2);

                p3 = editText3.getText().toString().trim();
                textView3.setText(p3);

                p4 = editText4.getText().toString().trim();
                textView4.setText(p4);

                p5 = editText5.getText().toString().trim();
                textView5.setText(p5);

                p6 = editText6.getText().toString().trim();
                textView6.setText(p6);


            }
        });



        }
        }


