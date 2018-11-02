package com.example.dohaiha.democalculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class CalculatorFragment extends Fragment implements View.OnClickListener {


    public double valueOne;
    public double valueTwo;
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

    public TextView tvResult;
    public View view;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_main, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

       initView();

        onclickEvent();
        setPreferenceSave();

    }


    public void initView() {

        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        btn9 = view.findViewById(R.id.btn9);
        btn0 = view.findViewById(R.id.btn0);
        btnResult = view.findViewById(R.id.btnResult);
        btnMinus = view.findViewById(R.id.btnMinus);
        btnPlus = view.findViewById(R.id.btnPlus);
        btnMul = view.findViewById(R.id.btnMul);
        btnDiv = view.findViewById(R.id.btnDiv);
        btnPercent = view.findViewById(R.id.btnPercent);
        btnNegative = view.findViewById(R.id.btnNegative);
        btnAC = view.findViewById(R.id.btnAC);
        btnDot = view.findViewById(R.id.btnDot);

        tvResult = getActivity().findViewById(R.id.tvResult);
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

                float num = Float.parseFloat(tvResult.getText().toString());

                if (num > 0) {
                    tvResult.setText("-" + tvResult.getText());
                } else if (num < 0) {
                    tvResult.setText(tvResult.getText().toString().substring(1));
                } else if (num == 0) {
                    // TODO: 10/30/18  
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
                    } else if (CURRENT_ACTION == SUBTRACTION) {
                        valueOne = valueOne - valueTwo;
                    } else if (CURRENT_ACTION == MULTIPLICATION) {
                        valueOne = valueOne * valueTwo;
                        tvResult.setText(valueOne + "");
                    } else if (CURRENT_ACTION == DIVISION) {
                        valueOne = valueOne / valueTwo;
                    }

                    String tempResult = String.valueOf(valueOne);

                    String[] arrOfStr = tempResult.split("[.]+");

                    Log.d("num", arrOfStr[0] + "   truoc cham");
                    Log.d("num", arrOfStr[1] + "   sau cham");
                    float last = Float.parseFloat(arrOfStr[1]);

                    if (last == 0) {
                        tvResult.setText(arrOfStr[0]);
                    } else {
                        tvResult.setText(tempResult);
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


        btnPercent.setOnClickListener(this);
        btnDot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnPercent:
                double valueScreen = Double.parseDouble(tvResult.getText().toString());
                tvResult.setText(valueScreen / 100 + "");
                break;

            case R.id.btnDot:

                String result = tvResult.getText().toString();
                boolean check;
                check = result.contains(".");

                Log.d("check", check + "");
                if (check) {
                    String[] arr = result.split("[.]+");
                    tvResult.setText(arr[0]);
                    Log.d("a", "a");
                } else {
                    tvResult.setText(tvResult.getText() + ".");
                }
                break;
        }
    }


    public String getLastResult() {
        String lastReult = tvResult.getText().toString();
        return lastReult;
    }

    public void setPreferenceSave(){
        SharedPreferences preferences = getActivity().getSharedPreferences("save", MODE_PRIVATE);
        String getStringFromPreference = preferences.getString("saveResult", "0");
        tvResult.setText(getStringFromPreference);
    }
}
