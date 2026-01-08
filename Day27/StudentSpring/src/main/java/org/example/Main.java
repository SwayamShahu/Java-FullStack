package org.example;

import beans.*;
import config.AnnotationConfig;
import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] arg){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Sim s = ctx.getBean("jio", Sim.class);
//        s.calling();

        Sim s2 = ctx.getBean("airtel", Sim.class);
        s2.calling();

//        User u1 = new User("Nagpur", "Rajesh");
//
//        u1.setSim(s2);
//        System.out.println(u1);

        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
//        User u1 = ctx2.getBean(User.class);
//        u1.setSim(s2);
//        System.out.println(u1);
//
//        Engine engine = ctx.getBean("engine", Engine.class);
//        Car car1 = ctx2.getBean(Car.class);
//        car1.setEngine(engine);
//
//        car1.setCarNumber("MH 31 BE 2056");
//        car1.setSeats("4");
//        car1.setColor("Red");
//
//        System.out.println(car1);

        ApplicationContext ctx3 = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        CarExtra car1 = ctx3.getBean(CarExtra.class);
        car1.carStart();
//        EngineExtra engine1 = ctx3.getBean(EngineExtra.class);
//        engine1.enigneStart();
    }
}
