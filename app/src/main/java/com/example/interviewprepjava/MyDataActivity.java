package com.example.interviewprepjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.interviewprepjava.databinding.ActivityMyDataBinding;

public class MyDataActivity extends AppCompatActivity {

    private ActivityMyDataBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Student student = new Student("Trupti","ahmedabad",23,140.0f);

//        binding.textView.setText(student.name);
//        binding.textView2.setText(student.address);
//        binding.textView3.setText(String.valueOf(student.age));
//        binding.textView4.setText(String.valueOf(student.height));

        binding.setObj(student);

    }
}