package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.dao.UserRepository;
import com.geekster.UserManagementSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;


    public List<User> getAllUsers() {
        return  userRepository.getUserList();

    }

    public String addUserData(User user) {
        boolean flag = userRepository.addUser(user);
        if(flag){
            return "User Regestered Sucessfully!!!!!!!";
        }else{
            return "Failed To add Userdata!!!!!!!";
        }
    }

    public User getUserById(String userID) {
        List<User> currentUserList = userRepository.getUserList();
        for(User user :currentUserList){
            if(user.getUserID().equals(userID)){
                return user;
            }
        }
        return null;
    }

    public String deleteAllUser() {
        return userRepository.deleteUserData();
    }

    public String deleteUserById(String userID) {
        boolean deleteResponse =false;
        String status;
        if(userID!=null){
            List<User> currentUserList =userRepository.getUserList();
            for(User u :currentUserList){
                if(u.getUserID().equals(userID)){
                    deleteResponse = userRepository.removeUser(u);
                    if(deleteResponse){
                        status = "User with UserID : "+userID+" was removed from User Database Sucessfully";
                    }else{
                        status = "Failed to remover User with UserID : "+userID+" !!!!!!";
                    }
                    return status;
                }

            }
            return "Sorry User with UserID : "+userID+" Does not exist in User Database.";
        }else{
            return "Please Enter Valid UserID and Try Again!!!!!!!!!!!!";
        }
    }

    public String updateUserByID(String userID, String newNumber) {
        boolean flag= false;
        String updateStatus;
        User updatedUser=new User();
        List<User> currentList = userRepository.getUserList();
        if(userID!=null) {
            for (User user : currentList) {
                if (user.getUserID().equals(userID)) {
                    updatedUser = user;
                    flag = true;
                    userRepository.removeUser(user);
                    break;
                }
            }
            if(flag){
                updatedUser.setPhoneNumber(newNumber);
                userRepository.addUser(updatedUser);
                updateStatus = "Phone Number of "+updatedUser.getName()+" Updated Sucessfully";
            }else {
                updateStatus ="User with UserId : "+userID+" does not exist";
            }
        }else{
            return "pleas Enter Valid UserID";
        }

        return updateStatus;
    }
}
