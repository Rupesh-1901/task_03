package com.example.task_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class backpaper extends AppCompatActivity {
    Button btn;
    EditText email;
    EditText sub;
    EditText mark;
    DatabaseReference firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backpaper);

        firebaseDatabase = FirebaseDatabase.getInstance().getReference("students");/*getReference("students")*/



        btn=findViewById(R.id.button31);
        email=findViewById(R.id.editText8);
        sub=findViewById(R.id.editText10);
        mark=findViewById(R.id.editText9);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addstudents();

            }
        });
    }
    public void addstudents(){
        String name=email.getText().toString();
        String subject=sub.getText().toString();
        String cgpa=mark.getText().toString();

        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(subject) && !TextUtils.isEmpty(cgpa)){

            String id=firebaseDatabase.push().getKey();
            backpaperstudents backpaperstudents=new backpaperstudents(name,subject,cgpa);
            assert id != null;
            firebaseDatabase.child(id).setValue(backpaperstudents);
            email.setText("");
            sub.setText("");
            mark.setText("");





        }
        else{
            Toast.makeText(backpaper.this,"enter all required fields",Toast.LENGTH_SHORT).show();
        }
    }
}
