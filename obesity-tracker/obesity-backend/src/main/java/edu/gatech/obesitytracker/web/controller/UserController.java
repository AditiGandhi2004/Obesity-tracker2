package edu.gatech.obesitytracker.web.controller;

import edu.gatech.obesitytracker.entities.User;
import edu.gatech.obesitytracker.sec.AuthenticatedUser;
import edu.gatech.obesitytracker.services.UserService;
import edu.gatech.obesitytracker.web.dto.UserProfileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UserProfileDto> getUserProfile(@AuthenticatedUser User user) throws Exception {
        final UserProfileDto dto = this.userService.getUserProfile(user);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PatchMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UserProfileDto> updateUserProfile(@AuthenticatedUser User user,
                                                            @RequestBody UserProfileDto request) throws Exception {
        this.userService.updateUserAccount(user, request);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
