package com.turdiev.projectforsber.entity;

import jakarta.persistence.*;

/**
 * Сущность (Entity) для представления устройства (Device) в базе данных.
 */
@Entity
@Table(name = "market")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private int price;

    @Column(name = "memory")
    private String memory;

    /**
     * Конструктор по умолчанию. Инициализирует пустой объект устройства.
     */
    public Device() {
    }

    /**
     * Конструктор для создания экземпляра устройства с указанными параметрами.
     *
     * @param id     Идентификатор устройства.
     * @param name   Название устройства.
     * @param model  Модель устройства.
     * @param color  Цвет устройства.
     * @param price  Цена устройства.
     * @param memory Объем памяти устройства.
     */
    public Device(int id, String name, String model, String color, int price, String memory) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
        this.memory = memory;
    }

    /**
     * Получить идентификатор устройства.
     *
     * @return Идентификатор устройства.
     */
    public int getId() {
        return id;
    }

    /**
     * Установить идентификатор устройства.
     *
     * @param id Идентификатор устройства.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получить название устройства.
     *
     * @return Название устройства.
     */
    public String getName() {
        return name;
    }

    /**
     * Установить название устройства.
     *
     * @param name Название устройства.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получить модель устройства.
     *
     * @return Модель устройства.
     */
    public String getModel() {
        return model;
    }

    /**
     * Установить модель устройства.
     *
     * @param model Модель устройства.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Получить цвет устройства.
     *
     * @return Цвет устройства.
     */
    public String getColor() {
        return color;
    }

    /**
     * Установить цвет устройства.
     *
     * @param color Цвет устройства.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Получить цену устройства.
     *
     * @return Цена устройства.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Установить цену устройства.
     *
     * @param price Цена устройства.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Получить объем памяти устройства.
     *
     * @return Объем памяти устройства.
     */
    public String getMemory() {
        return memory;
    }

    /**
     * Установить объем памяти устройства.
     *
     * @param memory Объем памяти устройства.
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * Переопределенный метод toString для представления устройства в виде строки.
     *
     * @return Строковое представление устройства.
     */
    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", memory='" + memory + '\'' +
                '}';
    }
}
