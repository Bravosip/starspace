package com.summer.starspace;

import com.summer.starspace.web.HelloController;
import com.summer.starspace.web.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class StarspaceApplicationTests2 {
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController(),new UserController()).build();
    }

    @Test
    public void testIndex(){
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON))
                    .andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("Hello,World!"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUser() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/users/")
                .param("id","101")
                .param("name","小明").param("age","90");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content().string("success"));
        requestBuilder = MockMvcRequestBuilders.post("/users/")
                .param("id","102")
                .param("name","小刚").param("age","20");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.content().string("success"));
        requestBuilder = MockMvcRequestBuilders.get("/users/");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
        requestBuilder = MockMvcRequestBuilders.put("/users/101")
                .param("name", "测试终极大师")
                .param("age", "30");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("success"));
        requestBuilder = MockMvcRequestBuilders.get("/users/");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
        requestBuilder = MockMvcRequestBuilders.delete("/users/101");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());
        requestBuilder = MockMvcRequestBuilders.get("/users/");
        mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk());

    }

}
