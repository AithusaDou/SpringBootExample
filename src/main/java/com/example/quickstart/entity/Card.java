package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by 98100 on 2018/9/10.
 */
@Data
public class Card {
    private String avatar;
    private String name;
    private String time;
    private String title;
    private String content;
    private String pic;
    private String honour;
    private String comment;

    public Card(String avatar, String name, String time, String title, String content, String pic, String honour, String comment) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.title = title;
        this.content = content;
        this.pic = pic;
        this.honour = honour;
        this.comment = comment;
    }

    public Card() {
    }
}

