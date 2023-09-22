package com.turdiev.projectforsber.controller;

import com.turdiev.projectforsber.entity.Device;
import com.turdiev.projectforsber.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Контроллер для управления устройствами (Devices) в приложении.
 */
@RestController
@RequestMapping("/api")
public class MeRestController {

    private static final Logger logger = LoggerFactory.getLogger(MeRestController.class);

    @Autowired
    private DeviceService deviceService;

    /**
     * Получить список всех устройств.
     *
     * @return Список всех устройств.
     */
    @GetMapping("/Devices")
    public List<Device> showAllDevice() {
        List<Device> allDevices = deviceService.getAllDevices();
        logger.info("Вывод всех девайсов: " + allDevices.toString());
        return allDevices;
    }

    /**
     * Получить устройство по его идентификатору (ID).
     *
     * @param id Идентификатор устройства.
     * @return Устройство с указанным ID.
     */
    @GetMapping("/Devices/{id}")
    public Device getDeviceId(@PathVariable int id) {
        Device device = deviceService.getDeviceId(id);
        logger.info("Вывод по ID: " + device.toString());
        return device;
    }

    /**
     * Добавить новое устройство.
     *
     * @param device Новое устройство, которое нужно добавить.
     * @return Добавленное устройство.
     */
    @PutMapping("/Devices/add")
    public Device addNewDevice(@RequestBody Device device) {
        deviceService.saveDevice(device);
        logger.info("Добавление: " + device.toString());
        return device;
    }

    /**
     * Обновить существующее устройство.
     *
     * @param device Устройство с обновленными данными.
     * @return Обновленное устройство.
     */
    @PutMapping("/Devices/upd")
    public Device updateDevice(@RequestBody Device device) {
        deviceService.saveDevice(device);
        logger.info("Update дивайса: " + device.toString());
        return device;
    }

    /**
     * Удалить устройство по его идентификатору (ID).
     *
     * @param id Идентификатор устройства, которое нужно удалить.
     * @return Сообщение об удалении устройства.
     */
    @DeleteMapping("/Devices/{id}")
    public String deleteDevice(@PathVariable int id) {
        Device Device = deviceService.getDeviceId(id);
        deviceService.deleteDevice(id);
        return "Устройство " + Device.toString() + " было удалено";
    }

    /**
     * Получить список устройств по их названию.
     *
     * @param name Название устройства для поиска.
     * @return Список устройств с указанным названием.
     */
    @PostMapping("/Devices/name/{name}")
    public List<Device> showAllDevicesByName(@PathVariable String name) {
        List<Device> devices = deviceService.findAllByName(name);
        logger.info("Вывод дивайсов по имени: " + name + " " + devices.toString());
        return devices;
    }


    /**
     * Получить список устройств по их модели.
     *
     * @param model Модель устройства для поиска.
     * @return Список устройств с указанной моделью.
     */
    @PostMapping("/Devices/model/{model}")
    public List<Device> showAllDevicesByModel(@PathVariable String model) {
        List<Device> devices = deviceService.findAllByModel(model);
        logger.info("Вывод дивайсов по модели: " + model + " " + devices.toString());
        return devices;
    }


    /**
     * Получить список устройств по их цвету.
     *
     * @param color Цвет устройства для поиска.
     * @return Список устройств с указанным цветом.
     */
    @PostMapping("/Devices/color/{color}")
    public List <Device> showAllDevicesByColor (@PathVariable String color){
        List<Device> devices = deviceService.findAllByColor(color);
        logger.info("Вывод дивайсов по цвету: " + color + " " + devices.toString());
        return  devices;
    }


    /**
     * Получить список устройств по их цене.
     *
     * @param price Цена устройства для поиска.
     * @return Список устройств с указанной ценой.
     */
    @PostMapping("/Devices/price/{price}")
    public List<Device> showAllDevicesByPrice(@PathVariable int price) {
        List<Device> devices = deviceService.findAllByPrice(price);
        logger.info("Вывод дивайсов по ценам: " + price + " " + devices.toString());
        return devices;
    }


        /**
         * Получить список устройств по их объему памяти.
         *
         * @param memory Объем памяти устройства для поиска.
         * @return Список устройств с указанным объемом памяти.
         */
        @PostMapping("/Devices/memory/{memory}")
        public List<Device> showAllDevicesByMemory(@PathVariable String memory) {
            List<Device> devices = deviceService.findAllByMemory(memory);
            logger.info("Вывод дивайсов по памяти: " + memory + " " + devices.toString());
            return devices;
        }
}
