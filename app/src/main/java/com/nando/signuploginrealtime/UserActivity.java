package com.nando.signuploginrealtime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.nando.signuploginrealtime.databinding.ActivityUserBinding;
public class UserActivity extends AppCompatActivity {

    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null){

            String name = intent.getStringExtra("name");
            String nim = intent.getStringExtra("nim");
            String prodi = intent.getStringExtra("prodi");
            int imageid = intent.getIntExtra("imageid",R.drawable.a);

            binding.nameProfile.setText(name);
            binding.nimProfile.setText(nim);
            binding.prodiProfile.setText(prodi);
            binding.profileImage.setImageResource(imageid);


        }

    }
}