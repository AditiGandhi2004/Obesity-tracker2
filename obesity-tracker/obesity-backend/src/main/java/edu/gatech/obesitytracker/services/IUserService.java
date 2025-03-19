package edu.gatech.obesitytracker.services;

import edu.gatech.obesitytracker.entities.User;
import edu.gatech.obesitytracker.web.dto.UserProfileDto;
import edu.gatech.obesitytracker.web.dto.UserRegistrationDto;

public interface IUserService {
    User findByEmail(String email);
    User saveRegisteredUser(User user);
    boolean emailExists(String email);
    User registerNewAccount(UserRegistrationDto userDto);
    void updateUserAccount(User user, UserProfileDto profileDto);
    UserProfileDto getUserProfile(User user);
}
