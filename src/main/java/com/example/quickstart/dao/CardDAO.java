package com.example.quickstart.dao;

import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.RightCard;
import com.example.quickstart.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Data
@Configuration
public class CardDAO {
    public List<Card> getCards(){
        Card[] cards = {
                new Card("1.png",
                        "少数派编辑部",
                        "2天前",
                        "一派 | 苹果秋季发布会你最期待什么新产品？",
                        "这一期的一派，少数派编辑们对下周的苹果秋季发布会谈了谈自己最期待的产品以及购置计划。同时我们也想听听大家的想法。",
                        "11.png",
                        "25",
                        "139"),
                new Card("2.jpg",
                        "化学心情下2",
                        "2天前",
                        "工作日让家中电脑不再闲置",
                        "如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？",
                        "22.png",
                        "65",
                        "39"),
                new Card("3.jpg",
                        "Adventure",
                        "2天前",
                        "5 种方法，在电脑和手机上告别百度搜索里的广告",
                        "百度上各种广告对用户搜索体验造成的不良影响已不是什么新鲜事。我将向大家介绍一些在电脑和手机上减少百度推广广告出现的方法，还你干净快捷的搜索体验。",
                        "33.png",
                        "154",
                        "59"),
                new Card("1.png",
                        "少数派编辑部",
                        "2天前",
                        "一派 | 苹果秋季发布会你最期待什么新产品？",
                        "这一期的一派，少数派编辑们对下周的苹果秋季发布会谈了谈自己最期待的产品以及购置计划。同时我们也想听听大家的想法。",
                        "11.png",
                        "25",
                        "139"),
                new Card("2.jpg",
                        "化学心情下2",
                        "2天前",
                        "工作日让家中电脑不再闲置",
                        "如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？",
                        "22.png",
                        "65",
                        "39"),
                new Card("3.jpg",
                        "Adventure",
                        "2天前",
                        "5 种方法，在电脑和手机上告别百度搜索里的广告",
                        "百度上各种广告对用户搜索体验造成的不良影响已不是什么新鲜事。我将向大家介绍一些在电脑和手机上减少百度推广广告出现的方法，还你干净快捷的搜索体验。",
                        "33.png",
                        "154",
                        "59"),
                new Card("1.png",
                        "少数派编辑部",
                        "2天前",
                        "一派 | 苹果秋季发布会你最期待什么新产品？",
                        "这一期的一派，少数派编辑们对下周的苹果秋季发布会谈了谈自己最期待的产品以及购置计划。同时我们也想听听大家的想法。",
                        "11.png",
                        "25",
                        "139"),
                new Card("2.jpg",
                        "化学心情下2",
                        "2天前",
                        "工作日让家中电脑不再闲置",
                        "如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？",
                        "22.png",
                        "65",
                        "39"),
                new Card("3.jpg",
                        "Adventure",
                        "2天前",
                        "5 种方法，在电脑和手机上告别百度搜索里的广告",
                        "百度上各种广告对用户搜索体验造成的不良影响已不是什么新鲜事。我将向大家介绍一些在电脑和手机上减少百度推广广告出现的方法，还你干净快捷的搜索体验。",
                        "33.png",
                        "154",
                        "59"),
        };
        List<Card> cardList = Arrays.asList(cards);
        return cardList;
    }



    public List<RightCard> getRightCards(){
        RightCard[] rightCards = {
                new RightCard("跑步好搭档",
                        "a.jpg"),
                new RightCard("给现代人的护眼小技巧",
                        "b.jpg"),
                new RightCard("青年居家生活指南",
                        "c.png"),
                new RightCard("跑步好搭档",
                        "a.jpg"),
                new RightCard("给现代人的护眼小技巧",
                        "b.jpg"),
                new RightCard("青年居家生活指南",
                        "c.png"),
                new RightCard("跑步好搭档",
                        "a.jpg"),
                new RightCard("给现代人的护眼小技巧",
                        "b.jpg"),
                new RightCard("青年居家生活指南",
                        "c.png"),
        };
        List<RightCard> rightCardList = Arrays.asList(rightCards);
        return rightCardList;
    }

    public User getUser(){
        User user = new User();
        user.setUserName("豆豆啊");
        user.setUserAvatar("me.png");
        return user;
    }
}
