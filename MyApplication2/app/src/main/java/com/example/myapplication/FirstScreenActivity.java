package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class FirstScreenActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Button button = findViewById(R.id.btn_secondscreen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstScreenActivity.this, SecondScreenActivity.class);
                startActivity(intent);
            }
        });
    }
}
