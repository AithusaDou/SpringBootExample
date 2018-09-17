package com.example.quickstart;

import com.example.quickstart.controller.CardController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * Created by guocui on 2018/9/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CardControllerTest {
    private MockMvc mvc ;
    @Before
    public void setUp() throws Exception {
        mvc= MockMvcBuilders.standaloneSetup(new CardController()).build();

    }

    @Test
    public void getAll() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/card").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
    }

}