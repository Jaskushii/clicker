package com.example.clicker;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;});

            TextView Liczba = findViewById(R.id.Liczba);
            Button button = findViewById(R.id.button);
            Button reset = findViewById(R.id.reset);

            reset.setOnClickListener(view ->{
                counter = 0;
                Liczba.setText(String.valueOf(counter));
            });

            button.setOnClickListener(view -> {
                counter++;
                Liczba.setText(String.valueOf(counter));

    });
}}