package com.mpiyush510.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mpiyush510.listviewdemo.ListViewCompany.LstCompany;
import com.mpiyush510.listviewdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.StartLst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LstCompany.class);
                Toast.makeText(MainActivity.this, "Start ListView ❤️", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}