package com.example.aditya.adi22;


public class Member {

    private String VideoName;
    private String VideoUri;

    private Member(){}

    public Member(String name,String videoUri){
        if (name.trim().equals("")){
            name = " not available";
        }
        VideoName = name;
        VideoUri = videoUri;
    }

    public String getVideoName() {
        return VideoName;
    }

    public void setVideoName(String videoName) {
        VideoName = videoName;
    }

    public String getVideoUri() {
        return VideoUri;
    }

    public void setVideoUri(String videoUri) {
        VideoUri = videoUri;
    }
}