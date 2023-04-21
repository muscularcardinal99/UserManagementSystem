package com.geekster.UserManagementSystem.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userID;
    private String name;
    private String userName;
    private String Address;
    private String phoneNumber;
}
