//package com.turdiev.projectforsber.service;
//
//import com.turdiev.projectforsber.dao.DeviceRepository;
//import com.turdiev.projectforsber.entity.Device;
//import com.turdiev.projectforsber.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//public class DeviceServiceimplTest {
//
//    @InjectMocks
//    private DeviceService deviceService = new DeviceServiceImpl();
//
//    @Mock
//    private DeviceRepository deviceRepository;
//
//    @BeforeEach
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testGetAllDevices() {
//        // Arrange
//        List<Device> devices = new ArrayList<>();
//        devices.add(new Device(1, "Device1", "Model1", "Red", 100, "4GB"));
//        devices.add(new Device(2, "Device2", "Model2", "Blue", 200, "8GB"));
//
//        when(deviceRepository.findAll()).thenReturn(devices);
//
//        // Act
//        List<Device> result = deviceService.getAllDevices();
//
//        // Assert
//        assertEquals(2, result.size());
//    }
//
//    @Test
//    public void testGetDeviceById() {
//        // Arrange
//        int deviceId = 1;
//        Device device = new Device(deviceId, "Device1", "Model1", "Red", 100, "4GB");
//
//        when(deviceRepository.findById(deviceId)).thenReturn(Optional.of(device));
//
//        // Act
//        Device result = deviceService.getDeviceId(deviceId);
//
//        // Assert
//        assertEquals(deviceId, result.getId());
//    }
//
//    @Test
//    public void testSaveDevice() {
//        // Arrange
//        Device device = new Device(1, "Device1", "Model1", "Red", 100, "4GB");
//
//        // Act
//        deviceService.saveDevice(device);
//
//        // Assert
//        verify(deviceRepository, times(1)).save(device);
//    }
//
//    @Test
//    public void testDeleteDevice() {
//        // Arrange
//        int deviceId = 1;
//        Device device = new Device(deviceId, "Device1", "Model1", "Red", 100, "4GB");
//
//        when(deviceRepository.findById(deviceId)).thenReturn(Optional.of(device));
//
//        // Act
//        deviceService.deleteDevice(deviceId);
//
//        // Assert
//        verify(deviceRepository, times(1)).deleteById(deviceId);
//    }
//
//    // Другие тесты для методов сервиса
//}
