package com.turdiev.projectforsber.service;


import com.turdiev.projectforsber.dao.DeviceRepository;
import com.turdiev.projectforsber.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceServiceimpl implements DeviceService {



    @Autowired
    private DeviceRepository deviceRepository;
    @Override
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    @Override
    public void saveDevice(Device Device) {
        deviceRepository.save(Device);
    }

    @Override
    public Device getDeviceId(int id) {
        Device device = null;
       Optional <Device> optionalDevice = deviceRepository.findById(id);
       if(optionalDevice.isPresent()){
           device = optionalDevice.get();
       }
        return device;

    }

    @Override
    public void deleteDevice(int id) {
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllByName(String name) {
        List <Device> devices = deviceRepository.findAllByName(name);
        return  devices;
    }

    @Override
    public List<Device> findAllByModel(String model) {
        List <Device> devices = deviceRepository.findAllByModel(model);
        return  devices;
    }

    @Override
    public List<Device> findAllByColor(String color) {
        List <Device> devices = deviceRepository.findAllByColor(color);
        return  devices;
    }

    @Override
    public List <Device> findAllByPrice(int price) {
        List <Device> devices = deviceRepository.findAllByPrice(price);
        return  devices;
    }

    @Override
    public List<Device> findAllByMemory(String memory) {
        List <Device> devices = deviceRepository.findAllByMemory(memory);
        return  devices;
    }
}
