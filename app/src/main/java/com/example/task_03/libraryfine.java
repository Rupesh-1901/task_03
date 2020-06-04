package com.example.task_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/*import android.widget.Toast;*/

import java.text.DecimalFormat;

import static android.widget.Toast.*;

public class libraryfine extends AppCompatActivity {
     EditText editText;
     Button btn;
     TextView textView;
     DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libraryfine);
        btn=findViewById(R.id.button12);
        editText=findViewById(R.id.editText7);
        textView=findViewById(R.id.textView8);

        /*textView.setVisibility(View.GONE);*/
        formatter = new DecimalFormat("#0.0");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( editText.getText().toString().isEmpty()){
                    makeText(libraryfine.this,"please enter the number of days", LENGTH_SHORT).show();
                }
                else{
                    int days=Integer.parseInt(editText.getText().toString().trim());
                    double temp=days*10;
                    String results="The total amount of fine is of "+formatter.format(temp)+" rupees";
                    textView.setText(results);

                }


            }
        });
    }
}
