package com.szafar97.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.colors_text);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        ArrayList<String> colors = bundle.getStringArrayList("color_names");

        if (colors.isEmpty())
            text.setText("No color was selected in previous activity.");
        else
        {
            String result = "You have selected ";
            for(String color: colors)
            {
                result += color + ", ";
            }

            result = result.substring(0, result.length() - 2);
            result += " in previous activity.";
            text.setText(result);
        }
    }

    public void GoBack(View view)
    {
        finish();
        return;
    }
}