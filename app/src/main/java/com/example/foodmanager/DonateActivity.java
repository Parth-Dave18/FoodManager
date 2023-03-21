package com.example.foodmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodmanager.databinding.ActivityDonateBinding;
import com.example.foodmanager.models.Donor;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class DonateActivity extends AppCompatActivity {
    ActivityDonateBinding binding;
    FirebaseAuth auth;
    FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Instantiating view binding
        binding = ActivityDonateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Initializing FirebaseAuth and FirebaseDatabase
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((!binding.txtnameDonor.getText().toString().isEmpty())
                        &&(!binding.txtAddress.getText().toString().isEmpty())
                        &&(!binding.txtBestBefore.getText().toString().isEmpty())
                        &&(!binding.txtItemsDes.getText().toString().isEmpty())
                        &&(!binding.txtNoOfItems.getText().toString().isEmpty())
                        &&(!binding.txtFoodQuantity.getText().toString().isEmpty())){
                    Donor donor = new Donor(binding.txtnameDonor.getText().toString(),
                            auth.getCurrentUser().getPhoneNumber().toString(),
                            Integer.valueOf(binding.txtNoOfItems.getText().toString()),
                            Integer.valueOf(binding.txtFoodQuantity.getText().toString()),
                            binding.txtItemsDes.getText().toString(),
                            binding.txtAddress.getText().toString(),binding.txtCity.getText().toString());

                    database.getReference().child("Donors").push().setValue(donor).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(DonateActivity.this, "One new Donation added!!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(DonateActivity.this,MainActivity2.class);
                            startActivity(intent);
                            finish();
                        }
                    });

                }
            }
        });

    }

//    private static long getTimeStamp(Date date){
//
//    }
}