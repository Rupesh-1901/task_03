package com.example.task_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*import com.google.firebase.auth.FirebaseAuth;*/

public class dashboard extends AppCompatActivity {
    public Button recorder;

    public Button calculator;
    public Button todolist;
    public Button libraryfine;
    public Button academics;
    public Button timetable;
    /*FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;*/


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        calculator=findViewById(R.id.button5);
        recorder=findViewById(R.id.button6);
        todolist=findViewById(R.id.button10);
        libraryfine=findViewById(R.id.button7);
        academics=findViewById(R.id.button13);
        timetable=findViewById(R.id.button14);


        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(dashboard.this,calculator.class);
                startActivity(i);
            }
        });
        recorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(dashboard.this,recorder.class);
                startActivity(i);
            }
        });
        todolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(dashboard.this,todo.class);
                startActivity(i);
            }
        });
        libraryfine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(dashboard.this,libraryfine.class);
                startActivity(i);
            }
        });
        academics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(dashboard.this,academics.class);
                startActivity(i);
            }
        });
        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(dashboard.this,timetable.class);
                startActivity(i);
            }
        });



    }
}
