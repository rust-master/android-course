package com.mitiapps.loginapplecture1.Model;

public class NewsFeedModel {
    String image,newstext;

    public NewsFeedModel() {
    }

    public NewsFeedModel(String image, String newstext) {
        this.image = image;
        this.newstext = newstext;
    }

    public String getNewstext() {
        return newstext;
    }

    public void setNewstext(String newstext) {
        this.newstext = newstext;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
