package com.learning.getextrovert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.learning.getextrovert.databinding.ActivityLogInBinding;

public class LogInActivity extends AppCompatActivity {

    ActivityLogInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLogInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.registerTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LogInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}