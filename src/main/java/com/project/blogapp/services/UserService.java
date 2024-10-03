package com.project.blogapp.services;
import com.project.blogapp.entities.User;
import com.project.blogapp.payloads.UserDto;
import java.util.List;
public interface UserService {
 UserDto createUser(UserDto user);
UserDto updateUser(UserDto user, Integer userId);
UserDto getUserById(Integer userId);
List<UserDto> getAllUsers();
void deleteUser(Integer userId);
}
