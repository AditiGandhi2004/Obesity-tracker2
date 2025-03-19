package edu.gatech.obesitytracker.sec;

import edu.gatech.obesitytracker.entities.User;
import edu.gatech.obesitytracker.services.IUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private final IUserService userService;

    public UserDetailsServiceImpl(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        final User user = this.userService.findByEmail(email);
        if(user == null) {
            throw new UsernameNotFoundException("User '" + email + "' not found");
        }

        return user;

    }

}
