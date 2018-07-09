package com.e.credit;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final Button button=findViewById(R.id.bt2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{

                int y1 = Integer.parseInt(y.getText().toString());
                int m1 = Integer.parseInt(m.getText().toString());
                int yr =y1*12;
                int rr=yr+m1;
String r1= getResources().getString(R.string.tv5);
String r2= getResources().getString(R.string.tv6);
                String result= String.valueOf(rr);
               Result1.setText(r1+"\n"+result+"\n"+r2); }
                catch (NumberFormatException e){
                    int duration = Toast.LENGTH_LONG;
                    Toast toast2 = Toast.makeText(getApplicationContext(), R.string.toast, duration);
                    toast2.show();

                }}
});}}
