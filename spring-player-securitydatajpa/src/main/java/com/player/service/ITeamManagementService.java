package com.player.service;

import com.player.model.AppUser;

public interface ITeamManagementService {
    void addManagement(AppUser user);
    void updateManagement(AppUser user);
    void deleteManagement(int userId);
}
