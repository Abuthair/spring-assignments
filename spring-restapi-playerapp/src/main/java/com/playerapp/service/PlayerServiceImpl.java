package com.playerapp.service;

import com.playerapp.exception.PlayerNotFoundException;
import com.playerapp.model.Player;
import com.playerapp.repository.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerServiceImpl implements  IPlayerService{
    @Autowired
    IPlayerRepository iPlayerRepository;
    @Override
    public Player addPlayer(Player player) {
        iPlayerRepository.save(player);
        return player;
    }

    @Override
    public Player updatePlayer(Player player) {
      iPlayerRepository.save(player);
        return player;
    }

    @Override
    public void deletePlayer(int playerId) {
       iPlayerRepository.deleteById(playerId);
    }

    @Override
    public List<Player> getAll() {
        return iPlayerRepository.findAll();
    }

    @Override
    public List<Player> getByName(String name) throws PlayerNotFoundException {
        List<Player> players =iPlayerRepository.findByName(name);
        if (players.isEmpty()){
            throw new PlayerNotFoundException("Player Not Found");
        }
        return players;
    }

    @Override
    public List<Player> getByNameAndSpecialist(String name, String specialist) throws PlayerNotFoundException {
        List<Player> players = iPlayerRepository.findByNameAndSpecialist(name, specialist);
        if (players.isEmpty()){
            throw new PlayerNotFoundException("Player Not Found");
        }
        return players;
    }

    @Override
    public List<Player> getBySpecialist(String specialist) throws PlayerNotFoundException {
        List<Player> players = iPlayerRepository.findBySpecialist(specialist);
        if (players.isEmpty()){
            throw  new PlayerNotFoundException("Player Not Found");
        }
        return players;
    }

    @Override
    public List<Player> getBySpecialistAndBatting(String specialist, String batting) throws PlayerNotFoundException {
        List<Player> players = iPlayerRepository.findBySpecialistAndBatting(specialist, batting);
        if (players.isEmpty()){
            throw  new PlayerNotFoundException("Player Not Found");
        }
        return players;
    }

    @Override
    public List<Player> getBySpecialistAndBowling(String specialist, String bowling) throws PlayerNotFoundException {
        List<Player>  players = iPlayerRepository.findBySpecialistAndBowling(specialist, bowling);
        if (players.isEmpty()){
            throw new PlayerNotFoundException("Player Not Found");
        }
        return players;
    }

    @Override
    public List<Player> getByNameAndBasePrice(String playerName, double basePrice) throws PlayerNotFoundException {
        List<Player> players = iPlayerRepository.findByNameAndBasePrice(playerName, basePrice);
        if (players.isEmpty()){
            throw new PlayerNotFoundException("Player Not Found");
        }
        return players;
    }

    @Override
    public List<Player> getByStateTeam(String stateTeam) throws PlayerNotFoundException {
        List<Player> players =iPlayerRepository.findByStateTeam(stateTeam);
        if (players.isEmpty()){
            throw new PlayerNotFoundException("Player Not Found");
        }
        return players;
    }

    @Override
    public List<Player> getByIplTeam(String iplTeam) throws PlayerNotFoundException {
        List<Player> players =iPlayerRepository.findByIplTeam(iplTeam);
        if (players.isEmpty()){
            throw new PlayerNotFoundException("Player Not Found");
        }
         return players;
    }

    @Override
    public List<Player> getByStateTeamAndIplTeam(String stateTeam, String iplTeam) throws PlayerNotFoundException {
        List<Player> players =iPlayerRepository.findByStateTeamAndIplTeam(stateTeam, iplTeam);
        if (players.isEmpty()){
            throw new PlayerNotFoundException("Player Not Found");
        }
        return  players;
    }
}
