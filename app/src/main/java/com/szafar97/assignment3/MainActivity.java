package com.szafar97.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg1, rg2;
    TextView text;
    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1 = findViewById(R.id.radioGroup1);
        rg2 = findViewById(R.id.radioGroup2);
        text = findViewById(R.id.fruits);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
    }

    public void ShowFruits(View view)
    {
        String result = "You have selected ";
        int id1 = rg1.getCheckedRadioButtonId();
        int id2 = rg2.getCheckedRadioButtonId();
        result += ((RadioButton)findViewById(id1)).getText();
        result += " and ";
        result += ((RadioButton)findViewById(id2)).getText();
        result += ".";
        text.setText(result);
    }

    public void ShowColors(View view)
    {
        ArrayList<String> colors = new ArrayList<>();

        if (cb1.isChecked())
            colors.add((String) cb1.getText());

        if (cb2.isChecked())
            colors.add((String) cb2.getText());

        if (cb3.isChecked())
            colors.add((String) cb3.getText());

        if (cb4.isChecked())
            colors.add((String) cb4.getText());

        Bundle bundle = new Bundle();
        bundle.putStringArrayList("color_names", colors);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}