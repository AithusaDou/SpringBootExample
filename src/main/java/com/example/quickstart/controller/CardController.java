package com.example.quickstart.controller;


import com.example.quickstart.dao.CardDAO;
import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.RightCard;
import com.example.quickstart.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 98100 on 2018/9/10.
 */
@Controller
public class CardController {
    @Resource
    private CardDAO cardDAO;

    @GetMapping("card")
    public String getAll(ModelMap map){
        List<Card> cardList = cardDAO.getCards();
        List<RightCard> rightCardList = cardDAO.getRightCards();
        User user = cardDAO.getUser();
        map.addAttribute("cardList",cardList);
        map.addAttribute("user",user);
        map.addAttribute("rightCardList",rightCardList);
        return "card";
    }


}