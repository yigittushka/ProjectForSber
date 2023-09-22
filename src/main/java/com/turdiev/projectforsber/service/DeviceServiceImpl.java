package com.turdiev.projectforsber.service;

import com.turdiev.projectforsber.dao.DeviceRepository;
import com.turdiev.projectforsber.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Реализация интерфейса DeviceService для работы с устройствами (Device).
 */
@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    /**
     * Получить список всех устройств.
     *
     * @return Список всех устройств.
     */
    @Override
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    /**
     * Сохранить устройство.
     *
     * @param device Устройство для сохранения.
     */
    @Override
    public void saveDevice(Device device) {
        deviceRepository.save(device);
    }

    /**
     * Получить устройство по его идентификатору.
     *
     * @param id Идентификатор устройства.
     * @return Устройство с указанным идентификатором или null, если не найдено.
     */
    @Override
    public Device getDeviceId(int id) {
        Device device = null;
        Optional<Device> optionalDevice = deviceRepository.findById(id);
        if (optionalDevice.isPresent()) {
            device = optionalDevice.get();
        }
        return device;
    }

    /**
     * Удалить устройство по его идентификатору.
     *
     * @param id Идентификатор устройства.
     */
    @Override
    public void deleteDevice(int id) {
        deviceRepository.deleteById(id);
    }

    /**
     * Найти устройства по имени.
     *
     * @param name Имя, по которому выполняется поиск устройств.
     * @return Список устройств с указанным именем.
     */
    @Override
    public List<Device> findAllByName(String name) {
        return deviceRepository.findAllByName(name);
    }

    /**
     * Найти устройства по модели.
     *
     * @param model Модель, по которой выполняется поиск устройств.
     * @return Список устройств с указанной моделью.
     */
    @Override
    public List<Device> findAllByModel(String model) {
        return deviceRepository.findAllByModel(model);
    }

    /**
     * Найти устройства по цвету.
     *
     * @param color Цвет, по которому выполняется поиск устройств.
     * @return Список устройств с указанным цветом.
     */
    @Override
    public List<Device> findAllByColor(String color) {
        return deviceRepository.findAllByColor(color);
    }

    /**
     * Найти устройства по цене.
     *
     * @param price Цена, по которой выполняется поиск устройств.
     * @return Список устройств с указанной ценой.
     */
    @Override
    public List<Device> findAllByPrice(int price) {
        return deviceRepository.findAllByPrice(price);
    }

    /**
     * Найти устройства по объему памяти.
     *
     * @param memory Объем памяти, по которому выполняется поиск устройств.
     * @return Список устройств с указанным объемом памяти.
     */
    @Override
    public List<Device> findAllByMemory(String memory) {
        return deviceRepository.findAllByMemory(memory);
    }
}
