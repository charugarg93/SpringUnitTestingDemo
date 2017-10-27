package com.intuit.demo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@WebMvcTest(MyController.class)
public class MyControllerTest {

    @MockBean
    private MyController myController;

    @MockBean
    private Maths maths;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void doSum() throws Exception {
        when(myController.doSum(10,20)).thenReturn(30);
        when(maths.sum(10,20)).thenReturn(30);
        mockMvc.perform(get("/sum/10/20")).andExpect(status().isOk()).andExpect(content().string("30"));
    }

}