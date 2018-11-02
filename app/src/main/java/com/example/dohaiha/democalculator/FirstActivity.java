package com.example.dohaiha.democalculator;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Fragment calculatorFragment;
    private ImageView btnOpenCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        calculatorFragment = new CalculatorFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.vpContainer, calculatorFragment);

        btnOpenCalculator = findViewById(R.id.btnOpenCalculator);

        btnOpenCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                if (calculatorFragment.isHidden()) {
                    transaction.show(calculatorFragment);
                } else if (calculatorFragment.isResumed()) {
                    transaction.hide(calculatorFragment);

                } else {
                    transaction.add(R.id.vpContainer, calculatorFragment);
                }

                transaction.addToBackStack(null);
                transaction.commit();

                getPreferenceResult();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        SharedPreferences preferences = getSharedPreferences("save", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        switch (item.getItemId()) {
            case R.id.itSave:
                String lastResult = ((CalculatorFragment) calculatorFragment).getLastResult();
                editor.putString("saveResult", lastResult);
                editor.commit();
                Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();
                break;

            case R.id.itClear:
                editor.clear();
                editor.commit();
                ((CalculatorFragment) calculatorFragment).setPreferenceSave();
                Toast.makeText(this, "clear", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void getPreferenceResult() {
        SharedPreferences preferences = getSharedPreferences("save", MODE_PRIVATE);
        String getStringFromPreference = preferences.getString("saveResult", "0");
    }
}
