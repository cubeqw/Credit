package com.e.credit;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText summ;
        EditText time;
        EditText mouth;
        EditText perv;
        TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result =findViewById(R.id.Result);
        summ = findViewById(R.id.summ);
        perv = findViewById(R.id.perv);
        time = findViewById(R.id.time);
        mouth =findViewById(R.id.mouth);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        final Button button1=findViewById(R.id.bt1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calc.class);
                startActivity(intent);}});


        final Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                double summ1 = Double.parseDouble(summ.getText().toString());
                double mouth1 = Double.parseDouble(mouth.getText().toString());
                double time1 = Double.parseDouble(time.getText().toString());
                double perv1 = Double.parseDouble(perv.getText().toString());
                double itogo = summ1 - perv1;
                double obsh = time1 * mouth1;
                double pereplat = obsh - itogo;
                double proc = pereplat / (summ1 / 100);
                String r1= getResources().getString(R.string.tv1);
                String r2= getResources().getString(R.string.tv2);
                String r3= getResources().getString(R.string.tv3);
                String r4= getResources().getString(R.string.tv4);
                String tv1 = (r1 + itogo);
                String tv2 = (r2 + obsh);
                String tv3 = (r3+ pereplat);
                String tv4 = (r4 + proc + "%");
                if (pereplat < 0 || proc < 0|| itogo < 0) {
                    int duration = Toast.LENGTH_LONG;
                    Toast toast2 = Toast.makeText(getApplicationContext(), R.string.toast, duration);
                    toast2.show();
                } else {
                    Result.setText(tv1 + "\n" + tv2 + "\n" + tv3 + "\n" + tv4);
                }
              }    catch (ArithmeticException e){
                    int duration = Toast.LENGTH_LONG;
                    Toast toast2 = Toast.makeText(getApplicationContext(),R.string.toast, duration);
                    toast2.show();
                }catch (NumberFormatException e){
                    int duration = Toast.LENGTH_LONG;
                    Toast toast2 = Toast.makeText(getApplicationContext(), R.string.toast, duration);
                    toast2.show();
                }}});
}}
