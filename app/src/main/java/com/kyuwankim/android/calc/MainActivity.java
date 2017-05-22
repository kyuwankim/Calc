package com.kyuwankim.android.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn_plus, btn_minus, btn_multi, btn_divide, btn_result, btn_clear;

    boolean operate = false;

    String before = "";
    String after = "";
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);

        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multi = (Button) findViewById(R.id.btn_multi);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_result = (Button) findViewById(R.id.btn_result);
        btn_clear = (Button) findViewById(R.id.btn_clear);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_result.setOnClickListener(this);
        btn_clear.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                if (operate == true) {
                    after = after + "0";
                    result = after;
                } else {
                    before = before + "0";
                    result = before;
                }

                tv.setText(result);
                break;

            case R.id.btn1:
                if(operate == true) {
                    after = after + "1";
                    result = after;
                }else {
                    before = before + "1";
                    result = before;
                }
                tv.setText(result);
                break;

            case R.id.btn2:
                if(operate == true) {
                    after = after + "2";
                    result = after;
                }else {
                    before = before + "2";
                    result = before;
                }
                tv.setText(result);
                break;

            case R.id.btn3:
                if(operate == true) {
                    after = after + "3";
                    result = after;
                }else {
                    before = before + "3";
                    result = before;
                }
                tv.setText(result);
                break;

            case R.id.btn4:
                if(operate == true) {
                    after = after + "4";
                    result = after;
                }else {
                    before = before + "4";
                    result = before;
                }
                tv.setText(result);
                break;

            case R.id.btn5:
                if(operate == true) {
                    after = after + "5";
                    result = after;
                }else {
                    before = before + "5";
                    result = before;
                }
                tv.setText(result);
                break;

            case R.id.btn6:
                if(operate == true) {
                    after = after + "6";
                }else {
                    before = before + "6";
                    result = before;
                }
                tv.setText(result);
                break;

            case R.id.btn7:
                if(operate == true) {
                    after = after + "7";
                    result = after;
                }else {
                    before = before + "7";
                    result = before;
                }
                tv.setText(result);
                break;

            case R.id.btn8:
                if(operate == true) {
                    after = after + "8";
                    result = after;
                }else {
                    before = before + "8";
                    result = before;
                }
                tv.setText(result);
                break;

            case R.id.btn9:
                if(operate == true) {
                    after = after + "9";
                    result = after;
                }else {
                    before = before + "9";
                    result = before;
                }
                tv.setText(result);
                break;

            case R.id.btn_plus:
                operate = true;
                break;

            case R.id.btn_minus:

                break;

            case R.id.btn_multi:

                break;

            case R.id.btn_divide:

                break;

            case R.id.btn_clear:
                result = "0";
                tv.setText(result);
                break;

            case R.id.btn_result:
                int temp = Integer.parseInt(before) + Integer.parseInt(after);
                tv.setText(temp+"");
                break;
        }
    }
}
