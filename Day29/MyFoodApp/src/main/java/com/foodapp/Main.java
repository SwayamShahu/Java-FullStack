package com.foodapp;

import com.foodapp.config.AppConfig;
import com.foodapp.contoller.OrderController;
import com.foodapp.dao.InventoryDao;
import com.foodapp.dao.UserDao;
import com.foodapp.model.Inventory;
import com.foodapp.model.User;
import com.mysql.cj.jdbc.Driver;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderController controller = ctx.getBean(OrderController.class);
//        controller.placeOrder();

//        String statement = "select * from student";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "swayam2004");
//
//        Statement st = com.createStatement();
//
//        ResultSet rs = st.executeQuery(statement);
//
//        while ((rs.next())){
//            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4) + " ");
//        }
//
//        rs.close();
//        st.close();
//        com.close();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);

//        InventoryDao inventoryDao = new InventoryDao(jdbcTemplate);
//        Inventory inventory = new Inventory(1, 500.0, "Inventory1");
//        inventoryDao.save(inventory);
//
//        System.out.println(inventoryDao.findAll());

        UserDao userDao = new UserDao(jdbcTemplate);
        User user = new User(1, "swayamshahu15@gmail.com", "Swayam", "Customer");
//        userDao.saveUser(user);

        User u = userDao.findById(1);
        System.out.println(u.toString());
    }
}
