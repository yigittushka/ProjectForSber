package com.turdiev.projectforsber.service;



import com.turdiev.projectforsber.entity.Device;

import java.util.List;

public interface DeviceService {
    public List<Device> getAllDevices();

    public void saveDevice (Device Device);

    public Device getDeviceId (int id);

    public void deleteDevice(int id);

    public List <Device> findAllByName (String name);

    public List<Device> findAllByModel (String model);
    public List<Device> findAllByColor (String color);
    public List <Device> findAllByPrice (int price);
    public List<Device> findAllByMemory (String memory);
}
