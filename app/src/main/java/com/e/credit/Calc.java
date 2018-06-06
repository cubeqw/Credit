package com.e.credit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calc extends AppCompatActivity {
    EditText y;
    EditText m;
    TextView Result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        Result1 =findViewById(R.id.Result1);
        y = findViewById(R.id.y);
        m = findViewById(R.id.m);

        final Button button=findViewById(R.id.bt2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{

                int y1 = Integer.parseInt(y.getText().toString());
                int m1 = Integer.parseInt(m.getText().toString());
                int yr =y1*12;
                String yr1= String.valueOf(yr);
                int rr=yr+m1;
                String result= String.valueOf(rr);
                Result1.setText(result);

    }
                catch (NumberFormatException e){
                    }}
});}}
