package com.example.task_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class homework extends AppCompatActivity {
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsadapter;
    public ListView listView;
    public Button button;
    public EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);

        listView=findViewById(R.id.listview);
        button=findViewById(R.id.button11);
        editText=findViewById(R.id.editText6);

        items=filehelper.readData(this);

        itemsadapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(itemsadapter);



        /*button.setOnClickListener((View.OnClickListener) this);
        listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);*/

        button.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                additem(v);
            }
        });
        items=new ArrayList<>();
        itemsadapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(itemsadapter);
        listviewlistener();




    }

    public void listviewlistener() {
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i , long id) {
                Context context= getApplicationContext();
                Toast.makeText(context, "item removed", Toast.LENGTH_SHORT).show();

                items.remove(i);
                itemsadapter.notifyDataSetChanged();
                return true;
            }
        });
    }

    public void additem(View view){
        EditText input=findViewById(R.id.editText6);
        String itemText=input.getText().toString();

        if (!(itemText.equals(""))){
            itemsadapter.add(itemText);
            input.setText("");
            filehelper.writeData(items,this);
        }
        else {
            Toast.makeText(getApplicationContext(),"please enter text", Toast.LENGTH_LONG).show();

        }

    }
    public void onClick(View v){
        switch (v.getId()){
             case R.id.button11:
                String itemEntered=editText.getText().toString();
                itemsadapter.add(itemEntered);
                editText.setText("");
                filehelper.writeData(items,this);
                Toast.makeText(this,"item added",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    /*public void onItemLongClick(AdapterView<?> parent,View v,int position,long id){
        items.remove(position);
        itemsadapter.notifyDataSetChanged();
        Toast.makeText(this,"delete",Toast.LENGTH_SHORT).show();

    }*/
}
