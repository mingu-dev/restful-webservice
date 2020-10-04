package com.example.restful.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoService {

    // 예제의 편의를 위해 DB의 역할은 List로 대체한다.
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;
    static {
        users.add(new User(1, "tester1", new Date()));
        users.add(new User(2, "tester2", new Date()));
        users.add(new User(3, "tester3", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }
}
