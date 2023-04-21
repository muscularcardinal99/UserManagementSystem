package com.geekster.UserManagementSystem.dao;

import com.geekster.UserManagementSystem.model.User;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;
@Repository
public class UserRepository {

    private List<User> userList ;

    public UserRepository() {
        userList = new ArrayList<>();
        userList.add(new User("000","DefaultUser for testing","Default","N/A","NIL"));
    }

    public boolean addUser(User user) {
        userList.add(user);
        return true;
    }

    public List<User> getUserList() {
        return userList;
    }

    public String deleteUserData() {
        userList.clear();
        return "All User Data Deleted!!!!!!!!!";
    }

    public boolean removeUser(User u) {
        userList.remove(u);
        return true;
    }
}
