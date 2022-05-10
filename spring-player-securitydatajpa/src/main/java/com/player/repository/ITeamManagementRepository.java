package com.player.repository;

import com.player.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeamManagementRepository extends JpaRepository<AppUser,Integer> {
    AppUser findByUsername(String username);

}
