package com.turdiev.projectforsber.dao;


import com.turdiev.projectforsber.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository <Device, Integer> {
    public List<Device> findAllByName (String name);
    public List<Device> findAllByModel (String model);
    public List<Device> findAllByColor (String color);
    public List <Device> findAllByPrice (int price);
    public List<Device> findAllByMemory (String memory);
}
