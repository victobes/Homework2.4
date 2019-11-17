package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tw = findViewById(R.id.textView2);
        Button bt = findViewById(R.id.button);
        EditText ea = findViewById(R.id.editText);
        EditText eb = findViewById(R.id.editText2);
        EditText ec = findViewById(R.id.editText3);
        MyOnClickListner listner = new MyOnClickListner(ea,eb,ec,tw);
        bt.setOnClickListener(listner);
    }
}
