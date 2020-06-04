package com.example.task_03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/*import android.widget.TextView;*/
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SplashScreen extends AppCompatActivity {
    EditText emailID , password;
    FirebaseAuth mFirebaseAuth;
    Button button;
    Button button2;
    /*TextView textView;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        mFirebaseAuth = FirebaseAuth.getInstance();
        emailID=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= emailID.getText().toString();
                String pwd=password.getText().toString();
                if (email.isEmpty()){
                    emailID.setError("please enter email id");}
                else if(pwd.isEmpty()){
                    password.setError("please enter password");}
                mFirebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(SplashScreen.this, new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        /*startActivity(new Intent(SplashScreen.this, dashboard2.class));*/


                       if (!(task.isSuccessful())) {
                            Toast.makeText(SplashScreen.this, "sign up unsuccessful", Toast.LENGTH_SHORT).show();
                        } else {
                            startActivity(new Intent(SplashScreen.this, calculator.class));
                        }


                    }
                });
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SplashScreen.this,dashboard2.class);
                startActivity(i);
            }
        });





    }
}
