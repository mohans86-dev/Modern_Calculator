package com.example.mycalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String s = "";

    Double result=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtResult, txtExp;
        Button clrKey, delKey, divKey, multiKey, subKey, addKey,
                equalKey, D_0Key, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;

        txtResult = findViewById(R.id.txtResult);
        txtExp = findViewById(R.id.txt_Opts);
        clrKey = findViewById(R.id.clrKey);
        delKey = findViewById(R.id.delKey);
        divKey = findViewById(R.id.divKey);
        multiKey = findViewById(R.id.multiKey);
        subKey = findViewById(R.id.subKey);
        addKey = findViewById(R.id.addKey);
        equalKey = findViewById(R.id.equalKey);
        D_0Key = findViewById(R.id.D_0Key);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);


        equalKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = txtExp.getText().toString();

                // Check for empty input or leading 0 or trailing operator
                if (s.isEmpty() || s.charAt(0) == '0' ||
                        s.endsWith("+") || s.endsWith("-") || s.endsWith("*") || s.endsWith("/")) {
                    txtResult.setText(""); // Show empty
                    return;
                }

                // New condition: if only numbers are present without any operator
                if (!s.contains("+") && !s.contains("-") && !s.contains("*") && !s.contains("/")) {
                    txtResult.setText(""); // Do not evaluate
                    return;
                }

                result = EvaluateOperation.evaluate(s);
                if (result != null) {
                    txtResult.setText(String.valueOf(result));
                } else {
                    txtResult.setText(""); // Handle invalid cases
                }
            }
        });

        clrKey.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txtExp.setText("0");
                txtResult.setText("");
            }
        });
        delKey.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() > 1) {
                    s = s.substring(0, s.length() - 1);
                } else {
                    txtExp.setText("0");
                    return;
                }
                txtExp.setText(s);

            }
        });
        D_0Key.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    return;
                }
                txtExp.setText(s + "00");

            }
        });

        num0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    return;
                }
                txtExp.setText(s + "0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    s = s.replaceFirst("^0*", "");
                    txtExp.setText("1");
                    return;
                }
                txtExp.setText(s + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    s = s.replaceFirst("^0*", "");
                    txtExp.setText("2");
                    return;
                }
                txtExp.setText(s + "2");

            }
        });
        num3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    s = s.replaceFirst("^0*", "");
                    txtExp.setText("3");
                    return;
                }
                txtExp.setText(s + "3");

            }
        });
        num4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    s = s.replaceFirst("^0*", "");
                    txtExp.setText("4");
                    return;
                }
                txtExp.setText(s + "4");

            }
        });
        num5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    s = s.replaceFirst("^0*", "");
                    txtExp.setText("5");
                    return;
                }
                txtExp.setText(s + "5");

            }
        });
        num6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    s = s.replaceFirst("^0*", "");
                    txtExp.setText("6");
                    return;
                }
                txtExp.setText(s + "6");

            }
        });
        num7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    s = s.replaceFirst("^0*", "");
                    txtExp.setText("7");
                    return;
                }
                txtExp.setText(s + "7");

            }
        });
        num8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    s = s.replaceFirst("^0*", "");
                    txtExp.setText("8");
                    return;
                }
                txtExp.setText(s + "8");

            }
        });
        num9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 1 && s.charAt(0) == '0') {
                    s = s.replaceFirst("^0*", "");
                    txtExp.setText("9");
                    return;
                }
                txtExp.setText(s + "9");

            }
        });
        divKey.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 0) return;
                if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' ||s.charAt(s.length() - 1) == 'x' ||s.charAt(s.length() - 1) == '/') return;
                txtExp.setText(s + "/");

            }
        });
        multiKey.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 0) return;
                if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' ||s.charAt(s.length() - 1) == '*' ||s.charAt(s.length() - 1) == '/') return;
                txtExp.setText(s + "*");

            }
        });
        subKey.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 0) return;
                if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' ||s.charAt(s.length() - 1) == 'x' ||s.charAt(s.length() - 1) == '/') return;
                txtExp.setText(s + "-");

            }
        });
        addKey.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s = txtExp.getText().toString();
                if (s.length() == 0) return;
                if (s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' ||s.charAt(s.length() - 1) == 'x' ||s.charAt(s.length() - 1) == '/') return;
                txtExp.setText(s + "+");

            }
        });

    }
}