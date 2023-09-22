package com.turdiev.projectforsber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Главный класс приложения, отвечающий за его запуск.
 */
@SpringBootApplication
public class ProjectForSberApplication {

    /**
     * Главный метод, который запускает приложение.
     *
     * @param args Аргументы командной строки (не используются в данном приложении).
     */
    public static void main(String[] args) {
        SpringApplication.run(ProjectForSberApplication.class, args);
    }
}
