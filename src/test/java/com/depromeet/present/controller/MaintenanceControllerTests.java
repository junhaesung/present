package com.depromeet.present.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class MaintenanceControllerTests {
    private MockMvc mockMvc;
    private MaintenanceController maintenanceController = new MaintenanceController();

    @Test
    public void testCheckHealth() throws Exception {
        // given
        mockMvc = MockMvcBuilders.standaloneSetup(maintenanceController)
                .build();
        // when
        // then
        mockMvc.perform(get("/l7check"))
                .andExpect(status().isOk())
                .andExpect(content().string("OK"));
    }
}
