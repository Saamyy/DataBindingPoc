package com.example.mahmoudsamy.databindingpoc;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mahmoudsamy.databindingpoc.beens.User;

/**
 * Created by Mahmoud samy on 1/7/2018.
 */

public class Handler {
    MainActivity mainActivity;
    public Handler(){
        mainActivity=new MainActivity();
    }
    public void handleClick(View view,User user){
        Button button=(Button) view;
        Toast.makeText(button.getContext(), button.getText()+" "+user.getFirstName(), Toast.LENGTH_SHORT).show();


    }
}
