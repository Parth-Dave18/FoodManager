package com.example.foodmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.foodmanager.databinding.ActivityReceiveBinding;
import com.example.foodmanager.models.Receiver;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class ReceiveActivity extends AppCompatActivity {

    ActivityReceiveBinding binding;
    FirebaseAuth auth;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        binding = ActivityReceiveBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((!binding.txtAddress.getText().toString().isEmpty())
                        &&(!binding.txtCity.getText().toString().isEmpty())
                        &&(!binding.txtnameReceiver.getText().toString().isEmpty())
                        &&(!binding.txtNoOfPeople.getText().toString().isEmpty())){
                    Receiver receiver = new Receiver(binding.txtnameReceiver.getText().toString(),
                            Integer.valueOf(binding.txtNoOfPeople.getText().toString()),
                            binding.txtAddress.getText().toString(),
                            binding.txtCity.getText().toString());
                    database.getReference().child("Receivers").push().setValue(receiver).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(ReceiveActivity.this, "Receiver added successfully!!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ReceiveActivity.this,MainActivity2.class);
                            startActivity(intent);
                            finish();
                        }
                    });

                }
                else{
                    Toast.makeText(ReceiveActivity.this, "I dont know", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}