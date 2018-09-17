package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by 98100 on 2018/9/10.
 */
@Data
public class RightCard {
    private String cardTitle;
    private String bg;

    public RightCard(String cardTitle, String bg) {
        this.cardTitle = cardTitle;
        this.bg = bg;
    }

    public RightCard() {
    }
}
