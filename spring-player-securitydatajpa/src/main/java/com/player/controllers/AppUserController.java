package com.player.controllers;

import com.player.model.AppUser;
import com.player.service.IPlayerService;
import com.player.service.ITeamManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
@RestController
public class AppUserController {
    private PasswordEncoder passwordEncoder;
private ITeamManagementService iTeamManagementService;
@Autowired
    public void setiTeamManagementService(ITeamManagementService iTeamManagementService) {
        this.iTeamManagementService = iTeamManagementService;
    }



    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/")
    public ResponseEntity<String> addUser(@RequestBody AppUser user){
        String username = user.getUsername();
        String password = passwordEncoder.encode(user.getPassword());
        AppUser appUser = new AppUser(username,password);
       iTeamManagementService.addManagement(appUser);
        return ResponseEntity.ok("User added");
    }

    @PutMapping("/")
    public ResponseEntity<String> updateUser(@RequestBody AppUser user){
        int userId = user.getUserId();
        String username = user.getUsername();
        String password = passwordEncoder.encode(user.getPassword());
        AppUser appUser = new AppUser(userId,username,password);
       iTeamManagementService.updateManagement(appUser);
        return ResponseEntity.ok("User updated");
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id")int userid){
       iTeamManagementService.deleteManagement(userid);
        return ResponseEntity.ok("User has been deleted");
    }}
