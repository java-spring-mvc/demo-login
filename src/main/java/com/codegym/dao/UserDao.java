package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("tien");
        u1.setEmail("havantien95tb@gmail.com");
        u1.setAccount("tienhv");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(12);
        u2.setName("hihi");
        u2.setEmail("abc@gmail.com");
        u2.setAccount("tien");
        u2.setPassword("123456");
        users.add(u2);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())) {
                return u;
                }
            }
                return null;
            }

}
