package com.example.task_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class dashboard2 extends AppCompatActivity {
   public Button logout;
   public Button tools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);
        logout= findViewById(R.id.button4);
        tools=findViewById(R.id.button24);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent logout = new Intent(dashboard2.this,SplashScreen.class);
                startActivity(logout);
            }
        });
        tools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(dashboard2.this,dashboard.class);
                startActivity(i);
            }
        });

    }
}
