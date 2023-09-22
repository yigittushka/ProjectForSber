# ProjectForSber - это простое веб-приложение на Java, использующее Spring Framework и JPA для управления информацией об устройствах в магазине. 
Приложение предоставляет API для работы с устройствами, такими как смартфоны, планшеты и другие электронные устройства.

Приложение будет доступно по адресу `http://localhost:8080`.

## Основные компоненты
Проект состоит из нескольких основных компонентов:

- **MeRestController**: Контроллер, который обрабатывает HTTP запросы и предоставляет API для получения, создания, обновления и удаления устройств.

- **DeviceService**: Интерфейс сервиса, определяющий методы для работы с устройствами.

- **DeviceServiceImpl**: Реализация интерфейса `DeviceService`, которая предоставляет конкретную логику для работы с устройствами.

- **DeviceRepository**: Репозиторий JPA, который обеспечивает доступ к данным об устройствах в базе данных.

- **Device**: Класс-сущность JPA, представляющий устройство в системе.

- **ProjectForSberApplication**: Главный класс приложения, который запускает Spring Boot приложение.


## Использование API
Приложение предоставляет следующие API endpoints:

- `GET /api/Devices`: Получить список всех устройств.

- `GET /api/Devices/{id}`: Получить устройство по его ID.

- `PUT /api/Devices/add`: Добавить новое устройство.

- `PUT /api/Devices/upd`: Обновить информацию об устройстве.

- `DELETE /api/Devices/{id}`: Удалить устройство по его ID.

- `POST /api/Devices/name/{name}`: Поиск устройств по имени.

- `POST /api/Devices/model/{model}`: Поиск устройств по модели.

- `POST /api/Devices/color/{color}`: Поиск устройств по цвету.

- `POST /api/Devices/price/{price}`: Поиск устройств по цене.

- `POST /api/Devices/memory/{memory}`: Поиск устройств по объему памяти.

Вы можете использовать любой инструмент для отправки HTTP запросов (например, Postman) для взаимодействия с API.


# Конфигурация базы данных

## Приложение использует базу данных MySQL. Ниже приведены настройки базы данных, которые вы можете установить в файле application.properties:
- `spring.datasource.url=jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=UTC`
- `spring.datasource.username=bestuser`
- `spring.datasource.password=bestuser`


## Управление конечными точками (endpoints) Actuator
Вы можете управлять конечными точками Actuator, добавив следующие настройки в файл application.properties:
- `management.endpoint.health.show-details=always`
- `management.endpoints.web.exposure.include=*`


## Создайте базу данных MySQL с именем `my_db`, а затем выполните SQL-скрипт для создания таблицы и вставки начальных данных:
```sql
USE my_db;

CREATE TABLE market (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(35),
  model varchar(35),
  color varchar(30),
  price int,
  memory varchar(30),
  PRIMARY KEY (id)
);

INSERT INTO my_db.market (name, model, color, price, memory)
VALUES
  ('Iphone_PROMAX', '15', 'Red', 500, '256g'),
  ('Ipad_PRO', '11', 'Blue', 700, '1024g'),
  ('MacBook', '16', 'Gray', 850, '2048g'),
  ('Samsung_Galaxy_S21', 'S21', 'Black', 600, '256g'),
  ('Samsung_Galaxy_Tab_S7', 'S7', 'Silver', 800, '512g'),
  ('Dell_XPS_13', 'XPS_13', 'Silver', 1000, '512g'),
  ('HP_Spectre_x360', 'Spectre_x360', 'Rose Gold', 900, '512g'),
  ('Google_Pixel_6', 'Pixel_6', 'Black', 700, '128g'),
  ('Google_Pixelbook', 'Pixelbook', 'Silver', 1200, '512g'),
  ('Lenovo_ThinkPad_X1_Carbon', 'X1_Carbon', 'Black', 1100, '512g'),
  ('Sony_Xperia_1_III', 'Xperia_1_III', 'Purple', 800, '256g'),
  ('Sony_Xperia_Tablet_Z4', 'Tablet_Z4', 'White', 600, '256g'),
  ('Asus_ROG_Zephyrus_G14', 'Zephyrus_G14', 'Gray', 1500, '1024g'),
  ('Acer_Chromebook_14', 'Chromebook_14', 'Silver', 300, '64g');





