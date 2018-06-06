package com.e.credit;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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



        final Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                int summ1 = Integer.parseInt(summ.getText().toString());
                int mouth1 = Integer.parseInt(mouth.getText().toString());
                int time1 = Integer.parseInt(time.getText().toString());
                int perv1 = Integer.parseInt(perv.getText().toString());
                int itogo = summ1 - perv1;
                int obsh = time1 * mouth1;
                int pereplat = obsh - itogo;
                int proc = pereplat / (summ1 / 100);
                String tv1 = ("Сумма выдаваемого кредита = " + itogo);
                String tv2 = ("Общая выплата = " + obsh);
                String tv3 = ("Переплата = " + pereplat);
                String tv4 = ("Реальная процентная ставка = " + proc + "%");
                if (pereplat < 0 || proc < 0|| itogo < 0) {
                    Result.setText("ВВЕДЕНЫ НЕКОРЕТНЫЕ ДАННЫЕ!");
                } else {
                    Result.setText(tv1 + "\n" + tv2 + "\n" + tv3 + "\n" + tv4);
                }
              }    catch (ArithmeticException e){
                    Result.setText("ВВЕДЕНЫ НЕКОРЕТНЫЕ ДАННЫЕ!");
                }catch (NumberFormatException e){
                    Result.setText("ВВЕДЕНЫ НЕКОРЕТНЫЕ ДАННЫЕ!");
                }}});
}}