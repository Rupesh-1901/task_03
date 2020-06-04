package com.example.task_03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
/*import com.google.firebase.auth.FirebaseUser;*/

public class login extends AppCompatActivity {
    EditText emailID, password;
    FirebaseAuth mFirebaseAuth;
    Button button;
    /*Button button2;*/
   public FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mFirebaseAuth = FirebaseAuth.getInstance();
        emailID = findViewById(R.id.editText3);
        password = findViewById(R.id.editText4);
        button = findViewById(R.id.button2);

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if (mFirebaseUser != null) {
                    Toast.makeText(login.this, "you are logged in", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(login.this, dashboard2 .class);
                    startActivity(i);
                } else {
                    Toast.makeText(login.this, "please login", Toast.LENGTH_SHORT).show();
                }


            }


        };
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailID.getText().toString();
                String pwd = password.getText().toString();
                if (email.isEmpty()) {
                    emailID.setError("please enter email id");
                } else if (pwd.isEmpty()) {
                    password.setError("please enter password");
                }
                mFirebaseAuth.createUserWithEmailAndPassword(email, pwd).addOnCompleteListener(login.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {



                        /*Intent login = new Intent(com.example.task_03.login.this, dashboard2.class);
                        startActivity(login);*/

                        if (!task.isSuccessful()) {
                            Toast.makeText(login.this, "login unsuccessful", Toast.LENGTH_SHORT).show();
                        } else {
                            Intent login = new Intent(com.example.task_03.login.this, dashboard.class);
                            startActivity(login);
                        }


                    }
                });
            }

        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }
}
