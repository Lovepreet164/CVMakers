package com.example.cvmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Login = findViewById(R.id.LoginText);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        button= findViewById(R.id.btn);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              openHomePage();

           }
       });
  }

    private void openHomePage() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}