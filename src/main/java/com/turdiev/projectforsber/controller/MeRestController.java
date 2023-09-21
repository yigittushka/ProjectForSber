package com.turdiev.projectforsber.controller;

import com.turdiev.projectforsber.entity.Device;;
import com.turdiev.projectforsber.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api")
public class MeRestController {

    private static final Logger logger = LoggerFactory.getLogger(MeRestController.class);

    @Autowired
    private DeviceService DeviceService;


    @GetMapping("/Devices")
    public List <Device> showAllDevice (){
        List<Device> allDevices = DeviceService.getAllDevices();
        logger.info("Вывод всех девайсов: " + allDevices.toString() );
        return allDevices;

    }

    @GetMapping("/Devices/{id}")
    public Device getDeviceId (@PathVariable int id ){
        Device Device = DeviceService.getDeviceId(id);
        logger.info("Вывод по id: " + Device.toString());
        return Device;

    }


    @PutMapping("/Devices/add")
    public Device addNewDevice (@RequestBody Device Device){
        DeviceService.saveDevice(Device);
        logger.info("Добавление: " + Device.toString());
        return Device;
    }

    @PutMapping("/Devices/upd")
    public Device updateDevice (@RequestBody Device Device){
        DeviceService.saveDevice(Device);
        logger.info("Update дивайса: " + Device.toString());
        return Device;
    }

    @DeleteMapping("/Devices/{id}")
    public String deleteDevice(@PathVariable int id){

        Device Device = DeviceService.getDeviceId(id);
        DeviceService.deleteDevice(id);
        return "Device object " + Device.toString() + " was delete";
    }

    @PostMapping("/Devices/name/{name}")
    public List <Device> showAllDevicesByName (@PathVariable String name){
        List<Device> devices = DeviceService.findAllByName(name);
        logger.info("Вывод дивайсов по имени: " + name + " " + devices.toString());
        return  devices;
    }

    @PostMapping("/Devices/model/{model}")
    public List <Device> showAllDevicesByModel (@PathVariable String model){
        List<Device> devices = DeviceService.findAllByModel(model);
        logger.info("Вывод дивайсов по модели: " + model + " " + devices.toString());
        return  devices;
    }
    @PostMapping("/Devices/color/{color}")
    public List <Device> showAllDevicesByColor (@PathVariable String color){
        List<Device> devices = DeviceService.findAllByColor(color);
        logger.info("Вывод дивайсов по цвету: " + color + " " + devices.toString());
        return  devices;
    }
    @PostMapping("/Devices/price/{price}")
    public List <Device> showAllDevicesByPrice (@PathVariable int price){
        List <Device> devices = DeviceService.findAllByPrice(price);
        logger.info("Вывод дивайсов по ценам: " + price + " " + devices.toString());
        return  devices;
    }
    @PostMapping("/Devices/memory/{memory}")
    public List <Device> showAllDevicesByMemory (@PathVariable String memory){
        List<Device> devices = DeviceService.findAllByMemory(memory);
        logger.info("Вывод дивайсов по памяти: " + memory + " " + devices.toString());
        return  devices;
    }


}
