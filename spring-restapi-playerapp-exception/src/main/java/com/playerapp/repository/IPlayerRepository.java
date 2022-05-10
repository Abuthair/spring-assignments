package com.playerapp.repository;

import com.playerapp.exception.PlayerNotFoundException;
import com.playerapp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IPlayerRepository extends JpaRepository<Player,Integer> {
    List<Player> findByName(String name);
    @Query("from Player p where p.name=?1 and p.specialist=?2")
    List<Player> findByNameAndSpecialist(String name, String specialist);
    List<Player> findBySpecialist(String specialist);
    @Query("from Player p where p.specialist=?1 and p.batting=?2")
    List<Player> findBySpecialistAndBatting(String specialist, String batting);
    @Query("from Player p where p.specialist=?1 and p.bowling=?2")
    List<Player> findBySpecialistAndBowling(String specialist, String bowling);
    @Query("from Player p where p.name=?1 and p.basePrice=?2")
    List<Player> findByNameAndBasePrice(String playerName,double basePrice);
    List<Player> findByStateTeam(String stateTeam);
    List<Player> findByIplTeam(String iplTeam);
    @Query("from Player p where p.stateTeam=?1 and p.iplTeam=?2")
    List<Player> findByStateTeamAndIplTeam(String stateTeam,String iplTeam);
}
