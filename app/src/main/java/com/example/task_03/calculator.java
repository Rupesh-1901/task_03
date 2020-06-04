package com.example.task_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculator extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btndiv,btnmul,btndot,btnclear,btnequal;
    EditText ed1;
    float res1,res2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnadd=(Button)findViewById(R.id.plusbtn);
        btnsub=(Button)findViewById(R.id.minusbtn);
        btnmul=(Button)findViewById(R.id.mulbtn);
        btndiv=(Button)findViewById(R.id.divbtn);
        btnclear=(Button)findViewById(R.id.clear);
        btndot=(Button)findViewById(R.id.btn_);
        btnequal=(Button)findViewById(R.id.equalbtn);
        ed1=(EditText)findViewById(R.id.editText5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1== null){
                    ed1.setText(" ");}
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    add=true;
                    ed1.setText(null);
                }

            }

        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1== null){
                    ed1.setText(" ");}
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    sub=true;
                    ed1.setText(null);
                }

            }

        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1== null){
                    ed1.setText(" ");}
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    mul=true;
                    ed1.setText(null);
                }

            }

        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1== null){
                    ed1.setText(" ");}
                else{
                    res1=Float.parseFloat(ed1.getText()+"");
                    div=true;
                    ed1.setText(null);
                }

            }

        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2=Float.parseFloat(ed1.getText()+"");
                if(add==true){
                    ed1.setText(res1+res2+"");
                    add=false;
                }
                if(sub==true){
                    ed1.setText(res1-res2+"");
                    sub=false;
                }
                if(mul==true){
                    ed1.setText(res1*res2+"");
                    mul=false;
                }
                if(div==true){
                    ed1.setText(res1/res2+"");
                    div=false;
                }


            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });


    }
}
