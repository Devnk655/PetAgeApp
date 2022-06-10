package com.example.petageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView I1,I2;
    TextView T1;
    EditText ED1;
    Button B1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        I1=findViewById(R.id.I1);
        I2=findViewById(R.id.I2);
        final int [] animalImages=
                {
                     R.drawable.dog,R.drawable.lamp,R.drawable.mouse
                };
        T1=findViewById(R.id.T1);
        ED1=findViewById(R.id.ED1);
        B1=findViewById(R.id.B1);
        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnObject= new Random();
                int MyRandomNumber = rnObject.nextInt(3);
                Log.i("TAG","The Random Number is:"+MyRandomNumber);
                I1.setImageResource(animalImages[MyRandomNumber]);
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = ED1.getText().toString();
                int a = Integer.parseInt(s);
                int age=2022-a;
                T1.setText("The Animal Age Is: " +age);
            }
        });

    }
}