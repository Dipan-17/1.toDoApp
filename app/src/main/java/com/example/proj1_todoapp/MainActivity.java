package com.example.proj1_todoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Globally declaring the variables
    ListView listView;
    ArrayList<String> list;
    Button AddButton, removeButton;
    EditText editTextBox;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialising the variables
        listView = (ListView) findViewById(R.id.listView);
        AddButton = (Button) findViewById(R.id.AddButton);
        editTextBox = (EditText) findViewById(R.id.editTextBox);
        removeButton = (Button) findViewById(R.id.removeButton);

        //creating the list to store the values
        list = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, list);

        //adding function to the add button
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting the text and casting it to string type
                String item_value = editTextBox.getText().toString();

                //adding the value to the list
                list.add(item_value);
                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
            }
        });

        //adding functionality to the remove button
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When remove button is pressed => the loop runs to check if any of the item in
                //list matches the entered string
                //if yes => it is removed (first occurence)
                //if no => does nothing => don't know implementation of pop up message
                for (int i = 0; i < list.size(); i++) {
                    String getValue = editTextBox.getText().toString();
                    if (list.get(i).equals(getValue)) {
                        list.remove(i);
                        arrayAdapter.notifyDataSetChanged();
                        break;
                    }
                }
            }
        });

    }


}