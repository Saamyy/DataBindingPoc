package com.example.mahmoudsamy.databindingpoc.beens;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.mahmoudsamy.databindingpoc.BR;

/**
 * Created by Mahmoud samy on 1/7/2018.
 */

public class User extends BaseObservable {
    String firstName;
    String lastName;
    String middleName;

    public User(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firsNmae) {
        this.firstName = firsNmae;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
