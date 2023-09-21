package com.turdiev.projectforsber.controller;

import com.turdiev.projectforsber.controller.MeRestController;
import com.turdiev.projectforsber.entity.Device;
import com.turdiev.projectforsber.service.DeviceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class MeRestControllerTest {

    @InjectMocks
    private MeRestController meRestController;

    @Mock
    private DeviceService deviceService;

    private MockMvc mockMvc;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(meRestController).build();
    }

    @Test
    public void testShowAllDevice() throws Exception {
        // Тест метода showAllDevice контроллера
    }

    @Test
    public void testGetDeviceId() throws Exception {
        // Тест метода getDeviceId контроллера
    }

    @Test
    public void testAddNewDevice() throws Exception {
        // Тест метода addNewDevice контроллера
    }

    @Test
    public void testUpdateDevice() throws Exception {
        // Тест метода updateDevice контроллера
    }

    @Test
    public void testDeleteDevice() throws Exception {
        // Тест метода deleteDevice контроллера
    }

    // Другие тесты для методов контроллера
}
