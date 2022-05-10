package com.playerapp.service;

import com.playerapp.exception.PlayerNotFoundException;
import com.playerapp.model.Player;

import java.util.List;

public interface IPlayerService {
        public void addPlayer(Player player);
    public void updatePlayer(Player player);
    public void deletePlayer(int playerId);

    public List<Player> getAll();
    List<Player> getByName(String name)throws PlayerNotFoundException;
    List<Player> getByNameAndSpecialist(String name, String specialist)throws PlayerNotFoundException;
    List<Player> getBySpecialist(String specialist) throws PlayerNotFoundException;
    List<Player> getBySpecialistAndBatting(String specialist, String batting) throws PlayerNotFoundException;
    List<Player> getBySpecialistAndBowling(String specialist, String bowling) throws PlayerNotFoundException;
    List<Player> getByNameAndBasePrice(String playerName,double basePrice) throws PlayerNotFoundException;
    List<Player> getByStateTeam(String stateTeam)throws PlayerNotFoundException;
    List<Player> getByIplTeam(String iplTeam)throws PlayerNotFoundException;
    List<Player> getByStateTeamAndIplTeam(String stateTeam,String iplTeam)throws PlayerNotFoundException;
}
