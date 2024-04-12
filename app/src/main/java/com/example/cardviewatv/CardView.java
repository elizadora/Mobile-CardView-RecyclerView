package com.example.cardviewatv;

public class CardView {
    String title;
    String description;
    int logoImage;
    int backgroundImage;


    CardView(String title, String description, int logoImage, int backgroundImage){
        this.title = title;
        this.description = description;
        this.logoImage = logoImage;
        this.backgroundImage = backgroundImage;
    }

    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }

    public int getLogoImage(){
        return this.logoImage;
    }

    public int getBackgroundImage(){
        return this.backgroundImage;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public void setLogoImage(int logoImage){
        this.logoImage = logoImage;
    }

    public void setBackgroundImage(int backgroundImage){
        this.backgroundImage = backgroundImage;
    }
}
