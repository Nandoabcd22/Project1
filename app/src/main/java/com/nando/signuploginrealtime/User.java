package com.nando.signuploginrealtime;

public class User {

    String name, lastMessage, lastMsgTime, nim, prodi;
    int imageId;

    public User(String name, String lastMessage, String lastMsgTime, String nim, String prodi, int imageId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.nim = nim;
        this.prodi = prodi;
        this.imageId = imageId;
    }
}