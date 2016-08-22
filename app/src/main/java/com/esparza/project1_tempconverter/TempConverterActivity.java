package com.esparza.project1_tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TempConverterActivity extends AppCompatActivity {

    private EditText celTxt;
    private EditText fahTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);
        celTxt = (EditText) findViewById(R.id.celTxt);
        fahTxt = (EditText) findViewById(R.id.fahTxt);


        fahTxt.addActionListener(this);
    }
}
