package com.sachin.great;

public class Songs {
    public String title;
    public int duration;

    public Songs(String title,int duration){
        this.duration=duration;
        this.title=title;
    }
    public Songs addSongs(String title,int duration){
        return (new Songs(title,duration));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
