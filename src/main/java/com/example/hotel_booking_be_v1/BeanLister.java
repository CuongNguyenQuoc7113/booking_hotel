package com.example.hotel_booking_be_v1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BeanLister implements CommandLineRunner {
    private final ApplicationContext applicationContext;

    public BeanLister(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        System.out.println("💡 Danh sách các Bean đã được Spring Boot khởi tạo:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
