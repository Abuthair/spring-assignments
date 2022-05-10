package com.player.service;

import com.player.model.AppUser;
import com.player.repository.ITeamManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TeamManagementServiceImpl implements ITeamManagementService, UserDetailsService
{
 private ITeamManagementRepository iTeamManagementRepository;
    @Autowired
    public void setiTeamManagementRepository(ITeamManagementRepository iTeamManagementRepository) {
        this.iTeamManagementRepository = iTeamManagementRepository;
    }

    @Override
    public void addManagement(AppUser user) {
        iTeamManagementRepository.save(user);
    }

    @Override
    public void updateManagement(AppUser user) {
    iTeamManagementRepository.save(user);
    }

    @Override
    public void deleteManagement(int userId) {
iTeamManagementRepository.deleteById(userId);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ITeamManagementRepository appUserRepository = null;
        AppUser appUser=appUserRepository.findByUsername(username);
        String nusername=appUser.getUsername();
        String password=appUser.getPassword();
//Set roles for the user
        GrantedAuthority authority = new SimpleGrantedAuthority("USER");
        GrantedAuthority authority1=new SimpleGrantedAuthority("ADMIN");
//create a new user object using UserDetails interface
        UserDetails user=new User(nusername,password, Arrays.asList(authority,authority1));


        return user;
    }
}
