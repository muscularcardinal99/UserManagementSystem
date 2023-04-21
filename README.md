
# Hi, I'm Abhishek Kushwaha! 👋


## Authors

- [@muscularcardinal99](https://www.github.com/muscularcardinal99)


## 🚀 About Me
I'm a Java developer...


## 🛠 Skills
Java, HTML, Springboot, MySQL...


# User Management System

This Spring project is a user management system with CRUD operations for managing user information. The system includes attributes for UserId, Name, UserName, Address, and Phone Number. The application allows for adding, updating, and deleting user data. The project can be used as a template for creating a user management system and can be customized further to fit specific business needs.


## DataFlowStructure
in the following Java Program  

~~~
1.Controller
  1.addUser()
  2.updateUserPhoneNumberById()
  3.getAllUser()
  4.getUserByUserId()
  5.deleteAllUser()
  6.deleteSingleUserByUserId()
2.DAO/Repository
  1.addUser()
  2.getUserList()
  3.deleteUserData()
  4.removeUser()
3.Services
  1.addUserData()
  2.getUserById
  3.deleteAllUser
  4.deleteUserById
  5.updateUserByID
4.Model/DataBase Design
  1.This class contains user Model and its Properties
~~~


## API Reference



#### Add User

```http
  localhost:8080/addUser
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Request Body` | `JSON` | **Required**. a user of type object in JSON format |

#### Update User

```http
  localhost:8080/updateUserInfo/{userID}/{newNumber}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Path Parameter` | `string` | **Required**. a userID and newNumber |

#### Get All User

```http
 localhost:8080/getAllUser
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `none`      | `N/A` | Returns All user data              |




#### Get User by Id

```http
 localhost:8080/getUser/{userID}
```

| Parameter | Type     | Description                                                     |
| :-------- | :------- | :-------------------------------------------------------------- |
| `Path Parameter'      | `string` | Returns user data where userID matches with provided                             userID *Required* userID  |


#### Delete User by Id

```http
 localhost:8080//deleteUser/{userID}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Path Parameter      | `string` | Deletes user data where userID matches with provided userID *Required* userID  |


#### Deletes DataBase

```http
localhost:8080/deleteAllUser
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `None`      | `N/A` | **Purge**. Deletes All the entry made  |


## Documentation

This Spring project is a user management system that enables CRUD operations to manage user
information. UserId, Name, UserName, Address, and Phone Number attributes are all present in the 
system. User data can be added, updated, and deleted via the programme. From small start-ups to huge 
companies, a variety of businesses can utilise the system to manage user data. The Spring framework, 
which offers a variety of features and tools to construct reliable and scalable applications, is used in this 
project. The application is secured with Spring Security, which also enables user authentication and 
authorization.

The user interface is created with the end user in mind, making it simple to utilise the system and carry 
out different tasks. It is simple to locate particular users based on specified criteria thanks to the 
interface's search and filtering options. Additionally, the programme is made to be responsive, enabling 
access from a variety of platforms, including desktops, laptops, and mobile ones.

The project is easily adaptable to meet unique corporate requirements. For instance, extra properties, 
such email addresses or dates of birth, can be added to the user model to hold more user information. 
The application can be altered to handle several user types with various levels of system access, such as 
administrators or managers.


In conclusion,
The user management system developed for this Spring project is strong and adaptable, and it can be 
applied to a variety of enterprises. This project offers a strong framework for handling user data with 
capabilities including CRUD operations, user authentication and authorisation, and a user-friendly 
interface. The project can be readily modified to meet unique business requirements and expanded to 
offer more features and capabilities.




## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/muscularcardinal99/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/LoneWolf_ak99)


## Feedback

If you have any feedback, please reach out to us at kushwaha.abhishek1999@gmail.com
