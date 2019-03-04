package com.example.base;

import com.example.demo.ContractController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class YamlBase {
    @Before
    public void setUp() throws Exception {
        RestAssuredMockMvc.standaloneSetup(new ContractController());
    }
}
