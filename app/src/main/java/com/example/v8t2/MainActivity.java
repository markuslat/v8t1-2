package com.example.v8t2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    TextView text;

    BottleDispenser dispencer = BottleDispenser.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);

        /*
        osta = (Button) findViewById(R.id.Osta);
        palauta = (Button) findViewById(R.id.Palauta);
        lisaa = (Button) findViewById(R.id.Lisaa);
        money = (TextView) findViewById(R.id.Money);
        context = MainActivity.this;
*/
    }
        public void addMoney (View v) {
            dispencer.addMoney(text);
        }
        public void buyBottle (View v) {
            dispencer.buyBottle(text);
        }
        public void returnMoney (View v) {
            dispencer.returnMoney(text);
        }
}

