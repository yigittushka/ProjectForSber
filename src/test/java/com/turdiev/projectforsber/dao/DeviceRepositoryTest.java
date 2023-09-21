package com.turdiev.projectforsber.dao;

import com.turdiev.projectforsber.dao.DeviceRepository;
import com.turdiev.projectforsber.entity.Device;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class DeviceRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private DeviceRepository deviceRepository;

    @BeforeEach
    public void init() {
        // Начальная настройка перед каждым тестом (если необходимо)
    }

    @Test
    public void testFindAllByName() {
        // Arrange
        Device device1 = new Device(1, "Device1", "Model1", "Red", 100, "4GB");
        Device device2 = new Device(2, "Device2", "Model2", "Blue", 200, "8GB");
        entityManager.persist(device1);
        entityManager.persist(device2);

        // Act
        List<Device> result = deviceRepository.findAllByName("Device1");

        // Assert
        assertEquals(1, result.size());
        assertEquals("Device1", result.get(0).getName());
    }

    @Test
    public void testFindAllByModel() {
        // Тест метода findAllByModel репозитория
    }

    @Test
    public void testFindAllByColor() {
        // Тест метода findAllByColor репозитория
    }

    // Другие тесты для методов репозитория
}
