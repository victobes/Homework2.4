package com.example.myapplication1;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyOnClickListner implements View.OnClickListener {

    private EditText editA;
    private EditText editB;
    private EditText editC;
    private TextView ans;

    public MyOnClickListner(EditText a, EditText b, EditText c, TextView ans){
        this.editA = a;
        this.editB = b;
        this.editC = c;
        this.ans = ans;
    }

    @Override
    public void onClick(View v){
        double a = Double.parseDouble(editA.getText().toString());
        double b = Double.parseDouble(editB.getText().toString());
        double c = Double.parseDouble(editC.getText().toString());
        double D = b*b - 4*a*c;
        if (a !=0 & c != 0) {
            if (D < 0)
                ans.setText("Действительных корней нет");
            if (D == 0)
                ans.setText(String.valueOf(((-b + Math.sqrt(D)) / 2 / a)));
            if (D > 0)
                ans.setText(String.valueOf(((-b + Math.sqrt(D)) / 2 / a) + "  " + ((-b - Math.sqrt(D)) / 2 / a)));
        } else {
            if (a == 0 & b !=0 )
                ans.setText(String.valueOf(-c/b));
            if (a == 0 & b == 0 & c == 0)
                ans.setText("Решенем явл. вся числовая прямая");
            if (a == 0 & b == 0 & c != 0)
                ans.setText("Действительных корней нет");
        }
    }

}
