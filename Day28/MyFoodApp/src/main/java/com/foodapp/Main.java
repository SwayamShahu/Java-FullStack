package com.foodapp;

import com.foodapp.config.AppConfig;
import com.foodapp.contoller.OrderController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderController controller = ctx.getBean(OrderController.class);
        controller.placeOrder();
    }
}
