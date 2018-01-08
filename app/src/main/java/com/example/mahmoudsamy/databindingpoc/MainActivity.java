package com.example.mahmoudsamy.databindingpoc;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mahmoudsamy.databindingpoc.beens.User;
import com.example.mahmoudsamy.databindingpoc.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("mahmoud", "samy","ahmed");
        binding.setUser(user);
        binding.setHandler(new Handler());
        user.setFirstName("Eslam");
    }
}
