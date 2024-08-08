package com.example.SampleAdding.contoller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AddingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdd() throws Exception {
        mockMvc.perform(get("/add/3/5"))
                .andExpect(status().isOk())
                .andExpect(content().string("Sum of 3 and 5 is 8"));
    }

    @Test
    public void testPing() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.startsWith("ping")));
    }
}