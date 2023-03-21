package com.example.foodmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foodmanager.databinding.ActivityFirstPageBinding;

public class FirstPageActivity extends AppCompatActivity {

    public static int userType;

    ActivityFirstPageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initiallizing view binding
        binding = ActivityFirstPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //set on click listener to the donate food
        binding.donateFoodTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userType = 1;
                Intent intent = new Intent(FirstPageActivity.this,DonateActivity.class);
                startActivity(intent);
            }
        });

        //set on click listener to receive food
        binding.receiveFoodTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userType = 0;
                Intent intent = new Intent(FirstPageActivity.this,ReceiveActivity.class);
                startActivity(intent);
            }
        });
    }
}