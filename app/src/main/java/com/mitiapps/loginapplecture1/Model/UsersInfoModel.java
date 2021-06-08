package com.mitiapps.loginapplecture1.Model;

public class UsersInfoModel {
    String Email,Name;

    public UsersInfoModel() {
    }

    public UsersInfoModel(String email, String name) {
        Email = email;
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
