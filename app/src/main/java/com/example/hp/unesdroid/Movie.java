package com.example.hp.unesdroid;

/**
 * Created by hp on 27/02/2018.
 */

public class Movie {
    Integer imageID;
    String title;

    public Movie(String title,Integer imageID ) {
        this.imageID = imageID;
        this.title = title;
    }

    public Integer getImageID(){
        return imageID;
    }
    public void setImageID(Integer imageID){
        this.imageID = imageID;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
