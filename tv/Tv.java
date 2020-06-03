package com.sda.tv;

public class Tv {
    private int post;
    private int volume;
    private boolean onOff;

    public Tv(int post, int volume, boolean onOff) {
        this.post = post;
        this.volume = volume;
        this.onOff = onOff;
    }

    public int getPost() {
        return post;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public int upVolume(){
        if(this.volume < 50)
            this.volume = this.volume + 1;
        else
            this.volume = 0;
        return this.volume;
    }

    public int downVolume(){
        if(this.volume > 0)
            this.volume = this.volume - 1;
        else
            this.volume = 50;
        return this.volume;
    }

    public void changeTvPostTo(int number){
        if(number >= 1 && number <= 100){
            this.post = number;
        }
        else {
            System.out.println("Unknown TV post");
        }
    }

    public int nextTvPost(){
        if(this.post != 100){
            this.post = this.post + 1;
        }
        else{
            this.post = 1;
        }
        return this.post;
    }

    public int previousTvPost(){
        if(this.post != 1){
            this.post = this.post - 1;
        }
        else{
            this.post = 100;
        }
        return this.post;
    }
}
