package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickred(View view) {
        getWindow().setBackgroundDrawableResource(R.color.red);
    }
    public void onClickyellow(View view) {
        getWindow().setBackgroundDrawableResource(R.color.yellow);
    }
    public void onClickgreen(View view) {
        getWindow().setBackgroundDrawableResource(R.color.green);
    }
}