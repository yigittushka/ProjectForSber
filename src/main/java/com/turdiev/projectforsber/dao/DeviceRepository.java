package com.turdiev.projectforsber.dao;

import com.turdiev.projectforsber.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Репозиторий для работы с сущностью Device в базе данных.
 */
@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

    /**
     * Найти все устройства по имени.
     *
     * @param name Имя, по которому выполняется поиск устройств.
     * @return Список устройств с указанным именем.
     */
    public List<Device> findAllByName(String name);

    /**
     * Найти все устройства по модели.
     *
     * @param model Модель, по которой выполняется поиск устройств.
     * @return Список устройств с указанной моделью.
     */
    public List<Device> findAllByModel(String model);

    /**
     * Найти все устройства по цвету.
     *
     * @param color Цвет, по которому выполняется поиск устройств.
     * @return Список устройств с указанным цветом.
     */
    public List<Device> findAllByColor(String color);

    /**
     * Найти все устройства по цене.
     *
     * @param price Цена, по которой выполняется поиск устройств.
     * @return Список устройств с указанной ценой.
     */
    public List<Device> findAllByPrice(int price);

    /**
     * Найти все устройства по объему памяти.
     *
     * @param memory Объем памяти, по которому выполняется поиск устройств.
     * @return Список устройств с указанным объемом памяти.
     */
    public List<Device> findAllByMemory(String memory);
}
