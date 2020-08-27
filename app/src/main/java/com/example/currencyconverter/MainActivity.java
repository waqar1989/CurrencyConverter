package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertToRs(View view){

    Log.i("message","Button tapped");

       TextView currencyTextView = findViewById(R.id.currencyTextView);
        Button convertButton = findViewById(R.id.convertButton);

        String sR = currencyTextView.getText().toString();
        double srInInteger = Double.parseDouble(sR);
        double pkr= srInInteger * 44.02 ;
        String pkrInString = Double.toString(pkr);

        Toast.makeText(getApplicationContext(), "your amount in PKR is " + pkrInString, Toast.LENGTH_SHORT).show();

        hideKeyboard();

    }

   void hideKeyboard(){

       ConstraintLayout mainLayout;
       mainLayout = (ConstraintLayout)findViewById(R.id.myConstraintLayout);
       InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
       imm.hideSoftInputFromWindow(mainLayout.getWindowToken(), 0);
   }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }
}