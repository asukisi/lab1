package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); // замените на ваш файл макета

        
        String data = getIntent().getStringExtra("testNameData");

        
        TextView myTextView = findViewById(R.id.myTextView); // Убедитесь, что у вас есть TextView с этим ID
        if (data != null) {
            myTextView.setText(data);
        } else {
            myTextView.setText("Нет данных");
        }
    }
}
