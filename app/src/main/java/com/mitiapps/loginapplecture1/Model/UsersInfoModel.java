package com.mitiapps.loginapplecture1.Model;

public class UsersInfoModel {
    String Email,Name,img,image;

    public UsersInfoModel() {
    }

    public UsersInfoModel(String email, String name, String image) {
        Email = email;
        Name = name;
        this.image = image;
    }

    public String getImg() {
        return img;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
