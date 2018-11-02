package com.example.dohaiha.democalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    public double valueOne;
    public double valueTwo;
    public Context context;
    private boolean flag = true;
    private boolean flagDot = true;

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnResult, btnMinus, btnPlus, btnMul, btnDiv, btnPercent, btnNegative, btnAC, btnDot;

    private LinearLayout btn0;

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        onclickEvent();

        valueOne = 0;
        valueTwo = 0;


    }

    public void initView() {

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnResult = findViewById(R.id.btnResult);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnPercent = findViewById(R.id.btnPercent);
        btnNegative = findViewById(R.id.btnNegative);
        btnAC = findViewById(R.id.btnAC);
        btnDot = findViewById(R.id.btnDot);

        tvResult = findViewById(R.id.tvResult);
    }

    public void onclickEvent() {


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "1");
                } else {
                    tvResult.setText(tvResult.getText() + "1");
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "2");
                } else {
                    tvResult.setText(tvResult.getText() + "2");
                }


            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "3");
                } else {
                    tvResult.setText(tvResult.getText() + "3");
                }


            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "4");
                } else {
                    tvResult.setText(tvResult.getText() + "4");
                }

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "5");
                } else {
                    tvResult.setText(tvResult.getText() + "5");
                }

            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "6");
                } else {
                    tvResult.setText(tvResult.getText() + "6");
                }


            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "7");
                } else {
                    tvResult.setText(tvResult.getText() + "7");
                }

            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "8");
                } else {
                    tvResult.setText(tvResult.getText() + "8");
                }


            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "9");
                } else {
                    tvResult.setText(tvResult.getText() + "9");
                }

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
                    tvResult.setText("");
                    tvResult.setText(tvResult.getText() + "0");
                } else {
                    tvResult.setText(tvResult.getText() + "0");
                }

            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag = false;

                valueOne = Double.parseDouble(tvResult.getText().toString());
                valueTwo = 0;
                CURRENT_ACTION = ADDITION;

            }
        });


        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag = false;

                valueOne = Double.parseDouble(tvResult.getText().toString());
                CURRENT_ACTION = SUBTRACTION;

            }
        });


        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag = false;

                valueOne = Double.parseDouble(tvResult.getText().toString());
                CURRENT_ACTION = MULTIPLICATION;

            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag = false;

                valueOne = Double.parseDouble(tvResult.getText().toString());
                CURRENT_ACTION = DIVISION;

            }
        });

        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == true) {
                    valueOne = Double.parseDouble(tvResult.getText().toString());
                    valueOne = (0 - valueOne);
                    tvResult.setText("" + valueOne);
                }
                if (flag == false) {
                    valueTwo = Double.parseDouble(tvResult.getText().toString());
                    valueTwo = (0 - valueTwo);
                    tvResult.setText("" + valueTwo);
                }
            }
        });


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == false) {

                    valueTwo = Double.parseDouble(tvResult.getText().toString());
                    if (CURRENT_ACTION == ADDITION) {
                        valueOne = valueOne + valueTwo;
                        tvResult.setText(valueOne + "");
                    } else if (CURRENT_ACTION == SUBTRACTION) {
                        valueOne = valueOne - valueTwo;
                        tvResult.setText(valueOne + "");
                    } else if (CURRENT_ACTION == MULTIPLICATION) {
                        valueOne = valueOne * valueTwo;
                        tvResult.setText(valueOne + "");
                    } else if (CURRENT_ACTION == DIVISION) {
                        valueOne = valueOne / valueTwo;
                        tvResult.setText(valueOne + "");
                    }

                    flag = true;
                }

            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = 0;
                tvResult.setText("0");
                flagDot = true;
            }
        });


//        btnDot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               if (flag2 == true){
//                   if (valueOne == Double.parseDouble(tvResult.getText().toString())) {
//                       tvResult.setText("");
//                       tvResult.setText(tvResult.getText() + ".");
//                       flag2 = false;
//                   } else {
//                       tvResult.setText(tvResult.getText() + ".");
//                       flag2 = false;
//                   }
//               }
//            }
//        });

        btnPercent.setOnClickListener(this);
        btnDot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPercent:
                double valueScreen = Double.parseDouble(tvResult.getText().toString());
                tvResult.setText(valueScreen/100 + "");
                break;

            case R.id.btnDot:

                String result = tvResult.getText().toString() + "asdasd. aasdasd";

                if (flagDot == true){
                    tvResult.setText(tvResult.getText() + ".");
                    flagDot = false;

                }else{
                    String[] daySo = result.split(".");
                    String so = daySo.toString();
                    for (String x : daySo){
                        Log.d("dayso", x.toString());
                        Log.d("dayso", so);

                    }

                    Log.d("dayso", so);
                    Log.d("dayso", daySo.length +"");
                    Log.d("dayso", result);
                    tvResult.setText(so);
                    flagDot = true;
                }

                break;
        }
    }
}
